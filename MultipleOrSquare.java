import java.util.*;
public class MultipleOrSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n, n1;
        n=sc.nextInt();
        n1=sc.nextInt();
        if(n1%n==0 && n1==(n*n))
        {
            System.out.println(n1+" is a multiple & square of "+n);
        }
        else if(n1%n==0 && n1!=(n*n))
        {
            System.out.println(n1+" is a multiple of "+n);
        }
        else if(n1%n!=0 && n1==(n*n))
        {
            System.out.println(n1+" is a square of "+n);
        }
        else
        {
            System.out.println(n1+" is a neither a multiple & nor a square of "+n);
        }
    }}