import java.io.File;
import java.io.IOException;

public class Deleter {
    File file;

    public Deleter(File file) {
        this.file = file;
    }

    public boolean delete() {
        return file.delete();
    }
}
