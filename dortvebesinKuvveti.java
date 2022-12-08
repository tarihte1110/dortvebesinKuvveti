import java.util.Scanner;
public class dortvebesinKuvveti {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Bir sayı giriniz:");
        long x= input.nextLong();

        for(int i=1;i<=x;i*=4){
            System.out.println("DÖRDÜN KUVVETLERİ: "+i);
        }
        System.out.println("***************");
        for(int i=1;i<=x;i*=5){
            System.out.println("BEŞİN KUVVETLERİ: "+i);
        }
    }
}
