package OOP20_2;

interface Printable {
    void print();
}

class Document implements Printable {
    public void print() {
        System.out.println("Printing document");
    }
}

class Image implements Printable {
    public void print() {
        System.out.println("Printing image");
    }
}

public class Main9 {
    public static void main(String[] args) {
        Document document = new Document();
        document.print();

        Image image = new Image();
        image.print();
    }
}
