import java.io.*;
import java.util.ArrayList;

//it detects any word specified now .... i just wanted to detect f word 😪.
public class FWordDetector {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;

        try{
            fileReader = new FileReader("./1-basics/files-op/ch.txt");
            ArrayList<Integer> wordIndex = new ArrayList<>();
            int c;
            int count = 0;
            String word = "fuck";
            int charIndex = 0;
            int position = 0;
            while((c = fileReader.read())!= -1){
                position++;
                if((char) c == word.charAt(charIndex)){
                    charIndex++;
                    if(charIndex == word.length()){
                        count++;
                        charIndex = 0;
                        wordIndex.add(position - 3);
                    }
                }else{
                    charIndex = ((char) c == word.charAt(0)) ? 1 : 0;
                }
            }
            System.out.println("No of " + word + "'s = " + count);
            System.out.println("Found " + word + " at");
            for(int s:wordIndex){
                System.out.println(s);
            }
        }finally{
            if(fileReader != null)fileReader.close();
        }   
    }
}
