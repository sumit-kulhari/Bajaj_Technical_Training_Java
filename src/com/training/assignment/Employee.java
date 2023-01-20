package com.training.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Employee {

    private String f_name;
    private String l_name;
    private Integer id;
    private String email;
    public float salary;

    static List<Employee> emp = new ArrayList<>();

    public Employee(String f_name, String l_name, Integer id, String email, float salary) {
        this.f_name = f_name;
        this.l_name = l_name;
        this.id = id;
        this.email = email;
        this.salary = salary;
    }

    public Employee() {

    }

    static void dispsalary(){
        for(int i=0;i<emp.size();i++){
            if(emp.get(i).salary>50000){
                System.out.println(emp.get(i).f_name);
            }
        }
    }

    /*@Override
    public int hashcode(){
        System.out.println("In hashcode");
        return id;
    }*/
    @Override
    public boolean equals(Object obj){
        System.out.println("In equals");
        if(this==obj)
            return true;
        if(obj==null)
            return false;
        if(getClass()!=obj.getClass())
            return false;
        Employee other = (Employee) obj;
        return id == other.id && Objects.equals(f_name,other.f_name)
                && Double.doubleToLongBits(salary)==Double.doubleToLongBits(salary);

    }


    static void printcnt(){
        System.out.println(emp.size());
    }

}
