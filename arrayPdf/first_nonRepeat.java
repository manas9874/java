/*Description: Write a program to find the first non-repeating element in an array. 
Sample Input: 
[9, 4, 9, 6, 7, 4] 
Sample Output: 
6 
Explanation: 6 is the first element that doesn't appear more than once in the array.*/
///not solved
import java.util.Scanner;

public class first_nonRepeat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        System.out.println("enter the range:");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter numbers");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        for(i=0;i<a.length-1;i++){
            for(j=i+1;i<a.length;j++){
                if(a[i]==a[j]){
                    System.out.println(a[i]);
                    break;
                }
            }
        }
    }
}
