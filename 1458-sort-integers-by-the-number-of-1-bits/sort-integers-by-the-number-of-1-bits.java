class Solution {
    public int countOneBits(int num) {
        int count = 0;
        while (num != 0) {
            count += num & 1;
            num >>= 1;
        }
        return count;
    }

    public int[] sortByBits(int[] arr) {
        Integer[] boxedArr = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            boxedArr[i] = arr[i];
        }

        Arrays.sort(boxedArr, (a, b) -> {
            int countA = countOneBits(a);
            int countB = countOneBits(b);

            if (countA == countB) {
                return a.compareTo(b);
            }

            return Integer.compare(countA, countB);
        });

        for (int i = 0; i < arr.length; i++) {
            arr[i] = boxedArr[i];
        }

        return arr;
    }
}