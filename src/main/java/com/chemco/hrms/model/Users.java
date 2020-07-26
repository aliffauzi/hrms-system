package com.chemco.hrms.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Users implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Id;
    private String userId;
    private  String firstName;
    private String lastName;
    private  String username;
    private String password;
    private String email;
    private String profileImageUrl;
    private Date lastLoginDate;
    private Date lastLoginDisplay;
    private Date joinDate;
    private String roles;
    private String[] authorities;
    private boolean isActive;
    private boolean isNotLocked;

    public Users() { }

    public Users(Long id, String userId, String firstName, String lastName, String username, String password, String email, String profileImageUrl, Date lastLoginDate, Date lastLoginDisplay, Date joinDate, String roles, String[] authorities, boolean isActive, boolean isNotLocked) {
        Id = id;
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.email = email;
        this.profileImageUrl = profileImageUrl;
        this.lastLoginDate = lastLoginDate;
        this.lastLoginDisplay = lastLoginDisplay;
        this.joinDate = joinDate;
        this.roles = roles;
        this.authorities = authorities;
        this.isActive = isActive;
        this.isNotLocked = isNotLocked;
    }

    public Long getId() { return Id; }

    public void setId(Long id) { Id = id; }

    public String getUserId() { return userId; }

    public void setUserId(String userId) { this.userId = userId; }

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getProfileImageUrl() { return profileImageUrl; }

    public void setProfileImageUrl(String profileImageUrl) { this.profileImageUrl = profileImageUrl; }

    public Date getLastLoginDate() { return lastLoginDate; }

    public void setLastLoginDate(Date lastLoginDate) { this.lastLoginDate = lastLoginDate; }

    public Date getLastLoginDisplay() { return lastLoginDisplay; }

    public void setLastLoginDisplay(Date lastLoginDisplay) { this.lastLoginDisplay = lastLoginDisplay; }

    public Date getJoinDate() { return joinDate; }

    public void setJoinDate(Date joinDate) { this.joinDate = joinDate; }

    public String getRoles() { return roles; }

    public void setRoles(String roles) { this.roles = roles; }

    public String[] getAuthorities() { return authorities; }

    public void setAuthorities(String[] authorities) { this.authorities = authorities; }

    public boolean isActive() { return isActive; }

    public void setActive(boolean active) { isActive = active; }

    public boolean isNotLocked() { return isNotLocked; }

    public void setNotLocked(boolean notLocked) { isNotLocked = notLocked;  }
}
