package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Hardcoding 3 accounts
        ATM a1 = new ATM();
        a1.setAccountNumber("1234");
        a1.setPin(123);
        a1.setBalance(100);

        ATM a2 = new ATM();
        a2.setAccountNumber("12345");
        a2.setPin(123);

        ATM a3 = new ATM();
        a3.setAccountNumber("123456");
        a3.setPin(123);

        //Asking user inputs
        System.out.println("Please enter your account number: ");
        String accNum = input.nextLine();

        System.out.println("Please enter your pin: ");
        int pinNum = input.nextInt();


            if(pinNum == a1.getPin() && accNum.equals(a1.getAccountNumber())) {
                System.out.println("How much do you want to deposit? ");
                a1.setDeposit(input.nextInt());
                System.out.println(a1.getBalance());
            }
            else {
                System.out.println("you're wrong!");
                input.nextLine();
            }

            boolean wrong = false;
            int i = 0;
            while (!wrong && i < 2){
                System.out.println("Please enter your account number: ");
                accNum = input.nextLine();


                System.out.println("Please enter your pin: ");
                pinNum = input.nextInt();



                if(pinNum == a1.getPin() && accNum.equals(a1.getAccountNumber())) {
                    System.out.println("How much do you want to deposit? ");
                    a1.setDeposit(input.nextInt());

                    System.out.println(a1.getBalance());
                    wrong = true;
                }
                else {
                    System.out.println("you're wrong!");
                    input.nextLine();
                    i++;
                }
            }
        System.out.println("you are locked out!!");
        }

    }

