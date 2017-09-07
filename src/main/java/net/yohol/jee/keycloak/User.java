package net.yohol.jee.keycloak;

import java.util.Set;

public class User {
  private String username;
  private String name;
  private String email;
  private String subject;
  private Set<String> roles;
  private Set<String> roles2;

  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }

  public Set<String> getRoles() {
    return roles;
  }
  public void setRoles(Set<String> roles) {
    this.roles = roles;
  }

  public Set<String> getRoles2() {
    return roles2;
  }
  public void setRoles2(Set<String> roles2) {
    this.roles2 = roles2;
  }
}