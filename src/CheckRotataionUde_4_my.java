public class CheckRotataionUde_4_my {
    static int[] array1={1,2,3,4,5,6,7,};
    static int[] array2={5,6,7,1,2,3,4,};

    public static void main(String[] args) {
        int t=0,q=1,i=0,j=0;
        while ((i<array1.length) && (j<array2.length)){
            if(array1[i]==array2[j]){
                i++;
                j++;
                q++;
            }
            else {
                j++;
                t++;
            }
            if(j==(array2.length))
                j=0;
        }
        if(q==(array2.length+1))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
