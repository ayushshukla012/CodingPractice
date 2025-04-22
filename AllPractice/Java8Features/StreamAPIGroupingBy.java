package Java8Features;

import java.util.*;
import java.util.stream.Collectors;


// Grouping By:

// Given a list of Person objects with a city attribute, group them by city using streams.​
public class StreamAPIGroupingBy {

    static class Person {
        int id;
        String name;
        String city;

        public Person() {
        }

        public Person(int id, String name, String city) {
            this.id = id;
            this.name = name;
            this.city = city;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getCity() {
            return city;
        }
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(2, "Alice", "New York"));
        people.add(new Person(3, "Bob", "Los Angeles"));
        people.add(new Person(4, "Charlie", "New York"));
        people.add(new Person(5, "Diana", "Chicago"));
        people.add(new Person(6, "Eve", "Los Angeles"));

        List<String> cities = people.stream()
                            .collect(Collectors.groupingBy(Person::getCity)) // Group by city
                            .entrySet() // Convert to entry set for easier manipulation
                            .stream() // Stream the entry set
                            .map(entry -> entry.getKey() + ": " + entry.getValue().stream() // For each entry, get the key (city) and value (list of people)
                                    .map(Person::getName) // Map to names
                                    .collect(Collectors.joining(", "))) // Join names with a comma
                            .collect(Collectors.toList()); // Collect to a list
        System.out.println(cities);
    }
    
}
