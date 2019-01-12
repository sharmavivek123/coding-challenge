import java.util.ArrayList;

public class CommanArrayBetweenTwoArray_ude_3_my {
    public static void main(String[] args) {
        int[] array1={1,3,4,6,7,9};
        int[] array2={1,2,4,5,9,10};
        ArrayList<Integer> result=new ArrayList<Integer>();
        int p1=0,p2=0;

        while (p1<array1.length && p2<array2.length){

            if(array1[p1]==array2[p2]){
                result.add(array1[p1]);
                p1++;
                p2++;

            }
            else if(array1[p1]>array2[p2]){
                p2++;
            }
            else{
                p1++;
            }

        }
        System.out.println(result);
result.forEach(key-> System.out.println(key));
    }
}
