package com.company;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Permissive {

    public static void main(String[] args) {

        System.out.println(basa("Айназик", generateRandomAge(), 24));
        System.out.println(basa("Айдана", generateRandomAge(), 18));
        System.out.println(basa("Айпери", generateRandomAge(), -12));
        System.out.println(basa("Мээрим", generateRandomAge(), 32));
        System.out.println(basa("Хадижа", generateRandomAge(), -5));


    }



    public static String basa(String name, int age, int temperature) {
        if (age >= 20  && age <= 45 && temperature >= -20 && temperature <= 30){
            System.out.println("Name: " + name + ", "+ "Age: " + age + ", " + "Temperature: " + temperature);
            return "Можно идти гулять\n";
        } else if (age <= 20 && temperature >=0 && temperature <= 28){
            System.out.println("Name: " +  name + ", "+ "Age: " + age + ", " + "Temperature: " + temperature);
            return "Можно идти гулять\n";
        } else if(age >= 45 && temperature >= -10 && temperature <= 25){
            System.out.println("Name: " +  name + ", "+ "Age: " + age + ", " + "Temperature: " + temperature);
            return "Можно идти гулять\n";
        } else {
            System.out.println("Name: " +  name + ", "+ "Age: " + age + ", " + "Temperature: " + temperature);
            return "Оставайтесь дома!\n";
        }
    }
    public static int generateRandomAge(){
        int a = 1+(int)(Math.random()*101);
        if (a<16 || a>70){
            System.out.println("Вы не можете выйти из дома");
        } else {
            System.out.println("Да, вы можете выйти из дома");
        }
        return a;
    }
}

