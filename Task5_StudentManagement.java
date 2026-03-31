import java.util.*;

class Student {
    String id;
    String name;
    float marks;
    String phone;
    String place;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        id = sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks = sc.nextFloat();
        sc.nextLine();

        System.out.print("Enter Phone Number: ");
        phone = sc.nextLine();

        System.out.print("Enter Place: ");
        place = sc.nextLine();
    }

    void display() {
        System.out.println(id + " | " + name + " | " + marks + " | " + phone + " | " + place);
    }
}

public class Task5_StudentManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    Student s = new Student();
                    s.input();
                    list.add(s);
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    if (list.isEmpty()) {
                        System.out.println("No students available.");
                    } else {
                        System.out.println("\nID | Name | Marks | Phone | Place");
                        for (Student st : list) {
                            st.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    String searchId = sc.nextLine();
                    boolean found = false;

                    for (Student st : list) {
                        if (st.id.equals(searchId)) {
                            st.display();
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);
    }
}