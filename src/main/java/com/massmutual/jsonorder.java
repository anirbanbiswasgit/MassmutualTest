package com.massmutual;

import com.github.tsohr.JSONObject;

import java.util.*;

public class jsonorder {

    public static void main(String[] args) {

        Map item_sub2 = new LinkedHashMap();
        item_sub2.put("name", "Z");
        item_sub2.put("val1", "M");
        item_sub2.put("val2", "A");
        item_sub2.put("size",102);


        JSONObject json = new JSONObject(item_sub2);

        System.out.println(json.toString());

        printDuplicateCharacters("Programming");
        System.out.println(isAnagram("silent","listen"));
        isPalindromString();

    }


    public static void printDuplicateCharacters(String word) {
        char[] characters = word.toCharArray();

        // build HashMap with character and number of times they appear in String
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        for (Character ch : characters) {
            if (charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);
            } else {
                charMap.put(ch, 1);
            }
        }

        // Iterate through HashMap to print all duplicate characters of String
        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
        System.out.printf("List of duplicate characters in String '%s' %n", word);
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            }
        }
    }

    public static boolean isAnagram(String str1, String str2){
        char[] charArr1 = str1.replaceAll("[\\s]", "").toLowerCase().toCharArray();
        char[] charArr2 = str2.replaceAll("[\\s]", "").toLowerCase().toCharArray();

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        return(Arrays.equals(charArr1, charArr2));
    }

    public static void isPalindromString()

    {
        String str, rev = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        str = sc.nextLine();

        int length = str.length();

        for ( int i = length - 1; i >= 0; i-- )
            rev = rev + str.charAt(i);

        if (str.equals(rev))
            System.out.println(str+" is a palindrome");
        else
            System.out.println(str+" is not a palindrome");

    }

}
