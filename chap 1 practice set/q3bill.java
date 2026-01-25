import java.util.*;
public class q3bill{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("bill of customer using gst tax");

        System.out.println("cost of pencil");
        Float pencil = sc.nextFloat();

        System.out.println("cost of pen");
        Float pen = sc.nextFloat();

        System.out.println("cost of eraser");
        Float eraser = sc.nextFloat();

        Float totalpen = pen + (0.18f * pen);
        Float totalpencil = pencil +(0.18f * pencil);
        Float totaleraser = eraser +(0.18f * eraser);

        Float total = totalpen + totalpencil + totaleraser;
         
    
        System.out.print("total bill of person is =\n" + total);
    }
}