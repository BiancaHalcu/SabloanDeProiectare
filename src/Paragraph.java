import javax.naming.Context;

public class Paragraph implements Element{
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }
    @Override
    public void print(){
        System.out.println("Paragraph: "+text);
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

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        //declarare +set stategy aligns.render(this);
    }


}
