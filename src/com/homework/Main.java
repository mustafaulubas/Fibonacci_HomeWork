package com.homework;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println("Lütfen kaç adet Fibonacci sayısı yazdırmak istediğinizi rakam olarak girin: ");
        int a = 1, b = 1, c, i, adet = new Scanner(System.in ).nextInt();

        System.out.println(adet + " adet Fibonacci sayısı; ");

        if (adet >= 2){
            System.out.print(a + " " + b + " ");
        } else if (adet == 1) {
            System.out.println(a);
        }else if (adet <= 0 ){
            throw new Exception("Lütfen geçerli bir rakam giriniz !");
        }

        for (i = 3; i<=adet; i++){
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }

}

