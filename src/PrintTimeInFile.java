
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintTimeInFile {
    public static void main (String args []) throws IOException {

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date dateObj = new Date();
        System.out.println(df.format(dateObj));

        BufferedWriter writer = new BufferedWriter(new FileWriter("c:/users/i001491/TimeFormat.txt"));
        writer.write(df.format(dateObj));
        writer.close();
    }
}
