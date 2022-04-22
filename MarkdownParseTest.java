import static org.junit.Assert.*;
import java.nio.file.*;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;

import org.junit.*;
public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    static String getMarkdown(String fileName) throws IOException {
        Path fileName2 = Path.of(fileName);
        String content = Files.readString(fileName2);
        return content;
    }

    @Test
    public void MarkdownParseFileTester() throws IOException {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("https://something.com");
        arr.add("some-thing.html");
        assertEquals(arr, MarkdownParse.getLinks(MarkdownParseTest.getMarkdown("test-file.md")));
    }

    @Test
    public void MarkdownParseFileTester2() throws IOException {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("https://something.com");
        arr.add("some-thing.html");
        assertEquals(arr, MarkdownParse.getLinks(MarkdownParseTest.getMarkdown("test-file-2.md")));
    }

    @Test
    public void MarkdownParseFileTester3() throws IOException {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("https://something.com");
        arr.add("https://something.com");
        arr.add("some-thing.html");
        assertEquals(arr, MarkdownParse.getLinks(MarkdownParseTest.getMarkdown("test-file-3.md")));
    }

    @Test
    public void MarkdownParseFileTester4() throws IOException {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("https://google.com");
        assertEquals(arr, MarkdownParse.getLinks(MarkdownParseTest.getMarkdown("test-file-4.md")));
    }
}