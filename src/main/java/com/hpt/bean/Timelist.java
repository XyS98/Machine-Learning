package com.hpt.bean;


public class Timelist {

  private int tlno;
  private String tno;
  private java.sql.Date releaseTime;
  private java.sql.Date bidTime;
  private java.sql.Date selectTime;
  private java.sql.Date paingTime;
  private java.sql.Date workTime;
  private java.sql.Date checkTime;


  public int getTlno() {
    return tlno;
  }

  public void setTlno(int tlno) {
    this.tlno = tlno;
  }


  public String getTno() {
    return tno;
  }

  public void setTno(String tno) {
    this.tno = tno;
  }


  public java.sql.Date getReleaseTime() {
    return releaseTime;
  }

  public void setReleaseTime(java.sql.Date releaseTime) {
    this.releaseTime = releaseTime;
  }


  public java.sql.Date getBidTime() {
    return bidTime;
  }

  public void setBidTime(java.sql.Date bidTime) {
    this.bidTime = bidTime;
  }


  public java.sql.Date getSelectTime() {
    return selectTime;
  }

  public void setSelectTime(java.sql.Date selectTime) {
    this.selectTime = selectTime;
  }


  public java.sql.Date getPaingTime() {
    return paingTime;
  }

  public void setPaingTime(java.sql.Date paingTime) {
    this.paingTime = paingTime;
  }


  public java.sql.Date getWorkTime() {
    return workTime;
  }

  public void setWorkTime(java.sql.Date workTime) {
    this.workTime = workTime;
  }


  public java.sql.Date getCheckTime() {
    return checkTime;
  }

  public void setCheckTime(java.sql.Date checkTime) {
    this.checkTime = checkTime;
  }

}
