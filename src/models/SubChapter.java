package models;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String name;
    private List<Image> image=new ArrayList<>();
    private List<Paragraph> paragraph = new ArrayList<>();
    private List<Table> table=new ArrayList<>();

    public SubChapter(String s) {
        this.name=s;
    }

    public void createNewParagraph(String s) {
        paragraph.add(new Paragraph(s));
    }

    public void createNewImage(String s) {
        image.add(new Image(s));
    }

    public void createNewTable(String s) {
        table.add(new Table(s));
    }

    public void print(){
        System.out.println("Subchapter: "+name);
        paragraph.stream().forEach(s->s.print());
        image.stream().forEach(s->s.print());
        table.stream().forEach(s->s.print());
    }

}
