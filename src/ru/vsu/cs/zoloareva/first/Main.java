package ru.vsu.cs.zoloareva.first;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        int d = a / 10;
        int e = a % 10;

        if(d == 1){
            if(e == 0){
                System.out.println("десять лет");
            }
            if(e == 1){
                System.out.println("одиннадцать лет");
            }
            if(e == 2){
                System.out.println("двенадцать лет");
            }
            if(e == 3){
                System.out.println("тринадцать лет");
            }
            if(e == 4){
                System.out.println("четырнадцать лет");
            }
            if(e == 5){
                System.out.println("пятнадцать лет");
            }
            if(e == 6){
                System.out.println("шестнадцать лет");
            }
            if(e == 7){
                System.out.println("семнадцать лет");
            }
            if(e == 8){
                System.out.println("восемнадцать лет");
            }
            if(e == 9) {
                System.out.println("девятнадцать лет");
            }
        }

        switch (d) {
            case (0):
                break;
            case (2):
                System.out.print("двадцать ");
                break;
            case (3):
                System.out.print("тридцать ");
                break;
            case (4):
                System.out.print("сорок ");
                break;
            case (5):
                System.out.print("пятьдесят ");
                break;
            case (6):
                System.out.print("шестьдесят ");
                break;
            case (7):
                System.out.print("семьдесят ");
                break;
            case (8):
                System.out.print("восемьдесят ");
                break;
            case (9):
                System.out.print("девяносто ");
                break;
        }

        if(d>1) {
            switch (e) {
                case (0):
                    System.out.println("лет");
                    break;
                case (1):
                    System.out.println("один год");
                    break;
                case (2):
                    System.out.println("два года");
                    break;
                case (3):
                    System.out.println("три года");
                    break;
                case (4):
                    System.out.println("четыре года");
                    break;
                case (5):
                    System.out.println("пять лет");
                    break;
                case (6):
                    System.out.println("шесть лет");
                    break;
                case (7):
                    System.out.println("семь лет");
                    break;
                case (8):
                    System.out.println("восемь лет");
                    break;
                case (9):
                    System.out.println("девять лет");
                    break;
            }
        }
    }
}
