import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ReadColorTest{
    public int[][] getColor(String path) {
        int[][] data = new int[0][];
        try {
            BufferedImage bimg = ImageIO.read(new File(path));
            data = new int[bimg.getWidth()][bimg.getHeight()];
            for (int i = 0; i < bimg.getWidth(); i++) {
                for (int j = 0; j < bimg.getHeight(); j++) {
                    data[i][j] = bimg.getRGB(i, j);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }


}