//package com.codeclan.example.paintzServer.models.user;
//
//import com.codeclan.example.paintzServer.models.paint.PaintInventory;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//@Entity
//@Table(name = "users")
//public class User {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//
//    @Column(name = "email", nullable = false)
//    private String email;
//
//    @Column(name = "password", nullable = false)
//    private String password;
//
//    @Column(name = "roles")
//    private String roles;
//
//    @Column(name = "permissions")
//    private String permissions;
//
//    // can control if user is blocked e.g. after 5 failed log-in attempts
//    @Column(name = "active")
//    private int active;
//
////    private PaintInventory paintInventory;
//
//    public User(String email, String password) {
//        this.email = email;
//        this.password = password;
//        this.roles = "";
//        this.permissions = "permissions";
//        this.active = 1;
////        this.paintInventory = paintInventory;
//    }
//
//    protected User() {}
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public int getActive() {
//        return active;
//    }
//
//    public void setActive(int active) {
//        this.active = active;
//    }
//
//    public String getRoles() {
//        return roles;
//    }
//
//    public void setRoles(String roles) {
//        this.roles = roles;
//    }
//
//    public String getPermissions() {
//        return permissions;
//    }
//
//    public void setPermissions(String permissions) {
//        this.permissions = permissions;
//    }
//
////    public PaintInventory getPaintInventory() {
////        return paintInventory;
////    }
////
////    public void setPaintInventory(PaintInventory paintInventory) {
////        this.paintInventory = paintInventory;
////    }
//
//    public List<String> getRoleList() {
//        if (this.roles.length()> 0) {
//            return Arrays.asList(this.roles.split(","));
//        }
//        return new ArrayList<>();
//    }
//
//    public List<String> getPermissionList() {
//        if (this.permissions.length()> 0) {
//            return Arrays.asList(this.permissions.split(","));
//        }
//        return new ArrayList<>();
//    }
//}
