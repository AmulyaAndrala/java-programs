import java.util.Scanner;
class userinput
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String name;
int yearofjoining;
int address;
System.out.println("enter user information");
name=s.nextLine();
yearofjoining=s.nextInt();
address=s.nextInt();
System.out.println("Name Yearofjoining Address"+name +yearofjoining +address);
}
}