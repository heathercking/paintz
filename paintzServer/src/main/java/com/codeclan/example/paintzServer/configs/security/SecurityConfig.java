package com.codeclan.example.paintzServer.configs.security;

import com.codeclan.example.paintzServer.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    UserPrincipalDetailsService userPrincipalDetailsService;

    @Autowired
    UserRepository userRepository;


    // this one defines data source for the users
    // authorities allow you to get granular with permissions within roles (roles are less flexible but great for simple apps)
    @Override
    protected void configure(AuthenticationManagerBuilder auth) {
        auth.authenticationProvider(myAuthenticationProvider());

//                .inMemoryAuthentication()
//                .withUser("admin@test.com")
//                    .password(passwordEncoder().encode("admin"))
//                    .roles("ADMIN").authorities("ACCESS_ADMIN", "ROLE_ADMIN")
//                .and()
//                .withUser("heather@test.com")
//                    .password(passwordEncoder().encode("password"))
//                    .roles("USER");
    }

    // this one authorises requests
    // order of the antMatchers is important - executed in order
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .cors()
                .configurationSource(request -> new CorsConfiguration().setAllowedOriginPatterns(Arrays.asList("http://localhost:3000")))
//                .configurationSource(request -> new CorsConfiguration().applyPermitDefaultValues())
                .and()
                .csrf().disable() // removes cross site request forgery, makes application lighter, could be added back in?
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS) // removes sessions
                .and()
                .addFilter(new JwtAuthenticationFilter(authenticationManager()))
                .addFilter(new JwtAuthorizationFilter(authenticationManager(), userRepository))
                .authorizeRequests()
                .antMatchers("/login").permitAll()
                .antMatchers("/api/paints").permitAll()
                .antMatchers("/api/users").hasRole("ADMIN")
                .antMatchers("/api/admin").hasRole("ADMIN");


////                .anyRequest().authenticated() // or .permitAll()
//                .antMatchers("/api/paints").permitAll()
////                .antMatchers("/user/**").authenticated()
////                .antMatchers("/admin").hasRole("ADMIN")  // can comma separate multiple roles
//                .antMatchers("/api/users").hasRole("USER")
//                .antMatchers("/api/admin").hasAuthority("ACCESS_ADMIN")
//                .antMatchers("/api/users").hasRole("ADMIN")
//                .and()
//                .httpBasic();
    }

    @Bean
    CorsConfigurationSource corsConfigurationSource() {

        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowCredentials(true);
        configuration.setAllowedOrigins(Arrays.asList("http://localhost:3000/", "http://localhost:8443/"));
        configuration.setAllowedMethods(Arrays.asList("POST", "OPTIONS", "GET", "DELETE", "PUT"));
        configuration.setAllowedHeaders(Arrays.asList("X-Requested-With", "Origin", "Content-Type", "Accept", "Authorization", "Access-Control-Allow-Origin"));
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/api/paints", configuration);
//        FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
//        bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
        return source;
    }



    // setting up an authentication provider, rather than using in-memory authentication
    @Bean
    DaoAuthenticationProvider myAuthenticationProvider() {
        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
        daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
        daoAuthenticationProvider.setUserDetailsService(userPrincipalDetailsService);

        return daoAuthenticationProvider;
    }

    // as of Spring Boot 2, must include password encoder and use it to encode passwords
    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
