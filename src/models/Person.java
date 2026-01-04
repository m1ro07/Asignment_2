package models;

public class Person implements Payable, Comparable<Person>{
    public static int id_gen = 1;
    public final int id;
    public String name;
    public String surname;
    public double gpa;
    public double salary;


    public Person(){
        id = id_gen++;
    }

    public Person(String name, String surname) {
        id = id_gen;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public int compareTo(Person anotherPerson){
        return Double.compare(this.getPaymentAmount(), anotherPerson.getPaymentAmount());
    }

    @Override
    public double getPaymentAmount(){
        if (gpa >= 2.67){
            return 36660;
        }
        return 0;
    }

    @Override
    public String toString(){
        return id + " " + name + " " + surname;
    }

}