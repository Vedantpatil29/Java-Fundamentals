import java.util.*;
public class TypePromotion{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        byte bt = 3;
        char ch = 'a';
        System.out.println(bt - ch); //rule 1 followed byte and char get coverted to int

        float num = 3.45f;
        int num2 = 45;
        //double num3 = 3.45;
        float ans = num + num2; //here i done int + float still no error as int get converted to float
        System.out.println(ans);

        float a = 3.45f;
        int b = 45;
        double c = 3.45;
        int anss = a + b + c;
        System.out.println(anss); // error observed as in above line rhs is completed has converted to double and in left you mentioned that it is intger

    }
}
