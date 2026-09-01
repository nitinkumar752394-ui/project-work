import java.util.Scanner;

class SingleBookManagementSystem {

    int bookId;
    int totalCopy = 0;
    int avlCopy = 0;

    String bookName = "";
    String author = "";
    String bookCategory = "";

    boolean bookAdd = false;

    Scanner sc = new Scanner(System.in);

    void viewBook() {
        if(!bookAdd){
            System.out.println("No Book Added");
        } else {
            System.out.println("\n--- All Book Details ---");
            System.out.println("Book ID       : " + bookId);
            System.out.println("Book Name     : " + bookName);
            System.out.println("Book Author   : " + author);
            System.out.println("Book Category : " + bookCategory);
            System.out.println("Total Copies  : " + totalCopy);
            System.out.println("Available     : " + avlCopy);
        }
    }

    void addBook() {
        System.out.println("\n--- Add Book Details ---");

        System.out.print("Enter Book ID: ");
        bookId = sc.nextInt();

        sc.nextLine(); 

        System.out.print("Enter Book Name: ");
        bookName = sc.nextLine();

        System.out.print("Enter Book Author: ");
        author = sc.nextLine();

        System.out.print("Enter Book Category: ");
        bookCategory = sc.nextLine();

        System.out.print("Enter Total Number of Books: ");
        totalCopy = sc.nextInt();

        avlCopy = totalCopy;
        bookAdd = true;

        System.out.println("Book Added Successfully!");
    }

    void mainMenu() {
        System.out.println("\n===== Library Management System =====");
        System.out.println("1. Add Book");
        System.out.println("2. View Book");
        System.out.println("3. Search Book");
        System.out.println("4. Issue Book");
        System.out.println("5. Return Book");
        System.out.println("6. Delete Book");
        System.out.println("7. Library Report");
        System.out.println("8. Exit");
    }

    public static void main(String[] args) {

        SingleBookManagementSystem obj =
                new SingleBookManagementSystem();

        int choice;

        do {
            obj.mainMenu();

            System.out.print("Enter Your Choice: ");
            choice = obj.sc.nextInt();

            switch (choice) {

                case 1:
                    obj.addBook();
                    break;

                case 2:
                    obj.viewBook();
                    break;

                case 3:
                    System.out.println("Search Book feature coming soon.");
                    break;

                case 4:
                    System.out.println("Issue Book feature coming soon.");
                    break;

                case 5:
                    System.out.println("Return Book feature coming soon.");
                    break;

                case 6:
                    System.out.println("Delete Book feature coming soon.");
                    break;

                case 7:
                    System.out.println("Library Report feature coming soon.");
                    break;

                case 8:
                    System.out.println("Thank you for using Library Management System.");
                    break;

                default:
                    System.out.println("Invalid Choice! Please try again.");
            }

        } while (choice != 8);

        obj.sc.close();
    }
}