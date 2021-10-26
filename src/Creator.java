import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Creator {
    File file = new File("D://TiVPO_3//Main.txt");

    public boolean adder(String par) {
        try {
            FileOutputStream fileOut = new FileOutputStream(file, true);
            for (int i = 0; i < 10; i++) {
                fileOut.write(Integer.parseInt(par));
            }
            fileOut.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
