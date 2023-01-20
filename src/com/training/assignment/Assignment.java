package com.training.assignment;

public class Assignment {

    public void max(int a, int b, int c){
        System.out.println(Math.max(Math.max(a,b),c));
    }
    public void swap(int a , int b){
        System.out.println("Values before swapping:\n "+a+"\n"+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("Values after swapping:\n "+a+"\n"+b);
    }
     public void swap3(int a , int b){
         System.out.println("Values before swapping:\n "+a+"\n"+b);
        int c=0;
        c = a;
        a = b;
        b = c;
         System.out.println("Values after swapping:\n "+a+"\n"+b);
     }

     void positive_negative(int a){
        if(a>0){
            System.out.println("The value is positive");
        } else if (a<0) {
            System.out.println("The value is negative");
        }
        else
            System.out.println("The value is Zero");
     }

     void prime(int n){
        for(int i=1;i<n/2;i++){
            if(n%i==0){
                System.out.println("Not prime");
                break;
            }
        }
        System.out.println("The number is not prime");
     }

     public void pallindrome(String a){
        StringBuffer buffer = new StringBuffer(a);
        buffer.reverse();
        String data = buffer.toString();
        if (a.equals(data)){
            System.out.println("Given String is palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
     }

     static void cube(int n){
        System.out.println(n*n*n);
     }

     public static void main(String args[]){
        Assignment day3 = new Assignment();
         day3.max(90,20,678);
         day3.prime(89);
         day3.pallindrome("Monday");
         day3.swap3(3,7);
         day3.swap(5,10);

         Employee emp1 = new Employee();

         Employee.emp.add(new Employee("Ram","duo",101,"ram@gmail.com",45000));
         Employee.emp.add(new Employee("Prajesh","Ram",102,"prajesh@gmail.com",55000));
         Employee.emp.add(new Employee("sam","man",103,"sam@gmail.com",65000));
         Employee.emp.add(new Employee("ron","dan",104,"ron@gmail.com",35000));
         Employee.emp.add(new Employee("rajesh","kumar",105,"rajesh@gmail.com",75000));
         Employee.emp.add(new Employee("rajeta","kumar",106,"rajeta@gmail.com",95000));

         Employee.dispsalary();
         Employee.printcnt();
         System.out.println(emp1);

     }
}
