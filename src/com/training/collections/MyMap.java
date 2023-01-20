package com.training.collections;
import com.training.assignment.Employee;
import java.util.*;

public class MyMap {
    public static void main(String args[]){
//        myHashmap();
//        myTreemap();
//        myLinkedMap();
        myHashMapWithEmp();
    }
    public static void myHashmap(){
        Map<Integer,String>map = new HashMap<Integer,String>();
        map.put(101,"Chennai");
        map.put(103,"Pune");
        map.put(102,"Mumbai");

        Set set = map.entrySet();
        Iterator itr = set.iterator();
        while(itr.hasNext()){
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }

    public static void myTreemap(){
        Map<Integer,String>map = new TreeMap<Integer,String>();
        map.put(101,"Chennai");
        map.put(103,"Pune");
        map.put(102,"Mumbai");

        Set<Integer> sett = map.keySet();
        for(Integer key:sett){
            String value = map.get(key);
            System.out.println(key+" "+ value);
        }
    }

    public static void myLinkedMap(){
        Map<Integer,String>map = new LinkedHashMap<Integer,String>();
        map.put(101,"Chennai");
        map.put(103,"Pune");
        map.put(102,"Mumbai");

        Set set = map.entrySet();
        Iterator itr = set.iterator();
        while(itr.hasNext()){
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
    public static void myHashMapWithEmp(){
        Employee emp1 = new Employee("Ram","duo",101,"ram@gmail.com",45000);
        Employee emp2 = new Employee("Prajesh","Ram",102,"prajesh@gmail.com",55000);
        Employee emp3 = new Employee("sam","man",103,"sam@gmail.com",65000);
        Employee emp4 = new Employee("ron","dan",104,"ron@gmail.com",35000);

        Map<Employee,String> map = new HashMap<Employee,String>();
        map.put(emp1,"Pune");
        map.put(emp2,"Chennai");
        map.put(emp3,"Delhi");
        map.put(emp4,"Mumbai");

        System.out.println(map);

    }
}
