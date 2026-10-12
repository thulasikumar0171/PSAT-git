import java.util.Scanner;

public class IntelligentDNAPatternSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter DNA sequence: ");
        String dna = sc.nextLine();

        System.out.print("Enter pattern: ");
        String pattern = sc.nextLine();

        int count = 0;

        for (int i = 0; i <= dna.length() - pattern.length(); i++) {
            if (dna.substring(i, i + pattern.length()).equals(pattern)) {
                System.out.println("Pattern found at index: " + i);
                count++;
            }
        }

        System.out.println("Total occurrences: " + count);

        sc.close();
    }
}

Input:

Enter DNA sequence: ATGCGATATCG
Enter pattern: AT

Output:

Pattern found at index: 0
Pattern found at index: 5
Pattern found at index: 7
Total occurrences: 3