package Collections.exercises.phonebook;

import Collections.utils.Student;

/**
 * Interface representing a generic PhoneBook Implementing classes must provide
 * methods for inserting, deleting and searching persons within the PhoneBook
 *
 * @author Nicola Bicocchi
 */
public interface PhoneBook {
    Student searchByLastname(String s);

    Student searchByNumber(String s);

    void addPerson(Student s);

    Student searchByName(String s);

    void deleteByNumber(String s);

}
