package com.sample;


public class Offers {

  private long id;
  private String description;
  private String city;
  private long minimumWage;
  private String status;
  private long refCustomer;
  private java.sql.Date startDay;
  private String activity;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public long getMinimumWage() {
    return minimumWage;
  }

  public void setMinimumWage(long minimumWage) {
    this.minimumWage = minimumWage;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public long getRefCustomer() {
    return refCustomer;
  }

  public void setRefCustomer(long refCustomer) {
    this.refCustomer = refCustomer;
  }


  public java.sql.Date getStartDay() {
    return startDay;
  }

  public void setStartDay(java.sql.Date startDay) {
    this.startDay = startDay;
  }


  public String getActivity() {
    return activity;
  }

  public void setActivity(String activity) {
    this.activity = activity;
  }

}
