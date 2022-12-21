import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Class02 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("c:\\JAVA\\rand.txt");
        BufferedWriter bfw = new BufferedWriter(fw);
        int[]a=new int[1000];
        for (int i = 0; i <a.length; i++) {
            a[i]=(int)(Math.random()*99999)+1;  
            bfw.write((int)a[i]);
            bfw.newLine();
        }
        bfw.flush();
        fw.close();
   }

    }
