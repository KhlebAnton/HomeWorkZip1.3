package Games;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GameProgress game1 = new GameProgress(10,1,1,10);
        GameProgress game2 = new GameProgress(8,3,3,50);
        GameProgress game3 = new GameProgress(5,9,7,100);

        GameProgress.saveGame("Games\\savegames\\save1.dat",game1);
        GameProgress.saveGame("Games\\savegames\\save2.dat",game2);
        GameProgress.saveGame("Games\\savegames\\save3.dat",game3);

        ArrayList<String> list = new ArrayList<>();
        list.add("Games\\savegames\\save1.dat");
        list.add("Games\\savegames\\save2.dat");
        list.add("Games\\savegames\\save3.dat");

        GameProgress.zipFiles("Games\\savegames\\zip.zip",
                list);

    }
}
