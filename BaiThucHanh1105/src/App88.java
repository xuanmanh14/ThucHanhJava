import java.util.LinkedHashMap;
import java.util.Map;
public class App88 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> hm = new LinkedHashMap<Integer,String>();
        hm.put(100, "Mo");
        hm.put(101, "Dia");
        hm.put(102, "Chat");
        for(Map.Entry<Integer,String> m:hm.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());
        System.out.println("Before invoking remove method : " +hm);
        System.out.println("After invoking remove method : " +hm);
    }
}