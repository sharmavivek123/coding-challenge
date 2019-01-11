// [1,2,2,3,1,4,2,3] find more frequent item

import java.util.Hashtable;
import java.util.Map;

public class MoreFrequentItemUde_2_my {
    static int[] p={1,2,2,3,1,4,2,3};

    public static void main(String[] args) {
        Map<Integer, Integer> table = new Hashtable<>();
        int i = 0, max = 0,max_item=0;

        for (i = 0; i < p.length; i++) {
            if (!table.containsKey(p[i])) {
                table.put(p[i], 1);
            } else {
                table.put(p[i], (table.get(p[i]) + 1));
            }
            if (table.get(p[i]) > max) {
                max = table.get(p[i]);
                max_item=p[i];
            }

        }

        table.keySet().forEach(key -> System.out.println(key + "->" + table.get(key)));
        System.out.println("key is "+ max_item +" has max value which is "+ max);

    }

}
