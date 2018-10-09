package section1;

import java.util.HashMap;
import java.util.Map;

public class PhoneNumber {

    static Map<Integer, String> map = new HashMap<>();

    static {
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
    }

    public static void main(String[] args) {
        String s = "2";
        print("", s, 0);
    }

    public static void print(String str, String orig, int pos){
        if(pos == orig.length()-1){
            String temp = map.get(Integer.parseInt(String.valueOf(orig.charAt(pos))));
            for(int i = 0; i<temp.length(); i++){
                System.out.println(str + temp.charAt(i));
            }
        } else {
            int num = Integer.parseInt(String.valueOf(orig.charAt(pos)));
            String temp = map.get(num);
            for(int i = 0 ; i<temp.length(); i++){
                String s = str+temp.charAt(i);
                print(s, orig, pos+1);
            }
        }
    }

}
