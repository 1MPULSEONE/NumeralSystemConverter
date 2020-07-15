package com.company;

import java.util.Scanner;

public class Main {
    private static long length;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sourceRadix = scanner.nextInt();
        String sourceNumber = scanner.next();
        int targetRadix = scanner.nextInt();
        int targetNumber = Integer.parseInt(sourceNumber);
        if (sourceRadix == 1) {
            length = sourceNumber.length();
            targetNumber = 0;
            for (long i = 0; i < length; i++) {
                targetNumber++;
            }
        } else {
            length = Long.parseLong(sourceNumber);
        }
        if (sourceRadix != 10 && sourceRadix != 1) {
            targetNumber = Integer.parseInt(sourceNumber,sourceRadix);
        }
        if (targetRadix == 1) {
            for (long i = 0; i < length; i++) {
                System.out.print(1);
            }
        } else {
            sourceNumber = Integer.toString(targetNumber,targetRadix);
            System.out.println(sourceNumber);
        }
    }
}
