package com.codeclan.example.paintzServer.configs.security;
import com.codeclan.example.paintzServer.models.user.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// user properties need to be mapped to UserPrincipal and UserPrincipalDetails for security
public class UserPrincipal implements UserDetails {

    private User user;

    public UserPrincipal(User user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();

        //this extracts the list of permissions from the user and adds it to these granted authorities
        this.user.getPermissionList().forEach(permission -> {
            GrantedAuthority authority = new SimpleGrantedAuthority(permission);
            authorities.add(authority);
        });

        //this extracts the list of roles from the user and adds it to these granted authorities
        this.user.getRoleList().forEach(role -> {
            GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_" + role);
            authorities.add(authority);
        });

        return authorities;
    }

    // mapping to the User by declaring a user above, including in the constructor, and then accessing the methods on the user
    // delegates the methods, a 'decorator' pattern
    @Override
    public String getPassword() {
        return this.user.getPassword();
    }

    @Override
    public String getUsername() {
        return this.user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.user.getActive() == 1;
    }
}
