
package interest;
import java.util.Scanner;

public class Interest {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double interest ,priciple, month,inte,Total;
        
        System.out.print("เงินต้น   : ");
        priciple = sc.nextInt();
        /*for ( int p=1; i<priciple; p++){
             System.out.println(p);
        }*/
        System.out.print("อัตตราดอกเบี้ย   : ");
        interest = sc.nextInt();
        inte = priciple*interest/100;
        Total = priciple+inte;
        
        System.out.println(inte);
        System.out.println(Total);
        
        for ( int p=1; p<priciple; p++){
            
             System.out.println(p);
        }
        
        
        System.out.print("จำนวนเดือน   : ");
        month = sc.nextInt();
        
        for(int i=1; i< month; i++){
        System.out.println("เดือนที่ : "+i+" : "+Total);
        }
       
    }
}
