/*
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class NonRepeatingCharacterUde_1_my {
    static StringBuffer s1=new StringBuffer("aabzbcczxp");


    public static void main(String[] args) {
        int i=0,min=1,min_value=0,flag=0;
        char min_item='a';
        HashMap<Character,Integer> table=new HashMap<>();
        while (i<s1.length()){

            if(!table.containsKey(s1.charAt(i))){
                table.put(s1.charAt(i),1);
            }
            else {
                table.put(s1.charAt(i),table.get(s1.charAt(i))+1);
            }

            i++;
        }

        System.out.println(table);

        for(int j=0;j<s1.length();j++){
            if(table.get(s1.charAt(j))==1){
                min_item=s1.charAt(j);
                min_value=table.get(s1.charAt(j));
                System.out.println(min_item+ " "+min_value);
                flag=1;
            }
        }
        if(flag==0){
            System.out.println("null");
        }

    }

}
*/

///method 2-------------------
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class NonRepeatingCharacterUde_1_my {
    static StringBuffer s1=new StringBuffer("aabzbcczxxs");


    public static void main(String[] args) {
      char rst=nonRepeatingCharcter(s1);
      if(rst>='a')
        System.out.println(rst +" has value " +1);
      else
          System.out.println("no value");

    }

    private static char nonRepeatingCharcter(StringBuffer s1) {
        int i=0,min=1,min_value=0,flag=0;
        char min_item='a';
        HashMap<Character,Integer> table=new HashMap<>();
        while (i<s1.length()){

            if(!table.containsKey(s1.charAt(i))){
                table.put(s1.charAt(i),1);
            }
            else {
                table.put(s1.charAt(i),table.get(s1.charAt(i))+1);
            }

            i++;
        }

        System.out.println(table);

        for(int j=0;j<s1.length();j++){
            if(table.get(s1.charAt(j))==1){
                min_item=s1.charAt(j);
                min_value=table.get(s1.charAt(j));
               return min_item;
            }
        }
      return ' ';

    }

}
