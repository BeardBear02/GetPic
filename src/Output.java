import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Output {
    public void getOutput(int[][] data) throws IOException {
        BufferedImage img = null;
        Color myBlack = new Color(0, 0, 0);
        int rgb = myBlack.getRGB();
        System.out.println(rgb);
        try {
            img = ImageIO.read(new File("blank.JPG"));
        }catch (IOException e) {
        }
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                if(data[i][j] == 1) img.setRGB(i, j, rgb);
            }
        }
        File outputfile = new File("saved.png");
        ImageIO.write(img, "png", outputfile);
    }
}
