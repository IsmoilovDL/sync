import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Roots {
    private static final String keyfile="synceKey.txt";

    //Находить диск с файлом для синхронизации
    public List<String> getActiveDisks(){
        List<String> disklist=new ArrayList<>();
        File[] roots = File.listRoots();
        for (int i=0; i<roots.length; i++){
            File keysynce=new File(roots[i].toString()+keyfile);
            if(keysynce.exists()) {
                disklist.add(roots[i].toString());
            }
        }
        return disklist;
    }

    //Список всех дисков
    public List<String> getAllDisks(){
        List<String> disklist=new ArrayList<>();
        File[] roots = File.listRoots();
        for (int i=0; i<roots.length; i++){
                disklist.add("["+i+"]"+roots[i].toString());
        }
        return disklist;
    }

    //создает файл ключ в выбранном диске
    public void setActiveDisk(int diskNumber) throws IOException {
        List<String> disklist=new ArrayList<>();
        File[] roots = File.listRoots();
        for (int i=0; i<roots.length; i++){
            disklist.add(roots[i].toString());
        }
        File newFile=new File(disklist.get(diskNumber)+keyfile);
        newFile.createNewFile();
    }
}
