import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;


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
          String message = "  HELLO World" + "!! ";
          System.out.println(message);
          //using the endsWith and startsWith method of the String class and returns boolean
        System.out.println(message.endsWith("!! "));
        System.out.println(message.startsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("H"));
//        return -1 if the character doesn't exist in message'
        System.out.println(message.lastIndexOf("w"));
        //replace method doesn't change the original message and return the new string
        System.out.println(message.replace("!", "*"));

        //the lowerCase method doesn't change the original message and return the new string
        System.out.println(message.toLowerCase());
        System.out.println(message);
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

        // constants(sabet yani we can't change their value through the code and should be capital)
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

        //implicit casting(converting)--> yani agar short ke 2 byte ro ba int(5) ke 4 byte jam konim
        // dar java automatically short tabdil be int(ke bite bishtari dare) mishe
        //byte>short>int>long>float>double
        short x=1;
        int   y=x+5;

        double e=1.1;
        double f=e + 2;//result is 3.1 --> baraye jame double to int(2), int tabdil be double mishe(2.0)

        double g=1.1;
        int h= (int)g + 2;//result is 3 --> chon h int ast bayad g tabdil be int beshe(1) va bad ba 2 jam beshe

        //we can not cast string to integer, we have to convert string to integer
        String l="1";
        int r=Integer.parseInt(l) + 2;
        System.out.println(r);
        //agar addadike bekhaym add konim ashar dashte bashe baraye tabdil be adad bayad az kelase dige mesle Double or Float estefade konim
        String o= "1.1";
        double p= Double.parseDouble(o) + 2;
        System.out.println(p);

        //Math class
        //round
        int v= Math.round(2.3F);
        System.out.println(v);
        //ceil --> adad ro be adade balatar rond mikone.for example 2.1 --> 3
        //this method(ceil) returns double
        //dar example zir bayad natije Math.ceil ro tabdil be integer bekonim chon y int ast
        int q=(int) Math.ceil(2.3F);
        System.out.println(q);//result would be 3
        //floor--> kamtar ya mosavi adad. for example: 3.2 --> 3
        int qq=(int) Math.floor(2.3F);
        System.out.println(qq);//result 2
        //max and min
        int qqq=Math.max(2,5);//result 5
        //random --> returns double between 0 t0 1
        double gg=Math.random();
        //if i want to have random number between 0 to 100 should * 100
        double ggg=Math.random()*100;
        System.out.println(ggg);//result with ashar
        double gggg=Math.floor(Math.random()*100);
        System.out.println(gggg);
        int ggggg=(int)Math.floor(Math.random()*100);
        System.out.println(ggggg);
        int ff=(int)(Math.random()*100);
        System.out.println(ff);

        //formatting numbers  ---- when we use formating number,  java.text package will be inserted on top of the page
        // and we can use one of the classes which is NumberFormat
        //sometimes we need to format number as currency value --> 1234567  ==> $ 1,234,567 or  0.1  ==>  10%
        //NumberFormat currency = new NumberFormat(); //we have error chon numberFormat is abstract and we can't write this code
        // and we can not create an operator and make an instance of them
        String resultt=NumberFormat.getCurrencyInstance().format(1234567);
        System.out.println(resultt);
        String result= NumberFormat.getPercentInstance().format(0.2);
        System.out.println(result);

        //reading input from user
        //for reading data(we have to specify where we gana read data from. terminal or a file)
        //for reading data from terminal, we use this class => System.in
        Scanner scanner = new Scanner(System.in);
        //scanner object has bunch of method for reading data and all these method start with next
        System.out.print("age:");
        byte age =  scanner.nextByte();
        System.out.println("you are" + age);
        //if we want to have a floating number as a result, we should use
        //double age = scanner.nextDouble() or float age = scanner.nextFloat()

        //if we want to read string 
        System.out.print("name:");
        String name =  scanner.nextLine();
        System.out.println("you are" + name);

        //mini project:calculating mortgage
        
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Prinncipal:");
        int prinncipal = scanner.nextInt();

        System.out.println("anual Rate:");
        float monthlyRate = scanner.nextFloat();
        float monthlyInterest = monthlyRate/PERCENT/MONTHS_IN_YEAR;

        System.out.println("Period (years):");
        byte years = scanner.nextByte();
        int numberOfPayment = years * MONTHS_IN_YEAR;

        double mortgage = prinncipal * (monthlyInterest * Math.pow(monthlyInterest+1, numberOfPayment))
                                       /(Math.pow(monthlyInterest+1, numberOfPayment-1));
        //we use the NumberFormat class to format the value of mortgage as currency
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage:" + mortgageFormatted);

        //some example of boolean variable
        int income = 120_000;
        //below the result is hasHighIncome = true
        //we can have () around income > 100_000 to show that is boolean => boolean (hasHighIncome = income > 100_000);
        boolean hasHighIncome = income > 100_000;
        
       //Ternary operator:

        // int income2 = 120_000;
        // String className = "Economy";
        // if(income > 100_000){
        //    className = "First";
        // }

        int income2 = 120_000;
        String className = income>100_000 ? "First" : "Economy";

        //switch statements:
        String role = "admin";
        switch(role){
                case "admin":
                        System.out.println("you are an admin");
                        break;
                case "user":
                         System.out.println("you are an user");
                         break;
                //if none of above executed, the default will be executed
                default:
                        System.out.println("you are an guest");

        }  

        //bizzbuzz project
        System.out.println("number:");
        int number = scanner.nextInt();
        if(number % 5 == 0){
            if(number % 3 == 0) 
                System.out.println("FizzBuzz");
            else
                System.out.println("Fizz");
        }else if (number % 3 == 0)
                System.out.println("Buzz"); 
         else 
                System.out.println(number);
        }

        //for loop:
        for (int i=0; i<5; i++){
                System.out.println("Hello")
        }

        //while loop:
        //we use while loop when we don't know how many times we want to repeat something
        int i=0;
        while(i>0){
              System.out.println("Hello");
              i--;  
        }

        //while in below executed untill user write quit word:
        String input = "";
        Scanner scanner = new Scanner(System.in)
        while (!input.equals("quit")){
          System.out.println("input:");
          input = Scanner.next().toLowerCase();
          if(input.equals("pass"))
            continue;//continue statement moves control to the begining of the loop.it means java ignore the below lines
          if(input.equals("quit"))
            break;//break statement terminates the while loop and exit and won't execute below line
          System.out.println(input);
        }
        
        //do while loop:
        //we write above example with do while loop
        do{
          System.out.println("input:");
          input = Scanner.next().toLowerCase();
          System.out.println(input);
        }while(!input.equals("quit"))

        //for each loop over array:
        String[] fruits = {"apple", "kivi", "blubery"}

        for(i=0; i<fruits.length; i++)
          System.out.println(fruits[i]);
        //for each: if we don't need the index, it is better to use for each loop instead of for loop
        for(String fruit:fruits)
          System.out.println(fruit);








    }
}