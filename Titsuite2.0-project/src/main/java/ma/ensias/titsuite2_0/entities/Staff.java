package com.sample;


public class Staff {

  private long id;
  private String email;
  private String hashedPassword;
  private String firstName;
  private String lastName;
  private String phoneNumber;
  private java.sql.Date birthDate;
  private String city;
  private String address;
  private String role;
  private String refreshToken;
  private String verificationCode;
  private long isActive;
  private java.sql.Timestamp createdAt;
  private java.sql.Date resendTimeout;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getHashedPassword() {
    return hashedPassword;
  }

  public void setHashedPassword(String hashedPassword) {
    this.hashedPassword = hashedPassword;
  }


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public java.sql.Date getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(java.sql.Date birthDate) {
    this.birthDate = birthDate;
  }


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }


  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }


  public String getVerificationCode() {
    return verificationCode;
  }

  public void setVerificationCode(String verificationCode) {
    this.verificationCode = verificationCode;
  }


  public long getIsActive() {
    return isActive;
  }

  public void setIsActive(long isActive) {
    this.isActive = isActive;
  }


  public java.sql.Timestamp getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }


  public java.sql.Date getResendTimeout() {
    return resendTimeout;
  }

  public void setResendTimeout(java.sql.Date resendTimeout) {
    this.resendTimeout = resendTimeout;
  }

}
