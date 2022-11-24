
import java.util.Scanner;


public class Main3 {
    
    public static int kup(int a){
        
        return a*a*a;
    }
    
    public static int kupToplam(int sayi){
        
        int birler,onlar,yuzler;
        
        birler = sayi%10;
        onlar = (sayi/10)%10;
        yuzler = sayi/100;
        
        
        return kup(birler)+kup(onlar)+kup(yuzler);
    }
    public static void main(String[] args) {
        
        
        // girilen 3 basamaklı sayının basamaklarının küpleri toplamı sayının kendine eşit olup olmadığını bulan algoritma...
        
        Scanner scan = new Scanner(System.in);
        
        while(true){
            
            System.out.print("lutfen sayi giriniz : ");
            
            int sayi = scan.nextInt();
            
            if(sayi<100){
                System.out.println("lutfen uc basamakli sayi giriniz!!!");
            }
            else if(sayi>999){
                System.out.println("lutfen uc basamakli sayi giriniz!!!");
            }
            
            else if(100<=sayi && sayi<=999){
                System.out.println("girilen sayi 3 basamaklidir..."); // girilen sayinin basamaklarının küpleri toplamı sayiya eşit ise ZALIM sayidir.
                
                if(sayi==kupToplam(sayi)){
                    
                    System.out.println("girilen sayi ZALIMDIR.");
                    
                }
                else{
                    System.out.println("girilen sayi ZALIM sayi degildir!!!!");
                }
                
                
            }
        }
        
        
        
        
       
                
        
        
        
        
        
    }
    
}
