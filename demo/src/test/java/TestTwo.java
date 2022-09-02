import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.*;

public class TestTwo{
    public static void main(String[] args) throws Exception{
        Map<Integer,Integer> map = new HashMap();
        System.out.println("请输入组数");
        Scanner sc   = new Scanner (System.in);
        String input =  sc.nextLine();
        int n  = Integer.parseInt(input);
        int i  = 0 ;
        String[][] array = new String[n][2];
        while (i < n) {
            System.out.println("请输入第" + (i+1));
            String str = sc.nextLine();
            String[] charry = str.split(" ");
            array[i] = charry;
            i++;
        }

        for(String[] elem : array){
            if (!map.containsKey(Integer.parseInt(elem[0]))) {
                map.put(Integer.parseInt(elem[0]), Integer.parseInt(elem[1]));
            } else {
                int value = map.get(Integer.parseInt(elem[0])) + Integer.parseInt(elem[1]);
                map.put(Integer.parseInt(elem[0]), value);
            }
        }
        List<Integer> list   = new ArrayList();
        for (Map.Entry<Integer,Integer> en : map.entrySet()){
            list.add(en.getKey());
        }
        Collections.sort(list);
        for(Object key: list){
            System.out.println(key+ " " + map.get(key));
        }
    }
}