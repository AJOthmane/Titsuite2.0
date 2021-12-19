package com.sample;


public class Diploma {

  private long id;
  private String name;
  private java.sql.Date acquisitionDate;
  private String field;
  private long freelancerRef;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public java.sql.Date getAcquisitionDate() {
    return acquisitionDate;
  }

  public void setAcquisitionDate(java.sql.Date acquisitionDate) {
    this.acquisitionDate = acquisitionDate;
  }


  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }


  public long getFreelancerRef() {
    return freelancerRef;
  }

  public void setFreelancerRef(long freelancerRef) {
    this.freelancerRef = freelancerRef;
  }

}
