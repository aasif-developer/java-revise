class Addition
{
    public static int add(int a,int b)
{
    return a+b;
}
}
public class Methods
{
    public static void main(String[] args)
    {
        int a=10;
        int b=20;
        int c=Addition.add(a, b);
        System.out.println(c);
    }
}