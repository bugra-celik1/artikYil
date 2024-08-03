import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int year;
    Scanner inp = new Scanner(System.in);
        System.out.print("Bir yıl giriniz:");
        year = inp.nextInt();

        if( year % 4 == 0 ){
            if(year % 100 == 0 && year % 400 == 0){
                System.out.println( year + " Yılı artık bir yıldır !");
            }
          else if(year % 100 != 0){
                System.out.println( year  + " Yılı artık bir yıldır !");
            }
          else{
                System.out.println( year +" Yılı bir artık yıl değildir !");
            }

        }
        else{
            System.out.println( year +" Yılı artık bir yıl değildir !");
        }

    }
}