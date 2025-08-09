import java.util.Scanner;

   class ApplyStack {
    public static void main(String[] args) {
        int choice;
        Student x = null;
        Scanner sc = new Scanner(System.in);
        StackArray st = new StackArray(8);

        st.display();

        while (true) {
            System.out.println("1. Push a student");
            System.out.println("2. Pop a student");
            System.out.println("3. Display the top student");
            System.out.println("4. Display all students");
            System.out.println("5. Display the size of the stack");
            System.out.println("6. Search student by email");
            System.out.println("7. Quit\n");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            if (choice == 7)
                break;

            switch (choice) {
                case 1:
                    System.out.println("Enter Student roll: ");
                    int roll = sc.nextInt();
                    sc.nextLine(); // clear buffer
                    System.out.println("Enter Student Name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter Student Email: ");
                    String email = sc.nextLine();

                    Student s1 = Student.builder()
                            .roll(roll)
                            .name(name)
                            .email(email)
                            .build();
                    st.push(s1);
                    break;

                case 2:
                    try {
                        x = st.pop();
                        System.out.println("Popped student: " + x);
                    } catch (Exception e) {
                        // Empty stack handled inside pop()
                    }
                    break;

                case 3:
                    try {
                        System.out.println("Top student: " + st.peek());
                    } catch (Exception e) {
                        // Empty stack handled inside peek()
                    }
                    break;

                case 4:
                    st.display();
                    break;

                case 5:
                    System.out.println("Size of stack: " + st.size());
                    break;

                case 6:
                    System.out.println("Enter email to search: ");
                    String searchEmail = sc.nextLine();
                    System.out.println(st.search(searchEmail));
                    break;

                default:
                    System.out.println("WRONG CHOICE!!!!");
            }
            System.out.println();
        }
        sc.close();
    }
}
