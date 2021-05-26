import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File src = new File("Games\\src");
        src.mkdir();
        File res = new File("Games\\res");
        res.mkdir();
        File savegames = new File("Games\\savegames");
        savegames.mkdir();
        File temp = new File("Games\\temp");
        temp.mkdir();

        File main = new File("Games\\src\\main");
        main.mkdir();
        File test = new File("Games\\src\\test");
        test.mkdir();

        File fMain = new File("Games\\src\\main\\Main.java");
        try {
            if (fMain.createNewFile())
                System.out.println("Файл был создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File fUtils = new File("Games\\src\\main\\Utils.java");
        try {
            if (fUtils.createNewFile())
                System.out.println("Файл был создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File drawables = new File("Games\\res\\drawables");
        drawables.mkdir();
        File vectors = new File("Games\\res\\vectors");
        vectors.mkdir();
        File icons = new File("Games\\res\\icons");
        icons.mkdir();

        File fTemp = new File("Games\\temp\\temp.txt");
        try {
            if (fTemp.createNewFile())
                System.out.println("Файл был создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        StringBuilder sb = new StringBuilder();
        sb.append("add dir src,res,savegames,temp;")
                .append("add dir main,test;")
                .append("add files Main.java, Utils.java;")
                .append("add dir drawables, vectors, icons;")
                .append("add file temp.txt;");
        String text = sb.toString();
        try (FileWriter writer = new FileWriter("Games\\temp\\temp.txt", false)) {
            writer.write(text);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
