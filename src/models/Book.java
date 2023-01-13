package models;

import java.util.ArrayList;
import java.util.List;

public class Book implements Visitee{
    private String title;
    private Author author;
    private List<Chapter> chapter=new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("models.Book: " + title);
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

    public void addContent(Element e) {
        Section s = new Section();
        s.add(e);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBook(this);
    }
}
