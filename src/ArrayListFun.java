import java.util.ArrayList;

public class ArrayListFun {
    public static void main(String[] args) {
        ArrayList<String > namelist=new ArrayList<>();
        namelist.add("Sahith");
        namelist.add("sahith1");
        namelist.add("Sahith2");
        for(String name : namelist)
        {
            System.out.println(name);
        }
        for(int i=0;i<namelist.size();i++)
        {
            System.out.println(namelist.get(i));
        }
    }
}
