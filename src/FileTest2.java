import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest2 {
    public static void main( String[] args ) throws IOException {
        FileOutputStream out=new FileOutputStream("src/aaa.txt");
        String str="仰望天空j";
        byte[] by=str.getBytes();
        for (int i = 0; i <by.length ; i++) {
            out.write(by[i]);
        }
        out.close();
    }
}
