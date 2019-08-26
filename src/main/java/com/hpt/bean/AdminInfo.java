package com.hpt.bean;


public class AdminInfo {

  private int aid;
  private String aname;
  private String realName;
  private String pwd;
  private String tel;

  public String getAname() {
    return aname;
  }

  public String getRealName() {
    return realName;
  }

  public String getPwd() {
    return pwd;
  }

  public String getTel() {
    return tel;
  }

  public int getAid() {
    return aid;
  }

  public void setAid(int aid) {
    this.aid = aid;
  }

  public void setAname(String aname) {
    this.aname = aname;
  }

  public void setRealName(String realName) {
    this.realName = realName;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  @Override
  public String toString() {
    return "AdminInfo{" +
            "aid=" + aid +
            ", aname='" + aname + '\'' +
            ", realName='" + realName + '\'' +
            ", pwd='" + pwd + '\'' +
            ", tel='" + tel + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof AdminInfo)) return false;

    AdminInfo adminInfo = (AdminInfo) o;

    if (aid != adminInfo.aid) return false;
    if (aname != null ? !aname.equals(adminInfo.aname) : adminInfo.aname != null) return false;
    if (realName != null ? !realName.equals(adminInfo.realName) : adminInfo.realName != null) return false;
    if (pwd != null ? !pwd.equals(adminInfo.pwd) : adminInfo.pwd != null) return false;
    return tel != null ? tel.equals(adminInfo.tel) : adminInfo.tel == null;
  }

  @Override
  public int hashCode() {
    int result = aid;
    result = 31 * result + (aname != null ? aname.hashCode() : 0);
    result = 31 * result + (realName != null ? realName.hashCode() : 0);
    result = 31 * result + (pwd != null ? pwd.hashCode() : 0);
    result = 31 * result + (tel != null ? tel.hashCode() : 0);
    return result;
  }
}
