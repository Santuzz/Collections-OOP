package exercises;

import java.util.*;
/**
 * You can find many more here:
 * https://www.w3resource.com/java-exercises/collection/index.php
 *
 * Preferences -> Editor -> General -> Code folding -> One-line methods (uncheck)
 * Code -> Folding -> Collapse All
 * Code -> Folding -> Expand Doc Comments
 */
public class Sets {
    /**
     * Write a function returning the intersection of two given sets (without using library functions)
     */
    public static Set<Integer> intersection_manual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> tmp = new HashSet<Integer>();
        for(int i : first){
            if(second.contains(i)){
                tmp.add(i);
            }
        }
        return tmp;
    }

    /**
     * Write a function returning the union of two given sets (without using library functions)
     */
    public static Set<Integer> union_manual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> s = new HashSet<>();
        for(int i : first){
            s.add(i);
        }
        for(int i : second){
            s.add(i);
        }
        return s;
    }

    /**
     * Write a function returning the intersection of two given sets (see retainAll())
     */
    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> fin = new HashSet<>(first);
        fin.retainAll(second);
        return fin;
    }



    /**
     * Write a function returning the union of two given sets (see addAll())
     *
     */
    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> tmp = new HashSet<>(first);
        tmp.addAll(second);
        return tmp;
    }

    /**
     * Write a function to transform a set into a list without duplicates
     * Note well: collections can be created from another collection!
     */
    public static List<Integer> toList(Set<Integer> source) {
        return new ArrayList<>(source);
    }

    /**
     * Write a function to remove duplicates from a list
     * Note well: collections can be created from another collection!
     */
    public static List<Integer> removeDuplicates(List<Integer> l) {
        return new ArrayList<>(new HashSet<>(l));
    }

    /**
     * Write a function to remove duplicates from a list without using the constructors trick seen above
     */
    public static List<Integer> removeDuplicates_manual(List<Integer> l) {
        Set<Integer> s1 = new HashSet<>();
        List<Integer> l1 = new ArrayList<>();
        for(int i : l){
            if(!s1.contains(i)){
                s1.add(i);
                l1.add(i);
            }
        }
        return l1;
    }

    /**
     * Write a function accepting a string s
     * returning the first recurring character
     * For example firstRecurringCharacter("abaco") -> a.
     */
    public static String firstRecurringCharacter(String s) {
        Set<Character> c = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if(c.contains(s.charAt(i))){
                return String.valueOf(s.charAt(i));
            }
            c.add(s.charAt(i));
        }
        return null;
    }

   /* *//**
     * Write a function accepting a string s, and returning a set comprising all recurring characters.
     * For example allRecurringChars("mamma") -> [m, a].
     *//*
    public static Set<Character> allRecurringChars(String s) {
        Set<Character> c = new HashSet<>()
        for (int i = 0; i < s.length(); i++) {

        }
    }

    *//**
     * Write a function to transform a set into an array
     *//*
    public static Integer[] toArray(Set<Integer> source) {

    }

    *//**
     * Write a function to return the first item from a TreeSet
     * Note well: use TreeSet specific methods
     *//*
    public static int getFirst(TreeSet<Integer> source) {

    }

    *//**
     * Write a function to return the last item from a TreeSet
     * Note well: use TreeSet specific methods
     *//*
    public static int getLast(TreeSet<Integer> source) {

    }

    *//**
     * Write a function to get an element from a TreeSet which is strictly greater than a given element.
     * Note well: use TreeSet specific methods
     *//*
    public static int getGreater(TreeSet<Integer> source, int value) {

    }*/
}