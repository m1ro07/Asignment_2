package models;

public class Student extends Person{

    public Student(){}

    public Student(String name, String surname, double gpa){
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
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
        return "Student: " + id + ". " + name + " " + surname + " earns " + getPaymentAmount() + " tenge";
    }
}
