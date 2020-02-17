import java.util.*;

public class ArraysListHash {

    public static void main(String[] args) {
        // Three ways to store data
        // 1. Arrays - static, must declare size, uses primitive types
        // 2. ArrayList - dynamic, more like JS arrays, more intuitive.
        // 3. HashMap - key : value pair, good for storing and accessing complexed data sets

        // 1. Arrays
        // limitations: hard to manipulate, have to make copy to add and remove.
        // pros:
//        int[] numArrays = new int[4]; // declare an array of size 4;
        int[] numArrays = new int[]{10,2,5,450};

        // 2. Lists
        // Limitations: no sorting without implementing sort methods
        // Pros: has easy to use methods for adding and removing
        List<Integer> numList = new ArrayList<>();
//        numList.addAll();
        numList.add(100);
        numList.add(33);
        numList.add(7821973);
        numList.add(4502332);

        // Sorting using Arrays sort method
        Arrays.sort(numArrays);
        System.out.println(Arrays.toString(numArrays));

        // Sorting using Lists
        Object[] copyArray = numList.toArray(); // convert into Arrays format
        Arrays.sort(copyArray);
        System.out.println(Arrays.toString(copyArray));

        // 3. Hash Map
        // Can take any two types of objects as parameters
        // Limitations: no sorting method
        Map<Integer, Student> studentID = new HashMap<>(); // String is the student name, id is the student id


        studentID.put(143434, new Student("hung", 143434));
        studentID.put(2232,  new Student("gaston", 2232));
        studentID.put(36855,  new Student("briana", 36855));
        studentID.put(4929,  new Student("charlie", 4929));
        studentID.put(52827,  new Student("miguel", 52827));

        // Search through the student database by ID, I can get the student object/information
        for (Student student : studentID.values()) {
            if (student.id == 4929) {
//                System.out.println(student.name);
//                System.out.println(student.id);
            }
        }
//        System.out.println(studentID.get(2232).name);
//        System.out.println(studentID.containsKey(9999));

        List<Student> studentList = new ArrayList<>(studentID.values());

        System.out.println(studentList.get(0).name);

//        studentID.keySet(); // return all student ids
//        studentID.values(); // returns all student objects



    }
}
