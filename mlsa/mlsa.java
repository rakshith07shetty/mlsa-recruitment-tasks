import java.util.Scanner;

class mlsa
{
  public static void main(String args[])
  {
     int x,y,z;
     float fnum;
     String out ="no";
     
 
     Scanner in = new Scanner(System.in);
 
     
     System.out.println("Enter the values of x,y and z: ");
     x = in.nextInt();
     y = in.nextInt();
     z = in.nextInt();
     
 if (y%x==0)
 out="yes";
 else if (z>=(x-(y%x)))
 out="yes";
 System.out.println(out);
     
  }
}