import java.io.File;

public class DirectoryTree {

    public void DirectoryAndFiles(String path){
        File dir = new File(path);
       // System.out.println(dir.getName() + (!dir.isDirectory() ? "  -" : ""));
        StringBuilder fileAbsolutPath=new StringBuilder();
        if (dir.isDirectory()) {
            fileAbsolutPath.append("**"+dir.getName());
            System.out.println(fileAbsolutPath);
            File[] list = dir.listFiles();
            if (list != null)
                for (File name : list)
                    DirectoryAndFiles(name.getPath());

        }
        else {
            fileAbsolutPath.append(dir.getName());
            System.out.println(fileAbsolutPath);
        }
    }
}
