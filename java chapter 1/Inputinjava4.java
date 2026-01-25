import java.util.*;
public class Inputinjava{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);  // only write it once when you are inputing something

        // FOR WORD TO PRINT WE USE
        //String your_name = sc.next();  //note you can either next or nextLine only one in one program
       // System.out.println(your_name);

        //FOR LINE TO PRINT WE USE
        String name = sc.nextLine();
        System.out.println(name);

        //FOR NUMBER TO PRINT WE USE
        int number = sc.nextInt();
        System.out.println(number);

        //FOR DECIMAL NUMBER TO PRINT WE USE
        float value = sc.nextFloat();
        System.out.println(value);

        //FOR BOOLEAN TO PRINT WE USE
        boolean state = sc.nextBoolean();
        System.out.println(state);

        //FOR BYTE TO PRINT WE USE
        byte no = sc.nextByte();
        System.out.println(no);

        // similarly with short and longg

    }
}
