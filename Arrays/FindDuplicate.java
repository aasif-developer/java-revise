import java.util.HashSet;

public class FindDuplicate
{
    public static void main(String[] args) {
        int[] arr ={10,20,30,40,40,50};
        HashSet<Integer> set = new HashSet<>();
        
        for(int x : arr)
        {
            if(set.contains(x))
            {
                System.out.println("DUPLICATE ELEMENT IS :" +x);
            }
            else
            {
                set.add(x);
            }
        }
}}