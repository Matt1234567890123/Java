import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.io.*;

public class Person implements Comparable<Person> {
    private String firstName,lastName;
    private LocalDate birthDate;
    private LocalDate deathDate;
    private SortedSet<Person> children;

    public Person(String firstName, String lastName, LocalDate birthDate) {
        this(firstName, lastName, birthDate, null);
    }
    public Person(String firstName, String lastName, LocalDate birthDate, LocalDate deathDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
        this.children = new TreeSet<>();
    }
    public boolean adopt(Person child)
    {
        return this.children.add(child);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDay=" + birthDate +
                ", deathDay=" + deathDate +
                ", children=" + children +
                '}';
    }

    public Person getYoungestChild(){
        if(children.isEmpty()) return null;

        return children.last();
    }

    @Override
    public int compareTo(Person o) {
         return this.birthDate.compareTo(o.birthDate);
    }

    public List<Person> getChildren(){
        return List.copyOf(children);
    }

    public String name(){
        return this.firstName + " " + this.lastName;
    }

    public static Person fromCsvLine(String line) throws NegativeLifespanException {
        String[] tokens = line.split(",");
        String[] nameTokens = tokens[0].split(" ");
        String firstName = nameTokens[0];
        String lastName = nameTokens[1];
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate birthDate = null;
        LocalDate deathDate = null;
        if(!tokens[1].isEmpty()) birthDate = LocalDate.parse(tokens[1], formatter);
        if(!tokens[2].isEmpty()) deathDate = LocalDate.parse(tokens[2], formatter);
        Person person = new Person(firstName, lastName, birthDate, deathDate);
        if(birthDate != null && deathDate != null){
            if(birthDate.isAfter(deathDate)){
                throw new NegativeLifespanException(person);
            }
        }
        return person;
    }
    public static List<Person> fromCsv(String path) {
        ArrayList<Person> people = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            reader.readLine();
            String line;
            while((line = reader.readLine()) != null) {
                try {
                    people.add(Person.fromCsvLine(line));
                } catch (NegativeLifespanException e) {
                    System.err.println(e.getMessage());
                }

            }
            return people;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public LocalDate getDeathDate() {
        return deathDate;
    }
}
