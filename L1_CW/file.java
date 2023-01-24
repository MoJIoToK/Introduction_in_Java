import java.io.FileWriter;
import java.io.IOException;

public class file {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("1L_CW/file.txt", false)) {
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 3");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        } 
}

