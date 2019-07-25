import java.io.File;

public class FileTest {
    public static void main( String[] args ) {
    File file=new File("D:\\JAVApackage\\Blog-System-master");
    parseFile(file);
    }
    public static void parseFile( File file){
        System.out.println(file);
        if(file==null||!file.exists()){
            return;
        }
        File[] files=file.listFiles();
        for (File f:files){
            System.out.println(f.getName());
            if(f.isDirectory()){
                parseFile(f);
            }
        }
    }
}
