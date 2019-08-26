package com.hpt.bean;


public class TimeList {

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


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof TimeList)) return false;

    TimeList timeList = (TimeList) o;

    if (tlno != timeList.tlno) return false;
    if (tno != null ? !tno.equals(timeList.tno) : timeList.tno != null) return false;
    if (releaseTime != null ? !releaseTime.equals(timeList.releaseTime) : timeList.releaseTime != null) return false;
    if (bidTime != null ? !bidTime.equals(timeList.bidTime) : timeList.bidTime != null) return false;
    if (selectTime != null ? !selectTime.equals(timeList.selectTime) : timeList.selectTime != null) return false;
    if (paingTime != null ? !paingTime.equals(timeList.paingTime) : timeList.paingTime != null) return false;
    if (workTime != null ? !workTime.equals(timeList.workTime) : timeList.workTime != null) return false;
    return checkTime != null ? checkTime.equals(timeList.checkTime) : timeList.checkTime == null;
  }

  @Override
  public int hashCode() {
    int result = tlno;
    result = 31 * result + (tno != null ? tno.hashCode() : 0);
    result = 31 * result + (releaseTime != null ? releaseTime.hashCode() : 0);
    result = 31 * result + (bidTime != null ? bidTime.hashCode() : 0);
    result = 31 * result + (selectTime != null ? selectTime.hashCode() : 0);
    result = 31 * result + (paingTime != null ? paingTime.hashCode() : 0);
    result = 31 * result + (workTime != null ? workTime.hashCode() : 0);
    result = 31 * result + (checkTime != null ? checkTime.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "TimeList{" +
            "tlno=" + tlno +
            ", tno='" + tno + '\'' +
            ", releaseTime=" + releaseTime +
            ", bidTime=" + bidTime +
            ", selectTime=" + selectTime +
            ", paingTime=" + paingTime +
            ", workTime=" + workTime +
            ", checkTime=" + checkTime +
            '}';
  }


}
