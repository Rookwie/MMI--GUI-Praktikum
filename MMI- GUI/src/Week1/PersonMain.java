package Week1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PersonMain {
    public static void main(String[] args) {
        Person[] person = new Person[5]; // Oder als Arraylist (falls Array länge nicht bekannt):  ArrayList<Person> = new ArrayList<>();

        person[0] = new Person("Test1", 26); // ArrayList: .add(new Person("Test1", 26));
        person[1] = new Person("Test2", 67);
        person[2] = new Person("Test3", 17);
        person[3] = new Person("Test4", 37);
        person[4] = new Person("Test5", 11);


        System.out.println("The average age is: " + averageAge(person));

        writePersonListToFile("People.txt", person);
    }

    public static double averageAge(Person[] person) {
        if (person.length == 0) {
            return 0;
        }

        int sum = 0;

        for (Person people : person) {
            sum += people.getAge();
        }

        return (double) sum / person.length;
    }

    public static void writePersonListToFile(String filename, Person[] person) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename)); // Oder ohne Buffer (nicht effizient) mit: FileWriter writer = new FileWriter(filename);

            for (Person people : person) {
                writer.write("Name: " + people.getName() + ", Age: " + people.getAge());
                writer.newLine();
            }

            writer.close();
            System.out.println("File was successfully written");
        } catch (IOException e) {
            System.err.println("An error occurred and the file couldn't be written");

        }
    }
}
