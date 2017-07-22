package ru.academitschool.lesson7.tasks.person;

//import ru.academitschool.lesson7.tasks.person.Contact;
//
public class PersonMain {
    public static void main(String[] args) {
        Contact person = new Contact("Dubchak", "Dmitry", "+79139180207");
        Contact person2 = new Contact("Dubchak", "Ivan", "+79139180204");
        System.out.println(person.getFirstName() + person.getLastName() + person.getPhoneNumber());
        person.setPhoneNumber("++++++++++");
        System.out.println(person.getFirstName() + person.getLastName() + person.getPhoneNumber());
        System.out.println(person2.getFirstName() + person2.getLastName() + person2.getPhoneNumber());
        person2.setFirstName("I*********");
        person2.setLastName("D*********");
        person2.setPhoneNumber("+7*******");
        System.out.println(person2.getFirstName() + person2.getLastName() + person2.getPhoneNumber());
    }
}
