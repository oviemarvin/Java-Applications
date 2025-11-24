import java.util.*;
public class CommandLineArraySize{
 public static void main(String[]a){
  int size=10;
  if(a.length>0)try{size=Integer.parseInt(a[0]);}catch(Exception e){}
  int[] arr=new int[size];
  for(int i=0;i<arr.length;i++)arr[i]=i+1;
  for(int v:arr)System.out.print(v+" ");
  System.out.println();
 }
}
