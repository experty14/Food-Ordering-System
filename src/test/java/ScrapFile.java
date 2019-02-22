import java.util.*;

public class ScrapFile {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",1);
        map.put("d",3);
        map.put("e",2);
        Set<Integer> set=new HashSet<>(map.values());
        for (Integer s:set){
            System.out.println(s);
        }
    }
}
