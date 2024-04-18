package com.ps;
import java.util.Scanner;
public class FinancialExercises1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    };
}

public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner ( System.in );

        System.out.print("Principal:");
        int principal = stdin.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = stdin.nextFloat();
        float monthlyInterest = annualInterest / 200 / 12;

        System.out.print("Period (Years): ");
        byte years = stdin.nextByte();
        int numberOfPayments = years * 12;




        double mathPower = Math.pow(1 + monthlyInterest, numberOfPayments);

        double monthlyPayment = principal * (monthlyInterest * mathPower / (mathPower - 1);
