package com.test.dataaccess.entity;

import java.io.Serializable;
public class UserDO<string> implements Serializable {

    private string u_id;
    private string username;
    private string email;
    private string phone_num;
    private string address;
    private string scu_id;
    private string password;
    private string First_name;
    private string Last_name;

    public Long getU_id() {
        return (Long) u_id;
    }

    public void setU_id(string u_id) {
        this.u_id = u_id;
    }

    public string getUsername() {
        return username;
    }

    public void setUsername(string username) {
        this.username = username;
    }

    public string getEmail() {
        return email;
    }

    public void setEmail(string email) {
        this.email = email;
    }

    public string getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(string phone_num) {
        this.phone_num = phone_num;
    }

    public string getAddress() {
        return address;
    }

    public void setAddress(string address) {
        this.address = address;
    }

    public string getScu_id() {
        return scu_id;
    }

    public void setScu_id(string scu_id) {
        this.scu_id = scu_id;
    }

    public string getPassword() {
        return password;
    }

    public void setPassword(string password) {
        this.password = password;
    }

    public string getFirst_name() {
        return First_name;
    }

    public void setFirst_name(string first_name) {
        First_name = first_name;
    }

    public string getLast_name() {
        return Last_name;
    }

    public void setLast_name(string last_name) {
        Last_name = last_name;
    }
}

