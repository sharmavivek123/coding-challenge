public class ReverseEachWordUsingLogic {
    static StringBuffer str1=new StringBuffer("hello India I'm coming from @1 company");
                                       //      0123456789
    public static void main(String[] args) {

        int i=0,j=0,w=0;
        while(i<str1.length()){
            if(str1.charAt(i)== ' '){  //for all letter expect last one
                   j=i; //i=5 //i=9,j=9
                   j--;//j=4 //j=8
                   swap(w,j);//w=0,j=4 //w=6,j=8
                   w=i+1; //w=6 //w=10
                   i++; //6 // i=10
               }
            else if(i==str1.length()-1) {  //for last letter
                swap(w,i);
            }
            i++;
        }
        System.out.println("hello India I'm coming from @1 company");
        System.out.println(str1);
        swap(0,str1.length()-1);
        System.out.println(str1);

    }

     static void swap(int i, int j) {
        while (i<j){
            char ch=str1.charAt(i);
            str1.setCharAt(i,str1.charAt(j));
            str1.setCharAt(j,ch);
            i++;
            j--;
        }

    }
}
