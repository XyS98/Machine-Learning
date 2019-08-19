package com.hpt.bean;


public class Task {

  private String tno;
  private int mno;
  private int empno;
  private String picloc;
  private String docloc;
  private int wino;
  private String title;
  private String descr;
  private int tasktype;
  private double price;
  private int taskweight;
  private int ischecked;


  public String getTno() {
    return tno;
  }

  public void setTno(String tno) {
    this.tno = tno;
  }


  public int getMno() {
    return mno;
  }

  public void setMno(int mno) {
    this.mno = mno;
  }


  public int getEmpno() {
    return empno;
  }

  public void setEmpno(int empno) {
    this.empno = empno;
  }


  public String getPicloc() {
    return picloc;
  }

  public void setPicloc(String picloc) {
    this.picloc = picloc;
  }


  public String getDocloc() {
    return docloc;
  }

  public void setDocloc(String docloc) {
    this.docloc = docloc;
  }


  public int getWino() {
    return wino;
  }

  public void setWino(int wino) {
    this.wino = wino;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getDescr() {
    return descr;
  }

  public void setDescr(String descr) {
    this.descr = descr;
  }


  public int getTasktype() {
    return tasktype;
  }

  public void setTasktype(int tasktype) {
    this.tasktype = tasktype;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public int getTaskweight() {
    return taskweight;
  }

  public void setTaskweight(int taskweight) {
    this.taskweight = taskweight;
  }


  public int getIschecked() {
    return ischecked;
  }

  public void setIschecked(int ischecked) {
    this.ischecked = ischecked;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Task)) return false;

    Task task = (Task) o;

    if (mno != task.mno) return false;
    if (empno != task.empno) return false;
    if (wino != task.wino) return false;
    if (tasktype != task.tasktype) return false;
    if (Double.compare(task.price, price) != 0) return false;
    if (taskweight != task.taskweight) return false;
    if (ischecked != task.ischecked) return false;
    if (tno != null ? !tno.equals(task.tno) : task.tno != null) return false;
    if (picloc != null ? !picloc.equals(task.picloc) : task.picloc != null) return false;
    if (docloc != null ? !docloc.equals(task.docloc) : task.docloc != null) return false;
    if (title != null ? !title.equals(task.title) : task.title != null) return false;
    return descr != null ? descr.equals(task.descr) : task.descr == null;
  }

  @Override
  public int hashCode() {
    int result;
    long temp;
    result = tno != null ? tno.hashCode() : 0;
    result = 31 * result + mno;
    result = 31 * result + empno;
    result = 31 * result + (picloc != null ? picloc.hashCode() : 0);
    result = 31 * result + (docloc != null ? docloc.hashCode() : 0);
    result = 31 * result + wino;
    result = 31 * result + (title != null ? title.hashCode() : 0);
    result = 31 * result + (descr != null ? descr.hashCode() : 0);
    result = 31 * result + tasktype;
    temp = Double.doubleToLongBits(price);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    result = 31 * result + taskweight;
    result = 31 * result + ischecked;
    return result;
  }

  @Override
  public String toString() {
    return "Task{" +
            "tno='" + tno + '\'' +
            ", mno=" + mno +
            ", empno=" + empno +
            ", picloc='" + picloc + '\'' +
            ", docloc='" + docloc + '\'' +
            ", wino=" + wino +
            ", title='" + title + '\'' +
            ", descr='" + descr + '\'' +
            ", tasktype=" + tasktype +
            ", price=" + price +
            ", taskweight=" + taskweight +
            ", ischecked=" + ischecked +
            '}';
  }


}
