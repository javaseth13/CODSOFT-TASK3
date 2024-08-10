import java.util.Scanner; 
class currencyconverter
{
     public static void main(String arg[])
     {
        System.out.println("_______");   
        System.out.println("CURRENCY CONVERTER");     
        System.out.println("_______"); 
        int ch;                                     
        double RSToDOLLARrate=0.012,DOLLARToRSrate=83.518501,RSamount,DOLLARamount; 
        double RSToSRIRSrate=3.64,SRIRSToRSrate=0.27,SRIRSamount; 
        Scanner sc=new Scanner(System.in);          
        System.out.println("1-> Convert RS to DOLLAR");    
        System.out.println("2-> Convert DOLLAR to RS");   
        System.out.println("3. Convert RS to SRIRS");    
        System.out.println("4. Convert SRIRS to RS");   
        System.out.println("5-> EXIT");                
        System.out.print("ENTER YOUR CHOICE= ");      
        ch=sc.nextInt();                             
      
        switch(ch)
       
        {
            case 1:   
             boolean convertagain=true;
                          
             while (convertagain)
             {
              System.out.print("ENTER THE AMOUNT IN RS= "); 
              RSamount=sc.nextDouble();                    
              DOLLARamount=RSamount * RSToDOLLARrate;     
              System.out.println(RSamount + " RS is equivalent to " + DOLLARamount + " DOLLAR"); 
              System.out.print("WANT TO CONVERT AGAIN(YES/NO)=");
              String chAgain = sc.next();
              convertagain = chAgain.equalsIgnoreCase("YES");
             }
             System.out.println("HOPE CAREFULLY CONVERT THE CURRENCY");
            break;       

            case 2:     
              convertagain=true;
              while (convertagain)
             {
              System.out.print("ENTER AMOUNT IN DOLLAR= ");
              DOLLARamount=sc.nextDouble();              
              RSamount=DOLLARamount * DOLLARToRSrate;    
              System.out.println(DOLLARamount + " DOLLAR is equivalent to " + RSamount + " RS"); 
              System.out.print("WANT TO CONVERT AGAIN(YES/NO)=");
              String chAgain = sc.next();
              convertagain = chAgain.equalsIgnoreCase("YES");
             }
             System.out.println("HOPE CAREFULLY CONVERT THE CURRENCY");
            break;       

            case 3:      
              convertagain=true;
              while (convertagain)
             {
               System.out.print("ENTER THE AMOUNT IN RS= "); 
               RSamount=sc.nextDouble();                    
               SRIRSamount=RSamount * RSToSRIRSrate;       
               System.out.println(RSamount + " RS is equivalent to " + SRIRSamount + " SRI LANKAN RUPEES "); 
               System.out.print("WANT TO CONVERT AGAIN(YES/NO)=");
               String chAgain = sc.next();
               convertagain = chAgain.equalsIgnoreCase("YES");
             }
             System.out.println("HOPE CAREFULLY CONVERT THE CURRENCY");
            break;       

            case 4:    
              convertagain=true;
              while (convertagain)
             {
              System.out.print("ENTER THE AMOUNT IN SRIRS= ");
              SRIRSamount=sc.nextDouble();                    
              RSamount=SRIRSamount * SRIRSToRSrate;         
              System.out.println(SRIRSamount + " SRIRS is equivalent to " + RSamount + " RS"); 
              System.out.print("WANT TO CONVERT AGAIN(YES/NO)=");
              String chAgain = sc.next();
              convertagain = chAgain.equalsIgnoreCase("YES");
             }
             System.out.println("HOPE CAREFULLY CONVERT THE CURRENCY");
            break;        

            case 5:      
            System.out.println("THANKU FOR USING CURRENCY CONVERTER"); 
            break;       

            default:   
            System.out.println("INVALID CHOICE. PLEASE TRY AGAIN."); 
        }
    }    
}