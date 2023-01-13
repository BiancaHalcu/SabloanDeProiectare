package models;

import services.AlignStrategy;

public class Paragraph implements Element, Visitee{
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }
    @Override
    public void print(){
        System.out.println("models.Paragraph: "+text);
    }


    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public Element get(int e) {
        return null;
    }


    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        alignStrategy.render(this);
        //declarare +set stategy aligns.render(this);
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visitParagraph(this);
    }
}
