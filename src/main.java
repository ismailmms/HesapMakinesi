import java.util.Scanner;


public class main {
    public static void main(String[] args) {
 int n1,n2,select;

 Scanner input = new Scanner(System.in);
        System.out.println( "Birinci Sayiyi Giriniz");
        n1=input.nextInt();
        System.out.println("Ikinci Sayiyi Giriniiz");
        n2= input.nextInt();

        System.out.println(" 1-Toplama\n 2-Cikarma\n 3-Carpma\n 4-Bolme ");
        System.out.println("Seciminiz: ");
        select= input.nextInt();

        switch (select){
            case 1:
                System.out.println(n1 + "+" + n2 + "="+ (n1+n2));
                break;
            case 2:
                System.out.println(n1 + "-" + n2 + "="+ (n1-n2));
                break;
            case 3:
                System.out.println(n1 + "/" + n2 + "="+ (n1*n2));
                break;
            case 4:
                if ((n1 == 0) || (n2 == 0)){
                    System.out.println("Sayilar 0'a Bolunmez, 0 Bolunmez");
                }else {
                    System.out.println(n1 + "/" + n2 + "="+ (n1/n2));
                }
                break;
            default:
                System.out.println("Gecersiz Operator Secimi Yaptiniz, Lütfen Gecerli Operator Seciniz");
                break;
        }















    }}