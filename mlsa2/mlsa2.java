import java.util.*;
public class mlsa2
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n,k;
        String inp,output;
        System.out.println("Enter n and k:");
        n=in.nextInt();
        k=in.nextInt();
        char[] c = new char [n];
        
        System.out.println("enter the string (keep it to n characters)(only first n characters will be taken:");
        inp = in.nextLine();
        
        inp.getChars(0,n,c,0);
        
        System.out.println("Enter the letters:");
        char[] test = new char[k];
        
        for (int i=0;i<k;i++)
        {
            System.out.println("Enter :"+(i+1)+"letter");
            test[i]=in.next().charAt(0);
        }
        int no =0;
        for(int i=0;i<n;i++)
        { for (int j=0;j<k;j++)
            {
           if (inp.charAt(i)==test[j]){
           no ++;
           System.out.println(inp.charAt(i)+"  ");}
            } 
        }
        
         System.out.println(no);
        
        
        

    }   
}
