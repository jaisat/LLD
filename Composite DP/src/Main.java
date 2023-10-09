import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

interface FileSystemComponent{
    public int getSize();
    public void listContent();
}

class File implements FileSystemComponent{
    private String name;
    private int size;

    public File(String name, int size){
        this.name = name;
        this.size = size;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void listContent() {
        System.out.println("My File Content " + this.name);
    }
}

class Directory implements FileSystemComponent{
    private String name;
    private List<FileSystemComponent> components;

    public Directory(String name){
        this.name = name;
        this.components = new ArrayList<>();
    }

    public void addComponent(FileSystemComponent component){
        components.add(component);
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for(FileSystemComponent component : components){
            totalSize += component.getSize();
        }
        return totalSize;
    }

    @Override
    public void listContent() {
        System.out.println("Directory -> " + this.name) ;
        for (FileSystemComponent component : components){
            component.listContent();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        FileSystemComponent file1 = new File("Document.txt", 100);
        FileSystemComponent file2 = new File("Image.jpg", 200);

        Directory subDir = new Directory("Subdirectory");
        FileSystemComponent file3 = new File("Data.csv", 150);

        subDir.addComponent(file3);

        root.addComponent(file1);
        root.addComponent(file2);
        root.addComponent(subDir);

        root.listContent();
        int totalSize = root.getSize();
        System.out.println("Total Size: " + totalSize + " KB");

    }
}