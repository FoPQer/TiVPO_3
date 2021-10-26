import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class CreaterTest {
    @Test
    public void adderTest(){
        String name = "544";
        InputStream in = new ByteArrayInputStream(name.getBytes());
        System.setIn(in);
        Scanner scan = new Scanner(System.in);
        Assertions.assertTrue(new Creator().adder(scan.nextLine()));
    }
}
