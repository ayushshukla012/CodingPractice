package Java8Features;

// Given a list of Person objects with name, age, and gender, use Stream API to:

// Filter out all people younger than 18.

// Convert all names to uppercase.

// Collect the filtered list into a new List<Person>.

// Why this matters: Tests filter(), map(), and collect() usage.

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPI {
    
    
static class Person {
    String name;
    int age;
    char gender;
    
    // Constructor
    public Person() {
    }
    
    // Constructor with parameters
    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public char getGender() {
        return gender;
    }
    
}
    
    List<Person> people = new ArrayList<>();
    
    // Constructor to initialize the list of people
    public StreamAPI() {
        people.add(new Person("Alice", 20, 'F'));
        people.add(new Person("Bob", 17, 'M'));
        people.add(new Person("Charlie", 22, 'M'));
        people.add(new Person("Diana", 15, 'F'));
        people.add(new Person("Eve", 30, 'F'));
    }

    // Method to filter, map, and collect the list of people
        public void filterAndPrintAdults() {
 List<String> filteredPerson = people.stream().filter(e -> e.age >= 18).map(e -> e.getName().toUpperCase()).collect(Collectors.toList());
 
 System.out.println(filteredPerson);
    }
    
    public static void main(String[] args) {
   StreamAPI obj = new StreamAPI();
   obj.filterAndPrintAdults();
    }
       
}

// people.stream().allMatch(predicate -> predicate.age >= 18);
//             people.stream().anyMatch(predicate -> predicate.age >= 18);
//             people.stream().noneMatch(predicate -> predicate.age >= 18);
//             people.stream().findFirst();
//             people.stream().findAny();
//             people.stream().count();
//             people.stream().max(Comparator.comparingInt(Person::getAge));
//             people.stream().min(Comparator.comparingInt(Person::getAge));
//             people.stream().sorted(Comparator.comparingInt(Person::getAge));
//             people.stream().sorted(Comparator.comparing(Person::getName));
//             people.stream().sorted(Comparator.comparing(Person::getName).reversed());
//             people.stream().sorted(Comparator.comparing(Person::getName).reversed().thenComparingInt(Person::getAge));
//             people.stream().sorted(Comparator.comparing(Person::getName).reversed().thenComparingInt(Person::getAge).reversed());
//             people.stream().sorted(Comparator.comparing(Person::getName).reversed().thenComparingInt(Person::getAge).reversed().thenComparing(Person::getGender));
//             people.stream().sorted(Comparator.comparing(Person::getName).reversed().thenComparingInt(Person::getAge).reversed().thenComparing(Person::getGender).reversed());
//             people.stream().sorted(Comparator.comparing(Person::getName).reversed().thenComparingInt(Person::getAge).reversed().thenComparing(Person::getGender).reversed().thenComparing(Person::getName));
//             people.stream().sorted(Comparator.comparing(Person::getName).reversed().thenComparingInt(Person::getAge).reversed().thenComparing(Person::getGender).reversed().thenComparing(Person::getName).reversed());
//             people.stream().sorted(Comparator.comparing(Person::getName).reversed().thenComparingInt(Person::getAge).reversed().thenComparing(Person::getGender).reversed().thenComparing(Person::getName).reversed().thenComparingInt(Person::getAge));
//             people.stream().sorted(Comparator.comparing(Person::getName).reversed().thenComparingInt(Person::getAge).reversed().thenComparing(Person::getGender).reversed().thenComparing(Person::getName).reversed().thenComparingInt(Person::getAge).reversed());
//             people.stream().sorted(Comparator.comparing(Person::getName).reversed().thenComparingInt(Person::getAge).reversed().thenComparing(Person::getGender).reversed().thenComparing(Person::getName).reversed().thenComparingInt(Person::getAge).reversed().thenComparing(Person::getGender));
//             people.stream().sorted(Comparator.comparing(Person::getName).reversed().thenComparingInt(Person::getAge).reversed().thenComparing(Person::getGender).reversed().thenComparing(Person::getName).reversed().thenComparingInt(Person::getAge).reversed().thenComparing(Person::getGender).reversed());
//             people.stream().sorted(Comparator.comparing(Person::getName).reversed().thenComparingInt(Person::getAge).reversed().thenComparing(Person::getGender).reversed().thenComparing(Person::getName).reversed().thenComparingInt(Person::getAge).reversed().thenComparing(Person::getGender).reversed().thenComparingInt(Person::getAge));
//             people.stream().sorted(Comparator.comparing(Person::getName).reversed().thenComparingInt(Person::getAge).reversed().thenComparing(Person::getGender).reversed().thenComparing(Person::getName).reversed().thenComparingInt(Person::getAge).reversed().thenComparing(Person::getGender).reversed().thenComparingInt(Person::getName));
//             people.stream().sorted(Comparator.comparing(Person::getName).reversed().thenComparingInt(Person::getAge).reversed().thenComparing(Person::getGender).reversed().thenComparing(Person::getName).reversed().thenComparingInt(Person::getAge).reversed().thenComparing(Person::getGender).reversed().thenComparingInt(Person::getName).reversed());
//             people.stream().sorted(Comparator.comparing(Person::getName).reversed().thenComparingInt(Person::getAge).reversed().thenComparing(Person::getGender).reversed().thenComparing(Person::getName).reversed().thenComparingInt(Person::getAge).reversed().thenComparing(Person::getGender).reversed().thenComparingInt(Person::getName).reversed().thenComparingInt(Person::getAge));
//             people.stream().sorted(Comparator.comparing(Person::getName).reversed().thenComparingInt(Person::getAge).reversed().thenComparing(Person::getGender).reversed().thenComparing(Person::getName).reversed().thenComparingInt(Person::getAge).reversed().thenComparing(Person::getGender).reversed().thenComparingInt(Person::getName).reversed().thenComparingInt(Person::getAge).reversed());
//             people.stream().sorted(Comparator.comparing(Person::getName).reversed().thenComparingInt(Person::getAge).reversed().thenComparing(Person::getGender).reversed().thenComparing(Person::getName).reversed().thenComparingInt(Person::getAge).reversed().thenComparing(Person::getGender).reversed().thenComparingInt(Person::getName).reversed().thenComparingInt(Person::getAge).reversed().thenComparingInt(Person::getGender));
//             people.stream().sorted(Comparator.comparing(Person::getName).reversed().thenComparingInt(Person::getAge).reversed().thenComparing(Person::getGender).reversed().thenComparing(Person::getName).reversed().thenComparingInt(Person::getAge).reversed().thenComparing(Person::getGender).reversed().thenComparingInt(Person::getName).reversed().thenComparingInt(Person::getAge).reversed().thenComparingInt(Person::getGender).reversed());
//             people.stream().spliterator();
//             people.stream().forEach(e -> System.out.println(e.getName()));
//             people.stream().forEachOrdered(e -> System.out.println(e.getName()));
//             people.stream().peek(e -> System.out.println(e.getName()));
//             people.stream().limit(3);
//             people.stream().skip(2);
//             people.stream().distinct();
//             people.stream().takeWhile(predicate -> predicate.age >= 18);
//             people.stream().dropWhile(predicate -> predicate.age >= 18);
//             people.stream().flatMap(e -> Stream.of(e.getName()));
//             people.stream().flatMap(e -> Stream.of(e.getName(), e.getGender()));
