package com.wipro.bean;

import javax.persistence.*;

@Entity
@Table(name = "MY_Dept")
public class Department {
    @Id
    private int deptno;
    @Column(length = 20)
    private String dname;
    @Column(length = 20)
    private String loc;

    public Department() {
    }

    public Department(int deptno, String dname, String loc) {
        this.deptno = deptno;
        this.dname = dname;
        this.loc = loc;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "Dept [" + " deptno= " + this.deptno + " dname= " + this.dname + " loc= " + this.loc + " ]";
    }

}
