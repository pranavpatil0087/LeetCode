class Solution {
    public boolean isSubsequence(String s, String t) {

        int i = 0;      // Pointer for s
        int j = 0;      // Pointer for t
        int count = 0;  // Number of matched characters

        while (i < s.length() && j < t.length()) {

            // If characters match
            if (s.charAt(i) == t.charAt(j)) {
                count++;
                i++;
            }

            // Always move pointer of t
            j++;
        }
        // If all characters of s matched
       // return count;
        if(count == s.length()){
            return true;
        }else{
            return false;
        }
    }
}