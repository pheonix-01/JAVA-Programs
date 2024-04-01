mport java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private boolean available;

    public Book(String title) {
        this.title = title;
        this.available = true; 
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

class Student {
    private int registrationNumber;
    private boolean valid;

    public Student(int registrationNumber) {
        this.registrationNumber = registrationNumber;
       
        this.valid = checkValidity(registrationNumber);
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean isValid() {
        return valid;
    }

    private boolean checkValidity(int regNumber) {
       
        return regNumber > 0 && regNumber < 100;
    }
}


class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book.getTitle());
            }
        }
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.isAvailable()) {
                book.setAvailable(false);
                System.out.println("Book Issued: " + title);
                return;
            }
        }
        System.out.println("Sorry, the book : " + title + " is not available");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && !book.isAvailable()) {
                book.setAvailable(true);
                System.out.println("Successfully returned:  " + title);
                return;
            }
        }
        System.out.println("Book can not be returned" + title + "'.");
    }
}

 class MainMethod {
    public static void main(String[] args) {
      
        Library library = new Library();
        library.addBook(new Book("Java Programming"));
        library.addBook(new Book("Data Structures and Algorithms"));
        library.addBook(new Book("Microprocessor Interfacing"));

        Student student1 = new Student(8);

      
        library.displayAvailableBooks();              
        library.borrowBook("Java Programming");        
        library.borrowBook("Ethical Hacking and Cyber Law");
        library.returnBook("Advanced C Programming");                
        library.returnBook("Computer Organization and Architecture"); 
    }
}
