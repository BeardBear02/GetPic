public class Outline {
    public int[][] getOutline(int[][] data){
        int[][] data2 = new int[data.length/2][data[0].length/2];
        int count = 0;
        for (int i = 0; i < data.length-1; i+=2) {
            for (int j = 0; j < data[0].length-1; j+=2) {
                int num = 0;
                if(data[i][j] < -1644826) num+=1;
                if(data[i][j+1] < -1644826) num+=1;
                if(data[i+1][j] < -1644826) num+=1;
                if(data[i+1][j+1] < -1644826) num+=1;
                if(num >= 2){
                    data2[i/2][j/2] = 1;
                    count += 1;
                }
            }
        }
        System.out.println("开枪数： "+ count);
        return data2;
    }
}
