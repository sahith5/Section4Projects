import java.util.ArrayList;
import java.util.Scanner;

public class Proj_4_2 {
    public static void main(String[] args) {
        ArrayList<Double> SomeNumbers=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        System.out.println("enter the value");
        Double d= input.nextDouble();
        while(d>0){
            SomeNumbers.add(d);
            d=input.nextDouble();
            input.nextLine();
            System.out.println("Enter The Number");

        }
        for(int i=SomeNumbers.size()-1;i>=0;i--)
        {
            System.out.println(SomeNumbers.get(i));
        }
    }
}
