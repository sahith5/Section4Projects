import java.util.ArrayList;

public class WrapperFun {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        for(int i : num)
        {
            System.out.println(i);
        }
        String s="3.1414";

        Double d=Double.parseDouble(s);
        System.out.println(d);
    }
}
