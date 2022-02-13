import java.io.File;

public class Roots {
    private  final String keyfile="synceKey.txt";

    public String[] activDisks(){
        String[] disks = new String[5];
        File[] roots = File.listRoots();
        for (int i=0; i<roots.length; i++){
            File keysynce=new File(roots[i].toString()+keyfile);
            if(keysynce.exists()) {
                disks[i] =  roots[i].toString() + keyfile;
            }
        }
        return disks;
    }
}
