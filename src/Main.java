import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File data = new File("data");
        File input = new File("data/input.txt");
        File Demo = new File("data/Demo.java");
        File sub1 = new File("data/sub1");
        File output = new File("data/sub1/output.txt");
        File student = new File("data/sub1/student.dat");
        File sub2 = new File("data/sub2");
        if (!data.isDirectory()){
            data.mkdir();
            Demo.createNewFile();
            input.createNewFile();
            sub1.mkdir();
            output.createNewFile();
            student.createNewFile();
            sub2.mkdir();
        }
        File[] list = data.listFiles();
        System.out.println(data.getName());
        for (File f :list) {
            if (f.isDirectory()) {
                for (File fn :f.listFiles()) {
                    System.out.println("--" + fn.getName());
                }
            }
            System.out.println("-" + f.getName());
        }
    }
}