import java.util.Scanner;

class Arrayloops{

  public static void main(String[]args){

    Scanner sc=new Scanner(System.in);

    int[]a=new int[7];

    for(int i=0;i<=a.length-1;i++){

      a[i]=sc.nextInt();

    }

    for(int j=0;j<=a.length-1;j++){

      if(a[j]<0){

        System.out.print(a[j]+" ");

      }

    }

    for(int l=0;l<=a.length-1;l++){

      if(a[l]>0){

        System.out.print(a[l]+" ");

      }

    }

  }

}