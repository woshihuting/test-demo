import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class TestOne{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] charArray  = str.toCharArray();
        Map<Object,Integer> map  = new HashMap();
        int min = Integer.MAX_VALUE;
        for (char c : charArray){
            if(!map.containsKey(c)){
                map.put(c,1);
                min = 1;
            } else {
                map.put(c,map.get(c)+1);
                if(!map.containsValue(min)){
                    min++;
                }

            }

        }
        for(char c : charArray){
            if(map.get(c) !=min ){
                System.out.println(c);
            }

        }

    }
}