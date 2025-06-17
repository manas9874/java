import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m,i,j;
        System.out.println("enter range:");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter numbers:");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int s=a.length;
        for(i=0;i<s-1;i++){
            for(j=i+1;j<s;j++){
                if(a[i]+a[j]==10){
                    System.out.print(a[i]+" "+a[j]);
                }
            }
        }
    }
}
