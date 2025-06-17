//array intersection
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m,i,j;

        System.out.println("enter the 1st range:");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter 1st array:");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("enter the 2nd range:");
        m=sc.nextInt();
        int b[]=new int[m];
        System.out.println("enter 2nd array:");
        for(j=0;j<m;j++){
            b[j]=sc.nextInt();
        }
        sc.close();

        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(a[i]==b[j]){
                    System.out.print(a[i]+" ");
                    break;
                }
            }
        }
    }
}
