import java.util.HashSet;
public class CheckElement
{
    public static void main(String[] args)
    {
        int[] arr={10,20,30,40,50};

        HashSet<Integer> set = new HashSet<>();

        for(int x : arr)
        {
            set.add(x);
        }
        if(set.contains(10))
        {
            System.out.println("FOUND");
        }
        else
        {
            System.out.println("NOT FOUND");
        }
    }
}