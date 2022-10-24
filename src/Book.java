import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private Author author;
    private List<Chapter> chapter=new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println(title);
    }

    public void addAuthor(Author rpGheo) {
        this.author=rpGheo;
    }

    public int createChapter(String s) {
        chapter.add(new Chapter(s));
        return chapter.size();
    }

    public Chapter getChapter(int indexChapterOne) {
        return chapter.get(indexChapterOne-1);
    }
}
