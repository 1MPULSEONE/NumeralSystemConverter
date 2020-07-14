package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numDecimal = scanner.nextInt();
        int numOctopus = numDecimal % 8;
        System.out.println(numOctopus);
    }
}
