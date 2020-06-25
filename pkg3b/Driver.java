package pkg3b;

import java.util.Scanner;

class zeroTemperatureException extends Exception{
    public String toString(){
        return "ENTERED TEMPERATURE IS EQUAL TO ZERO";
    }
}

class Temperature{
    Temperature(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the temperature");
            int temp = sc.nextInt();
            if (temp == 0) {
                throw new zeroTemperatureException();
            }
            else{
                System.out.println("TEMPERATURE ENTERED IS: " + temp);
            }
        }catch(zeroTemperatureException e){
            System.out.println("CAUGHT EXCEPTION: " + e);
        }
    }

}

public class Driver {
    public static void main(String[] args) {
        Temperature t = new Temperature();
    }
}
