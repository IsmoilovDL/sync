import java.io.IOException;

public class Synce {
    public static void main(String[] args) {

       Roots disks=new Roots();

       System.out.println(disks.getActiveDisks());
        System.out.println(disks.getAllDisks());

        try{
            disks.setActiveDisk(1);
        }
        catch (IOException e){
            System.out.println("Не удалось создать файл!");
        }
    }
}
