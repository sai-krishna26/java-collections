package com.xworkz.collections.genericsRecap.example2;

public class Product<T,P,Y>{
    public T id;
    public P name;
    public Y cost;

    public Product(T id,P name,Y cost)
    {
        this.id=id;
        this.name=name;
        this.cost=cost;
    }

    void display()
    {
        System.out.println("id:"+id);
        System.out.println("name:"+name);
        System.out.println("cost:"+cost);
    }
}
