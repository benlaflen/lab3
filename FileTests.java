import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.*;

public class FileTests {
    @Test
    public void testgetfile() {
        ArrayList<File> solution = new ArrayList<>();
        solution.add(new File("some-files/a.txt"));
        solution.add(new File("some-files/more-files/b.txt"));
        solution.add(new File("some-files/more-files/c.java"));
        solution.add(new File("some-files/even-more-files/d.java"));
        solution.add(new File("some-files/even-more-files/a.txt"));

        try {
            assertEquals(solution, FileExample.getFiles(new File("some-files/")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
