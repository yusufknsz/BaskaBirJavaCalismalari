package com.yusufkansiz.bilgisayarprogramlamaodev2;

import java.util.Scanner;

public class dikdortgenCizme {
    public static int doluUzunluk(int akenari){
        String a ="*";

        while(akenari>0){
            System.out.print(a);
            akenari--;
        }
        return akenari ;
    }

    public static void main(String ars[]){
        Scanner girdi = new Scanner(System.in);
        int Akenari = girdi.nextInt();
        doluUzunluk(Akenari);
        System.out.println("Kısa Kenarı Giriniz");
        Scanner girdi2 = new Scanner(System.in);
        int Bkenari = girdi2.nextInt();
        doluUzunluk(Bkenari);
    }

}


