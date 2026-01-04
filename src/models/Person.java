package models;

public class Person implements Payable, Comparable<Person>{
    public static int id_gen = 1;
    public final int id;
    public String name;
    public String surname;
    public double gpa;


    public Person(){
        id = id_gen++;
    }

    public Person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }

    @Override
    public int compareTo(Person anotherPerson){
        return Double.compare(this.getPaymentAmount(), anotherPerson.getPaymentAmount());
    }

    @Override
    public double getPaymentAmount(){
        return 0;
    }

    @Override
    public String toString(){
        return id + " " + name + " " + surname;
    }

}