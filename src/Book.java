import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<String> paragraph=new ArrayList<>();
    private List<String> image=new ArrayList<>();
    private List<String> table=new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public Book(List<String> paragraph, List<String> image) {
        this.paragraph = paragraph;
        this.image = image;
    }

    public Book(List<String> paragraph, List<String> image, List<String> table) {
        this.paragraph = paragraph;
        this.image = image;
        this.table = table;
    }

    public void createNewParagraph(String s) {
        this.paragraph.add(s);
    }

    public void createNewImage(String s) {
        this.image.add(s);
    }

    public void createNewTable(String s) {
        this.table.add(s);
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", paragraph='" + paragraph + '\'' +
                ", image='" + image + '\'' +
                ", table='" + table + '\'' +
                '}';
    }
}
