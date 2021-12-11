
package Bai2;

public class Document {
    protected int NumberOfPage;
    protected String Athor;

    public Document() {
    }

    public Document(int numberOfPage, String athor) {
        NumberOfPage = numberOfPage;
        Athor = athor;
    }
    public int getNumberOfPage() {
        return NumberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        NumberOfPage = numberOfPage;
    }

    public String getAthor() {
        return Athor;
    }

    public void setAthor(String athor) {
        Athor = athor;
    }
}
