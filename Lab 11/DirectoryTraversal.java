// Name: Joseph Abel Olayinka
// Matric no:  EDU2509276
// Faculty: Education
// Department: Curriculum and Instructional Technology
// Course area: Computer Science Education
// Course: Cos 202
// Level:200 Direct-Entry

import java.io.File;

public class DirectoryTraversal {
    static void listFiles(File dir) {
        if (dir.isDirectory()) {
            File[] files = dir.listFiles();
            if (files != null) {
                for (File File : files) {
                    System.out.println(file.getPath());
                    if (file.isDirectory()) {
                        listFiles(file);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        File folder = new File("C:/TestFolder");
        listFiles(folder);
    }
}
