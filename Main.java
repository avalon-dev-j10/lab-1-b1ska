package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.commons.Address;
import ru.avalon.java.dev.j10.labs.models.*;


public class Main {
        
public static void main(String args[]) {
             
      
//Создаем Ивана, и присваиваем имя, серию и номер паспорта, адрес прописки
        Person ivanov = new Person(
                 new Passport("Иванов","Иван","Иваоновчи",2002,540230,"12.02.1991","Выдан 2 отделом УФМС, г. Москвы, хз какого района"),
                 new Address("СПб","Россия","Восстания","а",6,2));
        
        
        Person smith = new Person(
                 new Passport("John","Edvard",null,"Smith",1234,782102,"12.06.1987","New Zealand ufms"),
                 new Address("Auckland","New Zealand","Galway"," ",1010,5));        
        
             
        

        
 
        System.out.println(ivanov.getPassport());
        System.out.println(ivanov.getAddress());
        System.out.println();
        System.out.println(smith.getPassport());
        System.out.println(smith.getAddress());

        
        
        
        

        
    }
}