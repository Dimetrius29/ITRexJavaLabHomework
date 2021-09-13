package Java.Exercise1.Task1;

import java.util.*;

public class TextInput {
    String inputText = "africa, america+ Asia! asia America Europe EUrope europe america is not EUrope";
    ArrayList<String> list = new ArrayList<>(Arrays.asList(inputText.split("[^a-zA-Z]+")));
    HashMap<String, Integer> map = new HashMap<>();

        public  void showUniqueWords (){
            for (String word : list) {
                if (map.containsKey(word)) {
                    map.put(word, map.get(word)+1);
                } else {
                    map.put(word, 1);
                }
            }
            System.out.println(map.keySet());
        }

        public  void showMap() {
            System.out.println(map);
        }
}
