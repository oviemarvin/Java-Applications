import java.util.Scanner;
public class AirlineReservation{
 public static void main(String[]a){
  boolean[] seats=new boolean[10];
  Scanner s=new Scanner(System.in);
  while(true){
   System.out.println("Type 1 for First Class, 2 for Economy, 0 to exit:");
   int choice=s.nextInt();
   if(choice==0)break;
   if(choice==1){
    int seat=-1;
    for(int i=0;i<5;i++)if(!seats[i]){seat=i;break;}
    if(seat!=-1){seats[seat]=true;System.out.println("Boarding pass: First Class seat "+(seat+1));}
    else{
     System.out.println("First class full. Accept economy? 1=yes 0=no");
     if(s.nextInt()==1){
      seat=-1;
      for(int i=5;i<10;i++)if(!seats[i]){seat=i;break;}
      if(seat!=-1){seats[seat]=true;System.out.println("Boarding pass: Economy seat "+(seat+1));}
      else System.out.println("Next flight leaves in 3 hours.");
     } else System.out.println("Next flight leaves in 3 hours.");
    }
   } else if(choice==2){
    int seat=-1;
    for(int i=5;i<10;i++)if(!seats[i]){seat=i;break;}
    if(seat!=-1){seats[seat]=true;System.out.println("Boarding pass: Economy seat "+(seat+1));}
    else{
     System.out.println("Economy full. Accept first class? 1=yes 0=no");
     if(s.nextInt()==1){
      seat=-1;
      for(int i=0;i<5;i++)if(!seats[i]){seat=i;break;}
      if(seat!=-1){seats[seat]=true;System.out.println("Boarding pass: First Class seat "+(seat+1));}
      else System.out.println("Next flight leaves in 3 hours.");
     } else System.out.println("Next flight leaves in 3 hours.");
    }
   }
  }
 }
}