package gugudan;

import java.util.Scanner;

public class GugudanScannerPractice2 {
	
public static void main(String[] args) {
        System.out.println("구구단 중 출력할 단은? : ");
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.nextLine();
        String[] splitedValue = inputValue.split(",");
        int first = Integer.parseInt(splitedValue[0]);
        int second = Integer.parseInt(splitedValue[1]);
        
       for(int i = 2; i <= first; i++) {
    	  for(int j = 1; j <= second; j++) {
    		  System.out.println(i*j);
    	  }
       }
   }
        
}
