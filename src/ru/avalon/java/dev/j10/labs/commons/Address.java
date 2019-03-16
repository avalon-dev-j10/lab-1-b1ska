package ru.avalon.java.dev.j10.labs.commons;
import ru.avalon.java.dev.j10.labs.models.Person;

  
public class Address {
    
//<editor-fold defaultstate="collapsed" desc="Конструкторы класса">
    public Address(Person person) {
        this.person = person;
    }
    
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Переменные класса">
    private final Person person;
    private String city;
    private String country;
    private String street;
    private String korpus;
    private int house;
    private int kv;
    private String propiska;
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Геттеры и сеттеры">
    public Person getPerson() {
        return this.person;
    }
    
    public String getCity() {
        return city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public String getCountry() {
        return country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    
    public String getStreet() {
        return street;
    }
    
    public void setStreet(String street) {
        this.street = street;
    }
    
    public String getKorpus() {
        return korpus;
    }
    
    public void setKorpus(String korpus) {
        this.korpus = korpus;
    }
    
    public int getHouse() {
        return house;
    }
    
    public void setHouse(int house) {
        this.house = house;
    }
    
    public int getKv() {
        return kv;
    }
    
    public void setKv(int kv) {
        this.kv = kv;
    }
    
    public String getPropiska() {
        return propiska;
    }
    
    public void setPropiska(String propiska) {
        this.propiska = propiska;
    }
//</editor-fold>
    
   
 }  