package sets_maps;


import java.util.*;

public class setMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<Integer> studentIDs = new HashSet<>();
        HashMap<Integer, String> students = new HashMap<>();
        TreeMap<Integer, String> sortedStudents = new TreeMap<>();

        System.out.println("=== STUDENT REGISTRATION ===");

        // Read five student IDs
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            // Check for duplicate IDs
            if (studentIDs.contains(id)) {
                System.out.println("Duplicate ID! Registration rejected.");
            } else {
                studentIDs.add(id);

                System.out.print("Enter Student Name: ");
                String name = sc.nextLine();

                students.put(id, name);

                System.out.println("Student registered successfully!");
            }
        }

        // Display unique student count
        System.out.println("\nTotal Unique Students: " + studentIDs.size());

        // Transfer students to TreeMap for ascending order
        for (int id : studentIDs) {
            sortedStudents.put(id, students.get(id));
        }

        // Display sorted student IDs and names
        System.out.println("\n=== REGISTERED STUDENTS (ASCENDING ORDER) ===");

        for (int id : sortedStudents.keySet()) {
            System.out.println("ID: " + id +
                    " | Name: " + sortedStudents.get(id));
        }

        sc.close();
    }
}
