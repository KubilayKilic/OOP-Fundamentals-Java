package com.kaan.oop;

public class User {

     //Property

    String name;
    String job;

    //Constructor

    public User(String isimgirdisi, String meslekgirdisi) {
        this.name = isimgirdisi;
        this.job = meslekgirdisi;


        System.out.println("Kullanıcı Oluşturuldu");
    }

}
