//file operations in java
import java.io.*;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        //Byte class streams
        FileInputStream in = null;
        FileOutputStream out = null;

        //character class streams
        FileReader fileReader = null;
        FileWriter fileWriter = null;

        try{
            fileReader = new FileReader("./1-basics/files-op/input.txt");
            int c;
            while((c = fileReader.read()) != -1){

                System.out.println(c);
            }
        }catch(IOException e){
            System.out.println("message: " + e.getMessage());
        }finally{
            if(fileReader != null) fileReader.close();
        }

        try{
            in = new FileInputStream("./1-basics/files-op/input.txt");
            out = new FileOutputStream("./1-basics/files-op/output.txt");

            int c;
            while ((c = in.read()) != -1){
                System.out.println(c);
                out.write(c);
            }
        }catch(IOException e){
            System.out.println("Catched error:" + e.getMessage());
        }finally{
            if(in != null) in.close();
            if(out != null) out.close();
        }
    }
}
