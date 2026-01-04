package models;

public class Student extends Person{

    public Student(){}

    public Student(String name, String surname, double gpa){
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }


    @Override
    public int compareTo(Person anotherPerson){
        return Double.compare(this.getPaymentAmount(), anotherPerson.getPaymentAmount());
    }


    @Override
    public String toString(){
        return "Student: " + id + ". " + name + " " + surname + " earns " + getPaymentAmount() + " tenge";
    }
}
