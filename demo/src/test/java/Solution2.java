import org.junit.platform.commons.util.StringUtils;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/***
 * 坐标移动
 */

class Solution2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input  =  sc.nextLine();

        if(input == null || input.length()<1 ||input.length() > 10000 ){
            return;

        }
        String[] strArray = input.split("\\;");

        if(strArray.length == 0){
            return;
        }
        List<String> list  = new ArrayList();
        for(String str : strArray){
            if(str.startsWith("A") || str.startsWith("S") || str.startsWith("W")|| str.startsWith("D") ){

              String number = str.substring(1,str.length());
              try {
                  int num = Integer.parseInt(number);
                  list.add(str);
              } catch (Exception e){
                  System.out.println(" input error");
              }

            }

        }
        int index_x= 0 ;
        int index_y= 0 ;

        for(String str : list){
            int step = Integer.parseInt(str.substring(1,str.length()));
            if(str.startsWith("A")){
                index_x -=  step;
            }else if(str.startsWith("D")){
                index_x += step;
            }else if(str.startsWith("W")){
                index_y +=step;
            }else {
                index_y -=step;
            }

        }

        System.out.println("(" +index_x+","+index_y+")");



    }

}