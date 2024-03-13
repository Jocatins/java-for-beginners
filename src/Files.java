import java.io.*;

public class Files {
    public static void main(String[] args) {
        File f1 = new File("Folder/file.txt");
        File f2 = new File("Folder/file1.txt");

        String s;
        if (f1.exists()) {
            if (f1.isFile()) {
                System.out.println("File Name is " + f1.getName());

                s = f1.getParent();
                File f3 = new File(s);

                f1.renameTo(new File("Folder/abc"));

                f2.delete();

                if (f3.isDirectory()) {
                    System.out.println(f2.getPath());
                }
            } else {
                System.out.println("Not a File");
            }
        }
    }

}
