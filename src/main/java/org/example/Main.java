package org.example;
//Создать проект с использованием Maven или Gradle, добавить в него несколько зависимостей и написать код, использующий эти зависимости.
//        Пример решения:
//        1. Создайте новый Maven или Gradle проект, следуя инструкциям из блока 1 или блока 2.
//        2. Добавьте зависимости org.apache.commons:commons-lang3:3.12.0 и com.google.code.gson:gson:2.8.6.
//        3. Создайте класс Person с полями firstName, lastName и age.
//        4. Используйте библиотеку commons-lang3 для генерации методов toString, equals и hashCode.
//        5. Используйте библиотеку gson для сериализации и десериализации объектов класса Person в формат JSON.


import com.google.gson.Gson;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.example.Models.Person;


import java.util.ArrayList;
import java.util.Arrays;


public class Main {


    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>()  ;
        Person person1 = new Person("Semen", "Ivanov", 33);
        Person person2 = new Person("Ivan", "Semenov", 39);
        Person person3 = new Person("Stepan", "Stepanov", 43);
        Person person4 = new Person("Igor", "Petrov", 23);
        Person person5 = new Person("Aleksey", "Alekseev", 19);
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);

        System.out.println(persons);
        System.out.println("----------------");
        System.out.println(' ');
        Gson gson = new Gson();
        String json1 = gson.toJson(persons);
        System.out.println(json1);
        System.out.println("----------------");
        System.out.println(' ');
        Person[] json2 = gson.fromJson(json1, Person[].class);
        System.out.println(Arrays.toString(json2));

    }





}