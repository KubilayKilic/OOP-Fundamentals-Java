package com.kaan.oop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*

        bu tarz sınıf kodlaması pek verimli değil, bunun yerine, construcktor kullanmak daha iyi.

        User myUser = new User();
        myUser.name ="Kaan";
        myUser.job ="Engineer";

        User newUser = new User();
        myUser.name ="Kenway";
        myUser.job ="Assassin";

        //bir sınıfta birden fazla obje oluşturulamıyorsa, singleton'dır.
*/


        User myUser = new User("Kaan", "Engineer");

        System.out.println(myUser.name);


        //Encapsulation

        Assassin edward = new Assassin("Edward", "Kenway", 35);
        System.out.println(edward.getAge());
        edward.setAge(44,"Kaan"); //şifre kaan olmalı
        System.out.println(edward.getAge());


        //Inheritance
        SuperMusicians lars = new SuperMusicians("Lars","Ulrich",56);
        System.out.println(lars.sing());
        System.out.println(lars.getAge());

        //Polymorphism

        //Statick Polymorphism
        Maths maths = new Maths();
        System.out.println(maths.sum());
        System.out.println(maths.sum(4,2));
        System.out.println(maths.sum(6,1,9));

        //Dynamic Polymorphism
        Animal myAnimal = new Animal();
        myAnimal.sing();

        Dog barley = new Dog();
        barley.test();
        barley.sing();

        //Abstract & Interface
        Piano myPiano = new Piano();
        myPiano.brand = "Yamaha";
        myPiano.digital = true;
        myPiano.info();

        /*
        //kenway.age = 40, şeklinde güncellenebilir sout yapmadan.
        System.out.println(edward.surname);
        //değiştirmek istenmiyorsa, assassin değerleri private yapılır.
         */
    }
}
