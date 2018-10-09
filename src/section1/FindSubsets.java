package section1;

public class FindSubsets {

    public static void main(String[] args) {
        int a[] = {1,2,3,4};
//        String s = "abcd";
//        for(int i = 0; i<s.length(); i++){
//            print(s,"",i);
//        }

        for (int i = 0; i<a.length; i++){
            subSets(a, "", i);
        }
    }


    public static void print(String orig, String s, int pos){
        String str = s+orig.charAt(pos);
        System.out.println(str);

        for (int i = pos+1; i<orig.length(); i++){
            print(orig, str, i);
        }
    }

    public static void subSets(int[] array, String str, int pos){
        String s = str + array[pos] + " ";

        System.out.println(s);

        for(int i = pos +1 ; i<array.length; i++){
            subSets(array, s, i);
        }
    }

}
