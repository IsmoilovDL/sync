import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Roots {
    private static final String keyfile="synceKey.txt";

    //Список всех дисков
    public ArrayList<String> getAllDisks(){
        ArrayList<String> disklist=new ArrayList<>();
        File[] roots = File.listRoots();
        for (int i=0; i<roots.length; i++){
            disklist.add(roots[i].toString());
        }
        return disklist;
    }

    //Находить диск с файлом для синхронизации
    public ArrayList<String> getActiveDisks(){
       ArrayList<String> roots=getAllDisks();
       ArrayList<String> disklist=new ArrayList<>();
        for (int i=0; i<roots.size(); i++){
            File keysynce=new File(roots.get(i)+keyfile);
            if(keysynce.exists()) {
                disklist.add(roots.get(i));
            }
        }
        return disklist;
    }



    //создает файл ключ в выбранном
    //получает в параметры номер диска для которого будет создан файл синхронизации
    //В файле synceKey.txt сохранится путь папки для синхронизации
    public void setActiveDisk(int diskNumber, String directoriFromSynce) throws IOException {
        ArrayList<String> roots=getAllDisks();
        File newFile=new File(roots.get(diskNumber)+keyfile);
        newFile.createNewFile();
    }
}
