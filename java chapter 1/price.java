import java.util.*;
public class price{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Total Price of Following items");
        Float pen = sc.nextFloat();
        String c = sc.nextLine();
        Float pencil = sc.nextFloat();
        Float eraser = sc.nextFloat();
        Float TP = (pen) + (0.18f * (pen));
        Float TPE = (pencil) + (0.18f * (pencil));
        Float E = (eraser) + (0.18f * (eraser));
        System.out.println(TP);
        System.out.println(TPE);
        System.out.println(E);
        Float total = TP + TPE + E;
        System.out.println("total bill is : " + total);
    }
}