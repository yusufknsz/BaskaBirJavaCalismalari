package com.yusufkansiz.bilgisayarprogramlamaodev2;


import java.util.Random;

public class BarbutOyunu {

    public static int zarAt(int zar1){
        Random a = new Random();

        zar1=a.nextInt(6)+1;

        return zar1;
    }

    public static int zarAt2(int zar2){
        Random b = new Random();
        zar2 = b.nextInt(6)+1;
        return zar2;

    }


    public static void main(String args[]){
        System.out.println(zarAt(5));
    }

}
