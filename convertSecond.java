import java.util.Scanner;

public class convertSecond {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter time in second: ");
        int sec = inp.nextInt();

        int hour = sec/3600;
        
        int minutes = (sec%3600)/60;
        int seconds = sec %60;

        System.out.println(sec + " seconds in minutes and hour is " + hour + " : " + minutes + " : " +  seconds);

    }
}
