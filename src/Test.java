import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("a", "1");
        map.put("b", "1");
        map.put("c", "1");
        map.put("d", "1");

        System.out.println(map.entrySet());
    }
}
