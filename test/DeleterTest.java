import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.io.File;
import java.io.IOException;

public class DeleterTest {
    @Test
    public void deleteTest() throws IOException {
        File file = new File("D://TiVPO_3//Main.txt");
        Deleter del = new Deleter(file);
        Assertions.assertTrue(del.delete());
    }
}
