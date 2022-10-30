/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_079.Project01;

/**
 *
 * @author acer
 */
public class hitung {
    
    double total;
    double Totalsetelahdiskon;

  
    public double total(String Harga, String Jumlah){
        
        double Total;
       
     
        double harga = Double.parseDouble(Harga);
        double jumlah = Double.parseDouble(Jumlah);
        
        Total =  harga * jumlah;
        total = Total;
        return Total;
      
        
       
        
        
    }
    
   
    
    public String diskon(){
        String Diskon = "";

        
        
        if(total < 10000){
            
            Diskon = "0%";
            return Diskon;
  
          
           
           
        }
        else if(  total < 50000 ){
            
            Diskon = "5%";
            return Diskon;
           
           
           
        }
        
        else if(total <=100000 ){
            
            Diskon = "10%";
            return Diskon;
           
        }
        else if(total > 100000 ){
            
            Diskon = "10%";
            return Diskon;
           
        }
        return null;
        
    }
    
    
    
    public double hitungdiskon(){
        
        int totalbelanja;
        int Totalsetelahdiskon;
       
         
        
        if(total < 10000  ){
            
           
  
           totalbelanja =   (int) (total-(total * 0/100));
           Totalsetelahdiskon= totalbelanja;
           return totalbelanja;
           
           
        }
      
        else if(total < 50000){
            
            
            
           totalbelanja = (int) (total-(total * 5/100));
           Totalsetelahdiskon = totalbelanja;
           return totalbelanja;
        
        
           
        }
        else if(total <= 100000  ){
            
            
            
           totalbelanja =  (int) (total-(total*10/100));
           Totalsetelahdiskon = totalbelanja;
           return totalbelanja;
           
          
        }
        else if( total > 100000){
            
           totalbelanja = (int) (total-(total*10/100));
           Totalsetelahdiskon = totalbelanja;
           return totalbelanja;
        }
        return 0;
    }
    
    
           
          
        
        
    
    
   
    
}
