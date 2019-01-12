public class CheckRotation_method_2_ude_4_my {
    static int[] array1 = {1, 2, 3, 4, 5, 6, 7};
    static int[] array2 = {5, 6, 7, 1, 2, 3, 4};

    public static void main(String[] args) {
        boolean rotationcheck = rotationcheck(array1, array2);
        System.out.println(rotationcheck);
    }


     static boolean rotationcheck(int[] array1, int[] array2) {
        int i = 0, j = 0, key = 0;
        if (array1.length != array2.length) {
            return false;
        } else {
            key = array1[0];
            for (i = 0; i < array1.length; i++) {
                if (key == array2[i]) {
                    j = i;
                    break;
                }
            }
            for (i = 0; i < array1.length; i++) {
                if (array1[i] != array2[(j + i) % array1.length]) {
                    return false;
                }

            }

        }

        return true;
    }
}


