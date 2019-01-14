public class OneWayCheckArray_Ude_2_my {
    static StringBuffer str1=new StringBuffer("abdf");
    static StringBuffer str2=new StringBuffer("abcdf");

//    [abcde=abcd] [abcde=abfde] [abcde=abde]


    public static void main(String[] args) {

        if(Math.abs(str1.length()-str2.length())>1){
            System.out.println("not one way");
        }
        else{
            if(str1.length()==str2.length()){
                int flag=0,i=0;
                  while(i<str1.length()){
                      if(str1.charAt(i)==str2.charAt(i)){
                          i++;
                      }
                      else{
                          flag++;
                          i++;
                      }
                  }
                  if(flag<=1){
                      System.out.println("one way");
                  }
                  else {
                      System.out.println("not one way");

                  }
            }

            else if(str1.length()==str2.length()+1){
                int i=0,j=0,flag=0;
                while(i<str1.length() && j< str2.length()) {

                    if (str1.charAt(i) == str2.charAt(j)) {
                        i++;
                        j++;
                    } else {
                        i++;
                        flag++;
                    }
                }
                if (flag <= 1) {
                    System.out.println("one way");
                } else {
                    System.out.println("not one way");

                }
            }
            else if(str1.length()+1==str2.length()){
                int i=0,j=0,flag=0;

                while(i < str1.length() && j < str2.length()){
                    if(str1.charAt(i)==str2.charAt(j)){
                        i++;
                        j++;
                    }
                    else{
                        j++;
                        flag++;
                    }
                }

                if(flag<=1){
                    System.out.println("one way");
                }
                else {
                    System.out.println("not one way");

                }

            }

        }
    }

}
