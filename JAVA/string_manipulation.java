import java.util.*;
class word 
{
    Scanner sc=new Scanner(System.in);
    String s;
    word()
    {
        System.out.print("Enter a String: ");
        s=sc.nextLine();

    }
    void str_functions()
    {
        System.out.println("Lower Case:"+s.toLowerCase());
        System.out.println("Upper case: "+s.toUpperCase());
        System.out.println("Length: "+s.length());
        System.out.println("substring(2): "+s.substring(2));
        System.out.println("substring(2,6): "+s.substring(2,6));
        System.out.println("trim: "+s.trim());
        System.out.println("indexOf('o'): "+s.indexOf('o'));
        System.out.println("indexOf('o',10): "+s.indexOf('o',10));
        System.out.println("concat('hello'): "+s.concat("hello"));
 }
}
class string_manipulation
{
    public static void main(String args[])
    {
        word w=new word();
        w.str_functions();
    }
}