import java.io.File;

public class DirectoryTree {

    public void DirectoryAndFiles(String path){
        File dir = new File(path);
        System.out.println(dir.getName() + (!dir.isDirectory() ? "  -" : ""));
        if (dir.isDirectory()) {
            File[] list = dir.listFiles();
            if (list != null)
                for (File name : list)
                    DirectoryAndFiles(name.getPath());

        }
    }
}
