package assignment3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;

public class Que3 {
    public static void main(String[] args) throws IOException {
        String filename= args[0];
        String wordToCount= args[1];

        int count=0;
        BufferedReader reader= new BufferedReader(new FileReader(filename));
        String line;

        while((line = reader.readLine()) != null){
            String[] words = line.split("\\s+");
            for(String word : words){
                if(word.equalsIgnoreCase(wordToCount)){
                    count++;
                }
            }
        }
        reader.close();
        System.out.println("The word "+ wordToCount +" appears " + count +" times in the file");
    }
}
