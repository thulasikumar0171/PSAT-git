import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'maxSubarray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> maxSubarray(List<Integer> arr) {
    // Write your code here
    
    long maxSubarraySum = arr.get(0);
    long currentSum = arr.get(0);
    
    long maxSubsequenceSum = arr.get(0);
    long positiveSum = 0;
    boolean hasPositive = false;
    
    for (int num : arr) {
        // Kadane's for subarray
        currentSum = Math.max(num, currentSum + num);
        maxSubarraySum = Math.max(maxSubarraySum, currentSum);
        
        // Track positive sum for subsequence
        if (num > 0) {
            positiveSum += num;
            hasPositive = true;
        }
        
        maxSubsequenceSum = Math.max(maxSubsequenceSum, num);
    }
    
    if (hasPositive) {
        maxSubsequenceSum = positiveSum;
    }
    
    List<Integer> result = new ArrayList<>();
    result.add((int) maxSubarraySum);
    result.add((int) maxSubsequenceSum);
    
    return result;
}

    }


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                List<Integer> result = Result.maxSubarray(arr);

                bufferedWriter.write(
                    result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                    + "\n"
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}



Input:
2
4
1 2 3 4
6
2 -1 2 3 4 -5
Output:
11 10
12 11