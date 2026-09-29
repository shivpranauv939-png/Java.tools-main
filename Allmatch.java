import java.util.Scanner;
class Allmatch{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int []a=new int[b];
        for(int i=0;i<=a.length-1;i++){
            a[i]=sc.nextInt();
        }
        int c=sc.nextInt();
        int n=0,j=0,k=0;
        for(j=0;j<=a.length-1;j++){
            for(k=j+1;k<=a.length-1;k++){
                if(a[j]+a[k]==c){
                    n=n+1;
                }
            }
        }
        System.out.println(n);
    }
}