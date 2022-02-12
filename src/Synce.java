import java.io.File;

public class Synce {
    public static void main(String[] args) {

        File[] roots = File.listRoots();

        System.out.println("Список подключенных дисков: ");

        for (File root: roots) {

            System.out.println(root);
        }
    }
}
