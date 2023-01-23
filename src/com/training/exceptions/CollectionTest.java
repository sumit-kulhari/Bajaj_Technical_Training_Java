package com.training.exceptions;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args)
    {
        Set<String> set = new HashSet<String>();
        set.add("Sumit");
        set.add("Shivam");
        set.add("Jayesh");
        System.out.println(set);

        Set<String> tSet = new TreeSet<String>();
        tSet.add("Abhinav");
        tSet.add("Sumit");
        tSet.add("Jayesh");
        tSet.add("Ram");
        System.out.println(tSet);

        List<String> l = new ArrayList<String>();

        l.add("Sumit");
        l.add("Devansh");
        l.add("Pratham");
        l.add("Shivam");
        l.add("Saurabh");

        l.sort(new MyCustomComparator());
        System.out.println(l);

        List<TeamScoreCompare> lt = new ArrayList<TeamScoreCompare>();
        lt.add(new TeamScoreCompare(45, "FCB"));
        lt.add(new TeamScoreCompare(30, "RMA"));
        lt.add(new TeamScoreCompare(40, "PSG"));

        System.out.println(lt);
        Collections.sort(lt);
        System.out.println(lt);

    }
}