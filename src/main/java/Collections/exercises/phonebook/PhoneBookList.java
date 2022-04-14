package Collections.exercises.phonebook;

import Collections.utils.Student;

import java.util.ArrayList;

/**
 * A PhoneBook implementation internally using ArrayList. Slow!
 *
 * @author Nicola Bicocchi
 * @see PhoneBook
 */
public class PhoneBookList implements PhoneBook {
    ArrayList<Student> phoneBook;

    public PhoneBookList() {
        phoneBook = new ArrayList<>();
    }

    @Override
    public Student searchByLastname(String s) {
        for(Student p : phoneBook){
            if(p.getLastname().equals(s)){
                return p;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String s) {
        for(Student p : phoneBook){
            if(p.getPhone().equals(s)){
                return p;
            }
        }
        return null;
    }

    @Override
    public void addPerson(Student s) {
        phoneBook.add(s);
    }

    @Override
    public Student searchByName(String s) {
        for(Student p : phoneBook){
            if(p.getName().equals(s)){
                return p;
            }
        }
        return null;
    }

    @Override
    public void deleteByNumber(String s) {
        phoneBook.removeIf(p -> p.getPhone().equals(s));
    }
}
