import java.util.Arrays;

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
//        return -1 if the character doesn't exist in message'
        System.out.println(message.lastIndexOf("w"));
        //replace method doesn't change the original message and return the new string
        System.out.println(message.replace("!", "*"));
        System.out.println(message);
        //the lowerCase method doesn't change the original message and return the new string
        System.out.println(message.toLowerCase());
        //with trim method we can get rid of extra white spaces that can
        // be at the beginning or at the end of string
        System.out.println(message.trim());
        //adding "" to string
        String name = "Shadi \"Fakhri\"";
        System.out.println(name);
        //adding \ to our string. for example: \window\...
        String directory = "\\window\\...";
        System.out.println(directory);
        //adding new line with \n
        String text = "Hello World\nI am Shadi";
        System.out.println(text);
        //adding tab(fasele) \t
        String link = "https://github.com\t/Shadi";
        System.out.println(link);
        //array
//        int[] numbers = new int[5];
//        numbers[0] = 1;
//        numbers[1] = 2;
        int[] numbers = {3,1,2,4,5};
        System.out.println(numbers);//it shows the string which is the address
        // of this object (array) in the memory
        System.out.println(Arrays.toString(numbers));
        //array have a fix length
        System.out.println(numbers.length);
        //we can sort the array
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        //multi-dimensional-array
        //two-dimensional-array for example having 2 rows and 3 columns
//        int[][] matrix = new int[2][3];
//        matrix[0][0] = 1;//assign first row and first column 1
        int[][] matrix = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.toString(matrix));//show us the memory address that matrix is saved
        System.out.println(Arrays.toString(matrix[0]));
        System.out.println(Arrays.deepToString(matrix));//is showing first and second rows
        //three-dimensional-array
        int[][][] cube = new int[2][3][5];
        System.out.println(Arrays.deepToString(cube));

        // constants(sabet yani we can't change their value trough the code and should be capital)
         final float PI = 3.141592653589793238462643f;

         //arithmetic expressions +  -  *  /
        int result1 = 3*5;
        System.out.println(result1);
        //result without float numbers
        int result2 = 16/5;
        System.out.println(result2);
        //result with float number>>> we should convert numbers to double
        double result3 = (double)16 / (double)5;
        System.out.println(result3);
        //++
        int a=1;
        int b=a++;
        System.out.println(a);
        System.out.println(b);
        int c=1;
        int d =++c;
        System.out.println(c);
        System.out.println(d);
        a = a + 2;// same as a+=2 or a-=2  or a*=2  or  a/=2




    }
}