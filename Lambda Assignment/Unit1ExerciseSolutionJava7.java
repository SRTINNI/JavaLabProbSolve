
package lambdaExamples.unit1ExercisePackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Unit1ExerciseSolutionJava7 {
    public static void main(String[] args) {
        List <Person> people = Arrays.asList(
                new Person ("Chonchol","Chowdhury",40),
                new Person("Abdur","Rahim", 50),
                new Person("Musfiqur", "Rahim", 31),
                new Person("Abdur", "Kader",70),
                new Person("Abu Haider", "Rony", 24),
                new Person("Mustafizur","Rahman", 25),
                new Person("Alauddin", "Ahmed", 47),
                new Person("Alauddin", "Babu", 41));
        
        //1. sort List by Last Name
        
        Collections.sort(people, new Comparator <Person>(){

            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }        
        });
        
        //2. Create a method that prints all the elements of this list        
        printAll(people);
        
        //3. Create a method that prints all the people that have last name start with R
        printLastNameStartWithR(people);
    }

    private static void printAll(List<Person> people) {
        System.out.println("  All the People names are: ");
        for (Person people1 : people) {
            System.out.println(people1);
        }
    }

    private static void printLastNameStartWithR(List<Person> people) {
        System.out.println("\n  Now Printing those Names which people Last name started with R: ");
        for (Person p : people) {
           if (p.getLastName().startsWith("R")){
               System.out.println(p);
           } 
        }
    }
}
