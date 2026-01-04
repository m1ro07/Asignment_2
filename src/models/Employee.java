package models;

public class Employee extends Person{
    public String position;
    public double salary;

    public Employee(){}

    public Employee(String name, String surname, String position, double salary){
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public double getPaymentAmount(){
        return salary;
    }

    @Override
    public int compareTo(Person anotherPerson){
        return Double.compare(this.getPaymentAmount(),anotherPerson.getPaymentAmount());
    }

    @Override
    public String toString(){
        return "Employee: " + id + ". " + name + " " + surname + " " + position + " : " + salary;
    }

}
