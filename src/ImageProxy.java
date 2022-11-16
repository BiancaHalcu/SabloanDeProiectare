public class ImageProxy implements Element {

    private String url;
    private Image realImage;
    public ImageProxy(String name) {
        this.url=name;
    }


    public Image loadImage() {
        if(realImage==null) {
            realImage=new Image(url);
        }
        return realImage;
    }

    @Override
    public void print() {
        loadImage().print();
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
}
