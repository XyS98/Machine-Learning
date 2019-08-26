package com.hpt.bean;


public class MemberInfo {

  private int mno;
  private String nickName;
  private String realName;
  private String pwd;
  private String tel;
  private String email;
  private double money;
  private String photo;
  private String zfb;
  private String wx;
  private String bankcard;
  private String regDate;
  private int status;


  public int getMno() {
    return mno;
  }

  public void setMno(int mno) {
    this.mno = mno;
  }


  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }


  public String getRealName() {
    return realName;
  }

  public void setRealName(String realName) {
    this.realName = realName;
  }


  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }


  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public double getMoney() {
    return money;
  }

  public void setMoney(double money) {
    this.money = money;
  }


  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }


  public String getZfb() {
    return zfb;
  }

  public void setZfb(String zfb) {
    this.zfb = zfb;
  }


  public String getWx() {
    return wx;
  }

  public void setWx(String wx) {
    this.wx = wx;
  }


  public String getBankcard() {
    return bankcard;
  }

  public void setBankcard(String bankcard) {
    this.bankcard = bankcard;
  }


  public String getRegDate() {
    return regDate;
  }

  public void setRegDate(String regDate) {
    this.regDate = regDate;
  }


  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof MemberInfo)) return false;

    MemberInfo that = (MemberInfo) o;

    if (mno != that.mno) return false;
    if (Double.compare(that.money, money) != 0) return false;
    if (status != that.status) return false;
    if (nickName != null ? !nickName.equals(that.nickName) : that.nickName != null) return false;
    if (realName != null ? !realName.equals(that.realName) : that.realName != null) return false;
    if (pwd != null ? !pwd.equals(that.pwd) : that.pwd != null) return false;
    if (tel != null ? !tel.equals(that.tel) : that.tel != null) return false;
    if (email != null ? !email.equals(that.email) : that.email != null) return false;
    if (photo != null ? !photo.equals(that.photo) : that.photo != null) return false;
    if (zfb != null ? !zfb.equals(that.zfb) : that.zfb != null) return false;
    if (wx != null ? !wx.equals(that.wx) : that.wx != null) return false;
    if (bankcard != null ? !bankcard.equals(that.bankcard) : that.bankcard != null) return false;
    return regDate != null ? regDate.equals(that.regDate) : that.regDate == null;
  }

  @Override
  public int hashCode() {
    int result;
    long temp;
    result = mno;
    result = 31 * result + (nickName != null ? nickName.hashCode() : 0);
    result = 31 * result + (realName != null ? realName.hashCode() : 0);
    result = 31 * result + (pwd != null ? pwd.hashCode() : 0);
    result = 31 * result + (tel != null ? tel.hashCode() : 0);
    result = 31 * result + (email != null ? email.hashCode() : 0);
    temp = Double.doubleToLongBits(money);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    result = 31 * result + (photo != null ? photo.hashCode() : 0);
    result = 31 * result + (zfb != null ? zfb.hashCode() : 0);
    result = 31 * result + (wx != null ? wx.hashCode() : 0);
    result = 31 * result + (bankcard != null ? bankcard.hashCode() : 0);
    result = 31 * result + (regDate != null ? regDate.hashCode() : 0);
    result = 31 * result + status;
    return result;
  }

  @Override
  public String toString() {
    return "MemberInfo{" +
            "mno=" + mno +
            ", nickName='" + nickName + '\'' +
            ", realName='" + realName + '\'' +
            ", pwd='" + pwd + '\'' +
            ", tel='" + tel + '\'' +
            ", email='" + email + '\'' +
            ", money=" + money +
            ", photo='" + photo + '\'' +
            ", zfb='" + zfb + '\'' +
            ", wx='" + wx + '\'' +
            ", bankcard='" + bankcard + '\'' +
            ", regDate='" + regDate + '\'' +
            ", status=" + status +
            '}';
  }


}
