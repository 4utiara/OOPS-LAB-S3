import java.util.*;
import java.io.*;
public class BinarySearch{
    
    public static void main(String arg[]){
            int pos=0;    
            int arr[]=new int[10];
            Scanner sc=new Scanner(System.in);
            System.out.println("\n Enter the size of sorted array=");
            int n=sc.nextInt();
            int high=n-1;
            int low=0;
            System.out.println("\n Enter the elements");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("\n Enter the searching element");
            int x=sc.nextInt();
            
            int flag=0;
            while(high>low){
                        int mid=(low+high)/2;
                        if(arr[mid]==x){
                            pos=mid+1;
                            flag=1;
                            break;
                        }
                        else if(x<arr[mid]){
                            high=mid-1;
                            
                        }
                        else{
                            low=mid+1;
                            
                        }
                    }
            if(flag==0){
                System.out.println("Element Not Found");
            }
            else{
                System.out.println("Element found at index"+pos);
            }        
             }
        }
