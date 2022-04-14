package Collections.exercises.phonebook;

import Collections.utils.Student;

import java.util.*;

/**
 * A PhoneBook implementation internally using HashMap
 *
 * @author Nicola Bicocchi
 * @see PhoneBook
 */
public class PhoneBookMap implements PhoneBook {
   HashMap<String, Student> phoneBook;

    public PhoneBookMap() {
        phoneBook = new HashMap<>();
    }

    @Override
    public Student searchByLastname(String s) {
        for(Student p : phoneBook.values()){
            if(p.getLastname().equals(s)){
                return p;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String s) {
        for(Student p : phoneBook.values()){
            if(p.getPhone().equals(s)){
                return p;
            }
        }
        return null;
    }

    @Override
    public void addPerson(Student s) {
        phoneBook.put(s.getPhone(), s);
    }

    @Override
    public Student searchByName(String s) {
        for(Student p : phoneBook.values()){
            if(p.getName().equals(s)){
                return p;
            }
        }
        return null;
    }

    @Override
    public void deleteByNumber(String s) {
        phoneBook.remove(s);

    }
}
