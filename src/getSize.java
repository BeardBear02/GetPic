
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;

public class getSize {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File picture = new File("blank.JPG");
        BufferedImage sourceImg =ImageIO.read(new FileInputStream(picture));
        System.out.println(String.format("%.1f",picture.length()/1024.0));
        System.out.println(sourceImg.getWidth());
        System.out.println(sourceImg.getHeight());
    }
}

