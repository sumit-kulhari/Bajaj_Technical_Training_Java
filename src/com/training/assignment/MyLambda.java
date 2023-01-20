package com.training.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyLambda {
    public static void main(String args[]){
        Employee emp1 = new Employee("Ram","duo",101,"ram@gmail.com",45000);
        Employee emp2 = new Employee("Prajesh","Ram",102,"prajesh@gmail.com",55000);
        Employee emp3 = new Employee("sam","man",103,"sam@gmail.com",65000);
        Employee emp4 = new Employee("ron","dan",104,"ron@gmail.com",35000);
        List<Employee> list = new ArrayList<Employee>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        List<Float>salaryList = list.stream().map(emp->emp.salary).collect(Collectors.toList());
        System.out.println(salaryList);
    }

}
