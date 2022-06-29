package gugudan;

import java.util.Scanner;

public class GugudanScannerPractice {

public static void main(String[] args) {
        System.out.println("구구단 중 출력할 단은? : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for(int i = 1; i <= number; i++) {
        System.out.println(number * i);
        }
        
        
        }      
}


