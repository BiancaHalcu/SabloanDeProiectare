public class AlignRight implements AlignStrategy{
    @Override
    public void render(Paragraph p) {
        p.setText("######"+p.getText());
    }
}
