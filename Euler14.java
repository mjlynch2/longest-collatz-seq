import java.util.Arrays;

public class Euler14 {
    public static void main(String[] args) {
        int currLen = 0;
        int currLongestNum = 0;
        long currNum = 1;
        // The index is the number n and the value at the index is the sequence length
        // for n
        int[] seqLenArr = new int[1000001];
        // 1 has a sequence length of 1
        seqLenArr[1] = 1;

        // for each number we want to check
        for (int i = 2; i < seqLenArr.length; i++) {
            // while the current number is not smaller than i, do the collatz calcs and
            // increment the length of the sequence.
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

            // set the value at the index to the length of the sequence.
            seqLenArr[i] = seqLenArr[(int) currNum] + lengthToAdd;

            // if the sequence length at i is longer than the current longest sequence
            // length, update the current length and set the current longest number
            // to i

            if (seqLenArr[i] > currLen) {
                currLen = seqLenArr[i];
                currLongestNum = i;
                currNum = i;
            }

        }

        // System.out.println(Arrays.toString(seqLenArr));
        System.out.println(currLen);
        System.out.println(currLongestNum);
    }

}