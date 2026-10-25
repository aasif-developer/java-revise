import java.util.HashMap;
public class TwoSum
{
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};

        int target = 80;

        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=0 ; i<arr.length;i++)
        {
           int needed = target -arr[i];

           if(map.containsKey(needed))
           {
             System.out.println("Pair :"+needed + " ,"+arr[i]);
             return;
            }
            map.put(arr[i],i);
        }
        System.out.println("NO PAIR FOUND");
       }
}