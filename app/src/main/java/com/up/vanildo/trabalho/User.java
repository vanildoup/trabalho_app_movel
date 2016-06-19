package com.up.vanildo.trabalho;

import java.util.HashMap;
import java.util.Map;

public class User {
    private Map<String, String> users = new HashMap<String,String>();

    public String userLogged;

    public User(){
        users.clear();
        users.put("vanildo@aluno.edu.br","vanildo:Vanildo");
        users.put("paulo@aluno.edu.br","paulo:Paulo");
        users.put("andre@aluno.edu.br","andre:André");
        users.put("joao@joao.com","joao:João Aracheski");
    }


    public Boolean validateUser(String email){
        return users.get(email) != null;
    }

    public Boolean validatePassword(String email, String pwd){
        String[] password = users.get(email).split(":");

        return password[0].equals(pwd);
    }

    public String getUserLogged() {
        return userLogged;
    }

    public String findUser(String email){
        String[] user_ = users.get(email).split(":");

        return user_[1];
    }

    public void setUserLogged(String userLogged) {
        this.userLogged = userLogged;
    }

}
