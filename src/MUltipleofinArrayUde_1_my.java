//logic own

//question [2,4,1,6,5,40,-1,10,-20] find multiple of 20 pairs



/*
public class MUltipleofinArrayUde_1_my {

    static  int[] p={2,4,1,6,5,40,-1,10,-20};
    public static void main(String[] args) {
        int i,j,flag=0;
        for(i=0;i<p.length;i++){
            for(j=i+1;j<p.length;j++){
                if((p[i] >0 && p[j]>0) || (p[i]<0 && p[j]<0)){

                    if(p[i]*p[j]==20){
                        System.out.println(p[i] +" "+ p[j]);
                        flag=1;
                    }

                }

            }
        }
        if(flag==0){
            System.out.println("no such couple exists");
        }

    }
}
*/


//instructor logic
public class MUltipleofinArrayUde_1_my {

    static  int[] p={2,4,1,6,5,40,-1,10,-20,5};
    public static void main(String[] args) {

        int i,j,q,flag=0;

        for(i=0;i<p.length;i++) {
            for (j = i + 1; j < p.length; j++) {
                q = p[i];
                if ((p[i] > 0 && 20/q > 0) || (p[i] < 0 && 20/q < 0)) {

                    if ((20 / q) == p[j]) {
                        System.out.println(p[i] + " " + (20/q));

                        flag = 1;
                        break;
                    }
                }
            }


        }
        if(flag==0){
            System.out.println("no such couple exists");

        }

    }
}
