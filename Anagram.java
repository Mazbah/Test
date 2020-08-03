// Question-1: Write a function that detects if two strings are anagram e.g. ‘bleat’ and ‘table’ are anagrams but ‘eat’ and ‘tar’ are not.
// Solution:

package BongoBD;

class Anagram {

    boolean isAnagram(String Word1, String Word2) {

        if (Word1.length() != Word2.length()) {
            return false;
        }

        Word1 = Word1.toLowerCase();
        Word2 = Word2.toLowerCase();

        int[] counT = new int[128]; 

        for (int i = 0; i < Word1.length(); i++) {
            counT[Word1.charAt(i)]++;
            counT[Word2.charAt(i)]--;
        }

        //If they are Anagram then all char count must be zero.
        for (int i = 0; i < 128; i++) {
            if (counT[i] != 0)
                return false;
        }

        return true;
    }
}
