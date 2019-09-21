import java.util.Scanner;
public class Books {
    public static void main(String[] args) {
        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            scanner.nextLine().trim();
            Book[] book1 = new Book[n];
            for (int i = 0; i < n; i++) {
                String BookName = scanner.nextLine().trim();
                String AuthorName = scanner.nextLine().trim();
                long ISBN = Long.parseDouble(scanner.nextLine().trim());
                book1[i] = new Book(bookName, authorName, ISBNNumber);
            }
            for (int i = 0; i < n; i++) {

                System.out.println("----------------");
                for (int j = 0; j < n; j++) {
                    System.out.println(book1[j]);
                }
            }


        }

    }
}

class Book {
    private String bookName;
    private String authorName;
    private long ISBNNumber;

    public Book(String bookName, String authorName, long ISBNNumber) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.ISBNNumber = ISBNNumber;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public long getISBNNumber() {
        return ISBNNumber;
    }

    public void setISBNNumber(long ISBNNumber) {
        this.ISBNNumber = ISBNNumber;
    }

    public String getBookName() {
        return bookName;
    }

    @Override
    public String toString() {
        return String.
                format(getBookName(), getAuthorName(), getISBNNumber());
    }
}