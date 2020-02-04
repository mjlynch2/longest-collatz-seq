import java.util.Arrays;

public class Euler14 {
    public static void main(String[] args) {
        int currLen = 0;
        int currNum = 1;
        int[] seqLenArr = new int[35];
        seqLenArr[1] = 1;

        for (int i = 2; i < seqLenArr.length; i++) {
            currNum = i;
            int lengthToAdd = 0;
            while (currNum >= i) {
                lengthToAdd++;
                if (currNum % 2 == 0) {
                    currNum = currNum / 2;
                } else {
                    currNum = currNum * 3 + 1;
                }
            }
            seqLenArr[i] = seqLenArr[currNum] + lengthToAdd;

            if (seqLenArr[i] > currLen) {
                currLen = seqLenArr[i];
                currNum = i;
            }

        }

        // System.out.println(Arrays.toString(seqLenArr));
        System.out.println(currLen);
    }

}