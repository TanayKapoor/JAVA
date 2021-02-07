package dsalgo;

import java.util.Random;

public class bucketsort {
    static int[] sort(int[] sequence, int maxValue)
    {
        // Bucket Sort
        int[] Bucket = new int[maxValue + 1];
        int[] sorted_sequence = new int[sequence.length];

        for (int k : sequence) Bucket[k]++;

        int outPos = 0;
        for (int i = 0; i < Bucket.length; i++)
            for (int j = 0; j < Bucket[i]; j++)
                sorted_sequence[outPos++] = i;

        return sorted_sequence;
    }

    static void printSequence(int[] sorted_sequence)
    {
        for (int j : sorted_sequence) System.out.print(j + " ");
    }

    static int maxValue(int[] sequence)
    {
        int maxValue = 0;
        for (int j : sequence)
            if (j > maxValue)
                maxValue = j;
        return maxValue;
    }

    public static void main(String[] args)
    {
        System.out
                .println("Sorting of randomly generated numbers using BUCKET SORT");
        Random random = new Random();
        int N = 20;
        int[] sequence = new int[N];

        for (int i = 0; i < N; i++)
            sequence[i] = Math.abs(random.nextInt(100));

        int maxValue = maxValue(sequence);

        System.out.println("\nOriginal Sequence: ");
        printSequence(sequence);

        System.out.println("\nSorted Sequence: ");
        printSequence(sort(sequence, maxValue));
    }
}
