package com.hpt.bean;


public class Messages {

  private int mesno;
  private int sessionId;
  private String content;
  private int chatterA;
  private int chatterB;


  public int getMesno() {
    return mesno;
  }

  public void setMesno(int mesno) {
    this.mesno = mesno;
  }


  public int getSessionId() {
    return sessionId;
  }

  public void setSessionId(int sessionId) {
    this.sessionId = sessionId;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public int getChatterA() {
    return chatterA;
  }

  public void setChatterA(int chatterA) {
    this.chatterA = chatterA;
  }


  public int getChatterB() {
    return chatterB;
  }

  public void setChatterB(int chatterB) {
    this.chatterB = chatterB;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Messages)) return false;

    Messages messages = (Messages) o;

    if (mesno != messages.mesno) return false;
    if (sessionId != messages.sessionId) return false;
    if (chatterA != messages.chatterA) return false;
    if (chatterB != messages.chatterB) return false;
    return content != null ? content.equals(messages.content) : messages.content == null;
  }

  @Override
  public int hashCode() {
    int result = mesno;
    result = 31 * result + sessionId;
    result = 31 * result + (content != null ? content.hashCode() : 0);
    result = 31 * result + chatterA;
    result = 31 * result + chatterB;
    return result;
  }

  @Override
  public String toString() {
    return "Messages{" +
            "mesno=" + mesno +
            ", sessionId=" + sessionId +
            ", content='" + content + '\'' +
            ", chatterA=" + chatterA +
            ", chatterB=" + chatterB +
            '}';
  }


}
