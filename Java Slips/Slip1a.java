import java.util.*;
class MyThread implements Runnable{
  public void run(){
    System.out.println("\nT1 execution initiated."); 
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter n: ");
    int n = sc.nextInt();
    for(int i=0; i<n; i++){
      System.out.println("\nHello, Java! How you doin'?");
      try{Thread.sleep(500);}catch(Exception e){System.out.println(e);} 
    }   
    System.out.println("\nT1 execution terminated."); 
  }
}
public class Slip1a{
  public static void main(String args[]){
     System.out.println("\nMain execution initiated.");     
     MyThread t1 = new MyThread();
     Thread th = new Thread(t1);
     th.start();
     System.out.println("\nMain execution terminated.");     
  }
}