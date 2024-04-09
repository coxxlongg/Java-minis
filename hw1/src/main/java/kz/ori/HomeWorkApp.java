package kz.ori;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HomeWorkApp {
    public static void printThreeWords(String[] args) {
        System.out.println("Orange\nBanana\nApple");
    }
    public static void checkSumSign(int a, int b) {
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100){
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(int a, int b){
        if (a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    public static void main(String[] args) {
        printThreeWords(args);
        checkSumSign(6, -8);
        printColor(156);
        compareNumbers(7, 14);
    }
}
