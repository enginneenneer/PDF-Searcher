import java.io.IOException;
import java.util.Collection;
import java.util.Scanner;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    public static void main(String[] args) throws IOException {
        /*
        PDFManager pdfManager = new PDFManager();
        Scanner filePath = new Scanner(System.in);
        String path = filePath.nextLine();
        pdfManager.setFilePath(path);
        System.out.println(pdfManager.ToText());
        */
        System.out.println("Path to the folder, make no mistakes, there is no warning");
        Scanner filePath = new Scanner(System.in);
        String folderPath = filePath.nextLine();
        Path dir = FileSystems.getDefault().getPath(folderPath);
        DirectoryStream<Path> stream = Files.newDirectoryStream( dir );
        for (Path path : stream) {
            Pattern p = Pattern.compile("\\.pdf$");
            Matcher m = p.matcher(path.getFileName().toString());
            if (m.find())
                // TODO Congrats you have founded the pdf, now search through it, long way to go
                System.out.println( path.getFileName() );
        }
        stream.close();
    }
}