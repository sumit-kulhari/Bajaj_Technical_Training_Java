package com.training.collections;


import java.util.*;

public class TestCollection {
    public static void main(String args[]){
        myEmployeSet();
    }
    public static void myEmployeSet(){
        List<String> list = new ArrayList<>();
        list.add("Ram");
        list.add("Syam");
        list.add("Sita");
        list.add("Gita");

        Set<String> set = new HashSet<>();
        Set<String> tset = new TreeSet<>();

//        Printing using simple for
        for (int i=0;i< list.size();i++){
            String name = list.get(i);
            System.out.println(name);
        }

//        Printing using advanced for
        for (String name:list){
            System.out.println(name);
        }

//        using iterator
        Iterator<String>itr = list.iterator();
        while (itr.hasNext()){
            String name = itr.next();
            System.out.println(name);
        }

//        using list iterator
        ListIterator iterator = list.listIterator();
        while(iterator.hasNext()){
            String name = (String)iterator.next();
            System.out.println(name);
        }


    }
}
