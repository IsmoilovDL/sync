import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class DirectoryTree {
    String directory="";

    //метод должен взвращат относительный путь всех файлов для сравнение и копирование
    public void DirectoryAndFiles(String path){
        File dir = new File(path);

        if (dir.isDirectory()) {
            directory=dir.getName();
            System.out.println(directory);
            File[] list = dir.listFiles();
            if (list != null)
                for (File name : list){
                    DirectoryAndFiles(name.getPath());
                }

        }
        else {
            System.out.println(dir.getPath());
        }
    }

    //с использованием интерфеса Path и класса Files из пакета NIO
    public void DirectorisAndFiles2(String path){
        Path fd=Path.of(path);
        try {
        Files.list(fd);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
