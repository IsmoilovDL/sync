import java.io.File;
import java.util.ArrayList;

public class Roots {
    private  final String keyfile="synceKey.txt";

    public ArrayList<String> activDisks(){
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
}
