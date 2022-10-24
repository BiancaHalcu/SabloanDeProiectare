import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String name;
    private List<SubChapter> subChapters=new ArrayList<>();

    public Chapter(String name) {
        this.name = name;
    }

    public int createSubChapter(String s) {
        subChapters.add(new SubChapter(s));
        return subChapters.size();
    }

    public SubChapter getSubChapter(int indexSubChapterOneOne) {
        return subChapters.get(indexSubChapterOneOne-1);
    }
    public void print(){
        System.out.println(name);
    }
}
