import java.io.*;
import java.util.*;

public class Day0 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        int arr1[]=new int[a];
        double sum=0.0;
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<a;j++){
            arr1[j]=sc.nextInt();
            sum=sum+arr1[j];
        }
        double mean =0.0;
        int sum1=0;
        for(int k=0;k<a;k++){
            sum1=sum1+(arr[k]*arr1[k]);
        }
        mean=sum1/sum;
         System.out.printf("%.1f", mean);


        
    }
}
