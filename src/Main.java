import org.w3c.dom.ls.LSOutput;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Person person = new PersonBuilderImp()
                .setName("Вася")
                .setSurname("Пожираев")
                .setAge(26)
                .setAddress("Старомосковск")
                .build();
        System.out.println(person);

        Person person2 = new PersonBuilderImp()
                .setName("Леся")
                .setSurname("Куроваева")
                .setAddress("Среднеалтайск")
                .build();
        System.out.println(person2);

        Person person3 = person.newChildBuilder(2)
                .setName("Ваня")
                .build();

        System.out.println(person3);

        try {
            Person person4 = new PersonBuilderImp().setAge(300).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        try {
            Person person5 = new PersonBuilderImp().setAge(15).build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }


    }
}