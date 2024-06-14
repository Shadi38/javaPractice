import java.util.Arrays;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        byte age = 30;
        long viewsCount = 12_233_444_67_899L;
        double price = 10.3456678;
        float discount = 10.23F;
        char letter = 'a';
        String string = "hjk";
        System.out.println(age);
        boolean availability = true;
        Date now = new Date();
        System.out.println(now);


        for (int i = 1; i <= 6; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}