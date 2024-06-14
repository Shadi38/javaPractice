import java.awt.*;
import java.util.Arrays;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        byte age = 30;
//        long viewsCount = 12_233_444_67_899L;
//        double price = 10.3456678;
//        float discount = 10.23F;
//        char letter = 'a';
//        String string = "hjk";
//        System.out.println(age);
//        boolean availability = true;
//        Date now = new Date();
//        System.out.println(now);
//          byte x=1;
//          byte y=x;
//          x=3;
//          System.out.println(x);
//          System.out.println(y);

//           Point point1 = new Point(1,2);
//           Point point2 = point1;
//           point1.x = 5;
//        System.out.println(point2.x);

//        String message = new String("Hello");
          String message = "  HELLO World" + "!!  ";
          System.out.println(message);
          //using the endsWith and startsWith method of the String class and returns boolean
        System.out.println(message.endsWith("!!"));
        System.out.println(message.startsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("H"));
//        return -1 if the caracter doesn't exist in message'
        System.out.println(message.lastIndexOf("w"));
        //replace method doesn't change the original message and return the new string
        System.out.println(message.replace("!", "*"));
        System.out.println(message);
        //the lowerCase method doesn't change the original message and return the new string
        System.out.println(message.toLowerCase());
        //with trim method we can get rid of extra white spaces that can
        // be at the beginning or at the end of string
        System.out.println(message.trim());


    }
}