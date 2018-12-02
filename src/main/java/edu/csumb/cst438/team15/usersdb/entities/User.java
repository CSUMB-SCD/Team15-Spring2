package edu.csumb.cst438.team15.usersdb.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User")
public class User {
    
    private String username;
    private String password;
    private int credit;


    public User (String name,String password, int credit) {
        this.username = username;
        this.password = password;
        this.credit = credit;
    }

    public String getUser(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
    public int getCredit(){
        return this.credit;
    }
    // public void setUser(String username){
    //     this.username = username;
    // }
    // public void setPassword(String password){
    //     this.password = password;
    // }
    // public void setCredit(int credit){
    //     this.credit = credit;
    // }

}