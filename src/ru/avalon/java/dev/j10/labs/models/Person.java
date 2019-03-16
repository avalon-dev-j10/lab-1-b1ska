package ru.avalon.java.dev.j10.labs.models;
import ru.avalon.java.dev.j10.labs.commons.Address;

public class Person {

//<editor-fold defaultstate="collapsed" desc="Конструкторы класса">
    public Person(String surname, String name, String otchestvo) {
        this.surname = surname;
        this.name = name;
        this.otchestvo = otchestvo;
        
        
    }
    
    public Person(String surname, String name, String otchestvo,String secondname) {
        this.surname = surname;
        this.name = name;
        this.otchestvo = otchestvo;
        this.secondname = secondname;
    }
    
    public Person(String surname, String name) {
        this.surname = surname;
        this.name = name;
        
    }
//</editor-fold>
          
//<editor-fold defaultstate="collapsed" desc="Переменные класса">
    private String name;
    private String surname;
    private String otchestvo;
    private String secondname;
    private Passport passport;
    private Address address;
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Методы класса">
    /**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то
     * возвращет Имя, Фимилию и Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     *
     * @return имя человека в виде строки.
     */
    public String getFullName() {
        
        if (otchestvo == null){
            return surname+" "+name;
        }
        else if(secondname == null) {
            
            return surname +" "+name+" "+otchestvo;
        }
        else {
            return name +" "+ secondname.charAt(0)+"."+ " " + surname;
        }
        
    }
     
    public Address getAddress(){
        if (this.address == null) {
            this.address = new Address(this);
        }
        return this.address;
    }
    
    public Passport getPassport(){
        if (this.passport == null) {
            this.passport = new Passport(this);
        }
        return this.passport;
    }
    
//</editor-fold>
}