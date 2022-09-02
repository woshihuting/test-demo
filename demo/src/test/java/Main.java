import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<Integer,Integer> map = new HashMap();
        System.out.println("请输入字符串数");
        Scanner sc   = new Scanner (System.in);
        String input =  sc.nextLine();

        int n  = Integer.parseInt(input);
        int i  = 0 ;
        String[] array = new String[n];

        while (i < n) {
            System.out.println("请输入字符串");
            String str = sc.nextLine();
            array[i] = str;
            i++;
        }

        System.out.println("请输入要查找兄弟字符串");
        Scanner scp   = new Scanner (System.in);
        String newInput  = "";
            newInput =  scp.nextLine();


        char[] charArray =  newInput.toCharArray();

        ArrayList list = new ArrayList<>();

        boolean flag  = true;

        for( String str :array){
            for (char ch : charArray){
                if((str.indexOf(ch) == -1) || (charArray.length != str.length())){
                    flag = false;
                    break;
                }


            }
            if(flag && !str.equals(newInput)){
                list.add(str);
            }
        }
        System.out.println(list.size());
        Collections.sort(list);
        String ks =  sc.nextLine();
        int k  = Integer.parseInt(ks);
        String b = (String)list.get(k-1);
        System.out.println(b);

    }
}