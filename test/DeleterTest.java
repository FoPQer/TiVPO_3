import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.io.File;

public class DeleterTest {
    @Test
    public void deleteTest(){
        File file = new File("D://TiVPO_3//Main.txt");
        Assertions.assertEquals(file.length(), 0);
    }
}
