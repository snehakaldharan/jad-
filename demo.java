import java.util.*;
class customexception extends Exception
{
customexception()
{
System.out.println("there is an error");
}
}
public class demo
{
public static void main(String[] se)
{
Scanner b=new Scanner(System.in);
System.out.println("enter the age");
String a=b.next();
System.out.println("enter the name");
String d=b.next();
try
{
if(a.equals("40")&&d.equals("rahul"))
{
System.out.println("you are rahul");
}
else
{
throw new customexception();
}
}
catch(Exception e)
{
System.out.println();
}
}
}

