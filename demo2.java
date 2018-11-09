import java.util.*;
class customexception extends Exception
{
customexception()
{
System.out.println("there is an error");
}
}
public class demo2
{
public static void main(String[] se)
{
Scanner b=new Scanner(System.in);
System.out.println("enter the marks of flat");
String a=b.next();
System.out.println("enter the marks of bd");
String c=b.next();
System.out.println("enter the name of student");
String d=b.next();
System.out.println("enter the name of student");
String f=b.next();
try
{
if(a.equals("40")&&d.equals("rahul")&&c.equals("50")&&f.equals("shaik"))
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

