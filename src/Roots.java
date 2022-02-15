import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Roots {
    private static final String keyfile="synceKey.txt";

    //Находить диск с файлом для синхронизации
    public ArrayList<String> getActiveDisks(){
        ArrayList<String> disklist=new ArrayList<>();
        File[] roots = File.listRoots();
        for (int i=0; i<roots.length; i++){
            File keysynce=new File(roots[i].toString()+keyfile);
            if(keysynce.exists()) {
                disklist.add(roots[i].toString() + keyfile);
            }
        }
        return disklist;
    }

    //Список всех дисков
    public ArrayList<String> getAllDisks(){
        ArrayList<String> disklist=new ArrayList<>();
        File[] roots = File.listRoots();
        for (int i=0; i<roots.length; i++){
                disklist.add("["+i+"]"+roots[i].toString());
        }
        return disklist;
    }

    //создает файл ключ в выбранном диске
    public void setActiveDisk(int diskNumber) throws IOException {
        ArrayList<String> disklist=new ArrayList<>();
        File[] roots = File.listRoots();
        for (int i=0; i<roots.length; i++){
            disklist.add(roots[i].toString());
        }
        File newFile=new File(disklist.get(diskNumber)+keyfile);
        newFile.createNewFile();
    }
}
