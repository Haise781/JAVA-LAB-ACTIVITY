
import java.io.*;
import java.util.*;

class Book implements Serializable {

    private int id;
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowBook() {
        this.isBorrowed = true;
    }

    public void returnBook() {
        this.isBorrowed = false;
    }

    @Override
    public String toString() {
        return "[ID: " + id + "] " + title + " by " + author
                + (isBorrowed ? " (Borrowed)" : " (Available)");
    }
}

public class Library_Management_System {
    private static final String FILE_NAME = "library.dat";
    private static List<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        loadBooks(); // Load existing books from file
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Library Management System ===");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 ->
                    addBook(sc);
                case 2 ->
                    viewBooks();
                case 3 ->
                    borrowBook(sc);
                case 4 ->
                    returnBook(sc);
                case 5 ->
                    saveBooks();
                default ->
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        sc.close();
    }

    private static void addBook(Scanner sc) {
        System.out.print("Enter book ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter book title: ");
        String title = sc.nextLine();
        System.out.print("Enter book author: ");
        String author = sc.nextLine();

        books.add(new Book(id, title, author));
        System.out.println("Book added successfully!");
    }

    private static void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("\n--- Book List ---");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    private static void borrowBook(Scanner sc) {
        System.out.print("Enter book ID to borrow: ");
        int id = sc.nextInt();
        for (Book book : books) {
            if (book.getId() == id) {
                if (!book.isBorrowed()) {
                    book.borrowBook();
                    System.out.println("You borrowed: " + book.getTitle());
                    return;
                } else {
                    System.out.println("Book is already borrowed!");
                    return;
                }
            }
        }
        System.out.println("Book not found!");
    }

    private static void returnBook(Scanner sc) {
        System.out.print("Enter book ID to return: ");
        int id = sc.nextInt();
        for (Book book : books) {
            if (book.getId() == id) {
                if (book.isBorrowed()) {
                    book.returnBook();
                    System.out.println("Book returned: " + book.getTitle());
                    return;
                } else {
                    System.out.println("This book was not borrowed.");
                    return;
                }
            }
        }
        System.out.println("Book not found!");
    }

    private static void saveBooks() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(books);
            System.out.println("Books saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving books: " + e.getMessage());
        }
    }

    private static void loadBooks() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            books = (List<Book>) ois.readObject();
            System.out.println("Books loaded successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("No saved books found. Starting fresh.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading books: " + e.getMessage());
        }
    }
}
