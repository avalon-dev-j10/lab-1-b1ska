package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.models.Person;


public class Main {
        
public static void main(String args[]) {
             
      
//Создаем Ивана, и присваиваем имя, серию и номер паспорта, адрес прописки
        Person ivanov = new Person("Иванов","Иван","Иванович","Чебурек");
        ivanov.getAddress().setPropiska("Россия, Санкт-Петербург, ул. Восстания д.1 кв 5");
        ivanov.getPassport().setSeria(2040);
        ivanov.getPassport().setNumber(5050505);
        ivanov.getAddress().setCountry("Russia");
               
//Создаем Эдварда, и присваиваем имя, серию и номер паспорта, адрес прописки
        Person smith = new Person("John","Edvard","Smith");
        smith.getAddress().setPropiska("New Zealand, Auckland, Galway St 1010");
        smith.getPassport().setSeria(999);
        smith.getPassport().setNumber(56541);
        smith.getAddress().setCountry("New Zealand");
        

        
        
        //Выводим имя, паспортные данные и место жительства.
        System.out.println(ivanov.getFullName());
        System.out.println("Паспорт"+" "+"Серия"+" "+ ivanov.getPassport().getSeria()+" "+"№"+ivanov.getPassport().getNumber());
        System.out.println("Адрес регистрации:"+" "+ivanov.getAddress().getPropiska());
        
        
        System.out.println();
        
        System.out.println(smith.getFullName());
        System.out.println("Паспорт"+" "+"Серия"+" "+ smith.getPassport().getSeria()+" "+"№"+smith.getPassport().getNumber());
        System.out.println("Адрес регистрации:"+" "+smith.getAddress().getPropiska());

        
        
    }
}