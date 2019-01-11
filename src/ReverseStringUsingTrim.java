public class ReverseStringUsingTrim {
    public static void main(String[] args) {
       // System.out.println("hello--------------");

String str="india is great";
String[] stringWithTrim=str.split(" ");
String result=" ";

int i=0;

for(i=0;i<stringWithTrim.length;i++){
    System.out.println(stringWithTrim[i]);

}

System.out.println("------------------------------------");

for(int j=stringWithTrim.length-1;j>=0;j--){

    result=result + (stringWithTrim[j]) + " ";
}
String finalResult=result.trim();
System.out.println(finalResult.trim());



    }
}
