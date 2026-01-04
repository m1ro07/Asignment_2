import models.Employee;
import models.Person;
import models.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Collections;
import java.util.Scanner;

public class MyApplication {

    public static void printData(ArrayList<Person> list){
        for(Person p : list){
            System.out.println(p);
        }
    }


    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Person> people = new ArrayList<>();

        File file1 = new File("C:\\Users\\eseng\\IdeaProjects\\Asignment_2\\src\\source1\\employees");
        File file2 = new File("C:\\Users\\eseng\\IdeaProjects\\Asignment_2\\src\\source1\\students");

        Scanner sc1 = new Scanner(file1);
        Scanner sc2 = new Scanner(file2);

        while(sc1.hasNext()){
            String name = sc1.next();
            String surname = sc1.next();
            String position = sc1.next();
            double salary = sc1.nextDouble();

            people.add(new Employee(name, surname, position, salary));
        }


        while(sc2.hasNext()){
            String name = sc2.next();
            String surname = sc2.next();
            double gpa = sc2.nextDouble();

            people.add(new Student(name, surname, gpa));
        }

        sc1.close();
        sc2.close();

        Collections.sort(people);
        printData(people);

    }
}

