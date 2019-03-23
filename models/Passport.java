package ru.avalon.java.dev.j10.labs.models;
import ru.avalon.java.dev.j10.labs.commons.Address;

public class Passport {
    

    public Passport(String surname, String name, String otchestvo,int seria, int number, String datewindraw, String organ) {
     this.seria = seria;
     this.number = number;
     this.datewindraw = datewindraw;
     this.organ = organ;
     this.surname = surname;
     this.name = name;
     this.otchestvo = otchestvo; 
    }
    
    public Passport(String surname, String name, String otchestvo,String secondname,int seria, int number, String datewindraw, String organ) {
     this.seria = seria;
     this.number = number;
     this.datewindraw = datewindraw;
     this.organ = organ;
     this.surname = surname;
     this.name = name;
     this.otchestvo = otchestvo;
     this.secondname = secondname;
    }


    
    
    
    private int number;
    private int seria;
    private String datewindraw;
    private String organ;
    private String fullName;
    private String name;
    private String surname;
    private String otchestvo;
    private String secondname;
  
    
    
//<editor-fold defaultstate="collapsed" desc="Геттеры и сеттеры">
 
 public int getNumber() {
     return number;
 }
 
 public void setNumber(int number) {
     this.number = number;
 }
 
 public int getSeria() {
     return seria;
 }
 
 public void setSeria(int seria) {
     this.seria = seria;
 }
 
 public String getDatewindraw() {
     return datewindraw;
 }
 
 public void setDatewindraw(String datewindraw) {
     this.datewindraw = datewindraw;
 }
 
 public String getOrgan() {
     return organ;
 }
 
 public void setOrgan(String organ) {
     this.organ = organ;
      
 }
 
 
 

 

 
 
//</editor-fold>

 public String getFullName() {
        
        if (otchestvo == null){
            return name +" "+ secondname.charAt(0)+"."+ " " + surname;
        }
        else if(secondname == null) {
            
            return surname +" "+name+" "+otchestvo;
        }
        else {
            return name+" "+surname;
        }
        
    }

@Override
   public String toString(){
       String result = "Паспортные данные:"+"\n" +
               "ФИО: "+getFullName()+"\n"+
              "Серия номер паспорта:" +seria+" "+number+"\n"+
               "Дата выдачи:"+datewindraw+"\n"+
               "Орган выдачи "+organ;
                
       return result;
}
   }