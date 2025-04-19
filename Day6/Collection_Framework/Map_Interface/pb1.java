package Map_Interface;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class pb1 {
    public static void main(String[] args) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get("/Users/buvaneshwar/Downloads/programing_language/java/Cap_Training/Week5/Day6/Collection_Framework/Map_Interface/input.txt")));

        content = content.toLowerCase().replaceAll("[^a-z\\s]", "");
        String[] words = content.split("\\s+");

        Map<String, Integer> word_cnt = new HashMap<>();

        for(String word : words){
            if(word.isEmpty()) continue;
            word_cnt.put(word, word_cnt.getOrDefault(word, 0)+1);
        }
        word_cnt.forEach((k, v) -> System.out.println(k +": "+v));

    }

}
