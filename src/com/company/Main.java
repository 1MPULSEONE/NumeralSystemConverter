package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        int destinationRadix = scanner.nextInt();
        switch (destinationRadix) {
            case 2:
                System.out.printf("0b%s",Long.toBinaryString(num));
                break;
            case 8:
                System.out.printf("0%s",Long.toOctalString(num));
                break;
            case 16:
                System.out.printf("0x%s",Long.toHexString(num));
                break;
        }
    }
}
