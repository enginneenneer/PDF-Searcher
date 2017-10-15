import java.io.IOException;
import java.util.Scanner;


public class App {

    public static void main(String[] args) throws IOException {

        PDFManager pdfManager = new PDFManager();
        Scanner filePath = new Scanner(System.in);
        String path = filePath.nextLine();
        pdfManager.setFilePath(path);
        System.out.println(pdfManager.ToText());

    }
}