package com.training.exceptions;

import java.util.ArrayList;
import java.util.List;

class Item
{
    int itemId;
    String name;
    double price;
}
class EmptyCartException extends Exception
{
    EmptyCartException(String s)
    {
        super(s);
    }
}
public class EmptyCart {

    static void display(List<String> l)
    {
        try
        {
            if(l.size()==0)
                throw new EmptyCartException("Cart is Empty");
            else {
                for (String s: l)
                {
                    System.out.println(s);
                }
            }
        }
        catch (EmptyCartException e)
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args)
    {
        List<String> l = new ArrayList<>();

        display(l);

        l.add("Soap");
        l.add("Detergent");
        l.add("Deodorant");

        display(l);
    }
}
