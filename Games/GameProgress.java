package Games;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class GameProgress implements Serializable {
    private static final long serialVersionUID = 1L;

    private int health;
    private int weapons;
    private int lvl;
    private double distance;

    public GameProgress(int health, int weapons, int lvl, double distance) {
        this.health = health;
        this.weapons = weapons;
        this.lvl = lvl;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "GameProgress{" +
                "health=" + health +
                ", weapons=" + weapons +
                ", lvl=" + lvl +
                ", distance=" + distance +
                '}';
    }

    public static void saveGame(String waySave, GameProgress gameProgress) {
        try (FileOutputStream fos = new FileOutputStream(waySave);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(gameProgress);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void zipFiles(String wayZip, ArrayList list) {
        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(wayZip));
                 FileInputStream fis = new FileInputStream() {
                     ZipEntry entry = new ZipEntry(String.valueOf());
                     zout.putNextEntry(entry);
                     byte[] buffer = new byte[fis.available()];
                     fis.read(buffer);
                     zout.write(buffer);
                     zout.closeEntry();
                 }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
    }
}




