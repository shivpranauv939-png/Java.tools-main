import java.util.Scanner;
class Targetsum{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int b=sc.nextInt();
        int []a=new int[b];
        for(int i=0;i<=a.length-1;i++){
            a[i]=sc.nextInt();
        }
        int c=sc.nextInt();
        int d=0,k=0,l=0;
        for(int j=0;j<=a.length-1;j++){
            for(k=j+1;k<=a.length-1;k++){
                if(a[j]+a[k]==c){
                    d=1;
                    l=k;
                }
            }
            if(d==1){
                System.out.println(a[j] + " "+ a[l]);
                break;
            }
        }
    }
}