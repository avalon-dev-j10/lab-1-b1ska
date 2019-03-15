package ru.avalon.java.dev.j10.labs.models;
import ru.avalon.java.dev.j10.labs.commons.Address;

public class Passport {
    
//<editor-fold defaultstate="collapsed" desc="Конуструкторы класса">
    public Passport(Person person) {
        this.person = person;
    }
    
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Переменные класса">
    private final Person person;
    int number;
    int seria;
    int datewindraw;
    String organ;
    String propiska;
    String fullName;
//</editor-fold>    
    
//<editor-fold defaultstate="collapsed" desc="Методы класса">
    public Person getPerson() {
        return this.person;
    }
//</editor-fold>
    
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
 
 public int getDatewindraw() {
     return datewindraw;
 }
 
 public void setDatewindraw(int datewindraw) {
     this.datewindraw = datewindraw;
 }
 
 public String getOrgan() {
     return organ;
 }
 
 public void setOrgan(String organ) {
     this.organ = organ;
 }
 
 public String getPropiska() {
     return propiska;
 }
 
 public void setPropiska(String propiska) {
     this.propiska = propiska;
 }
 
 public String getFullName() {
     return fullName;
 }
 
 public void setFullName(String fullName) {
     this.fullName = fullName;
 }
 
//</editor-fold>

}
