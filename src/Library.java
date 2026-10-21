
import java.util.ArrayList;
import java.util.List;

public class Library {
    private final ArrayList<Book> bookList = new ArrayList<>();

    public Library() {}

    public void addBook(String title, String author, int year){



    }

    public List<Book> listBooks() {
        return List.copyOf(bookList);
    }

    public void borrowBook(String title){
        var book = bookList.stream().findFirst(b -> b.title.equalsIgnoreCase(isbn.trim())).orElseThrow(() -> new IllegalStateException("Boken finns ej att låna"))
    }

    public void returnBook(int isbn){



    }

}
