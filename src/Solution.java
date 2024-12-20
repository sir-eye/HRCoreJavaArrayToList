import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();


        int n = Integer.parseInt(sc.nextLine());
        String[] a = new String[n];


        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLine();
        }

        MyList obj = new ArrayToList();

        obj.convert(a);

        int idx = rand.nextInt(n);
        obj.replace(idx);

        ArrayList<String> compactedList = obj.compact();
        for (int i = 0; i < compactedList.size(); i++) {
            String s = compactedList.get(i);
            try {
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) >= '0' && s.charAt(j) <= '9') {
                        throw new InvalidStringException("Invalid string");
                    }
                }
                System.out.println(s);
            } catch (InvalidStringException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}