import java.util.*;

public class Main {
    // This function returns a Predicate that can be used to filter distinct elements
    public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
        // Create a ConcurrentHashMap to store unique keys
        Map<Object, Boolean> map = new ConcurrentHashMap<>();
        
        // Return a Predicate that checks if the key extracted from an element
        // has already been added to the map. If not, add it and return true,
        // indicating that the element is distinct. If it's already in the map,
        // return false, indicating that the element is a duplicate.
        return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }

    public static void main(String[] args) {
        // Create some Person objects
        Person lokeshOne = new Person(1, "Lokesh", "Gupta");
        Person lokeshTwo = new Person(2, "Lokesh", "Gupta");
        Person lokeshThree = new Person(3, "Lokesh", "Gupta");
        Person brianOne = new Person(4, "Brian", "Clooney");
        Person brianTwo = new Person(5, "Brian", "Clooney");
        Person alex = new Person(6, "Alex", "Kolen");
        
        // Add them to a collection
        Collection<Person> list = Arrays.asList(alex, brianOne, brianTwo, lokeshOne, lokeshTwo, lokeshThree);

        // Get distinct objects by key
        List<Person> distinctElements = list.stream()
                .filter(distinctByKey(p -> p.getFname() + " " + p.getLname()))
                .collect(Collectors.toList());

        System.out.println(distinctElements);
    }

    // Person class definition (assuming it exists)
    static class Person {
        private int id;
        private String fname;
        private String lname;

        public Person(int id, String fname, String lname) {
            this.id = id;
            this.fname = fname;
            this.lname = lname;
        }

        public String getFname() {
            return fname;
        }

        public String getLname() {
            return lname;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", fname='" + fname + '\'' +
                    ", lname='" + lname + '\'' +
                    '}';
        }
    }
}
