import java.io.IOException;

public class Apply {
    //复旦大学-19级-熊某人制作 请勿抄袭
    public static void main(String[] args) throws IOException, InterruptedException {
        ReadColorTest readColorTest = new ReadColorTest();
        Outline outline = new Outline();
        Output output = new Output();
        Shoot shoot = new Shoot();
        int[][] data = outline.getOutline(readColorTest.getColor("pic.jpeg"));
        output.getOutput(data);
        //shoot.shoot(data);
    }
}
