package com.clubBike.domain;

public class MemberDomain {

    // Getter And Setter 단축키 : Alt + Insert

    public Long mnum; // PK
    public String mid; // 멤버 로그인 아이디
    public String mpw; // 멤버 로그인 비밀번호
    public String name; // 이름
    public Integer age; // 나이

    public Long getMnum() {
        return mnum;
    }

    public void setMnum(Long mnum) {
        this.mnum = mnum;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getMpw() {
        return mpw;
    }

    public void setMpw(String mpw) {
        this.mpw = mpw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
