class Solution {

    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) l++;   // skip junk on the left
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) r--;   // skip junk on the right
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }


    // public boolean isPalindrome(String s) {
    //     // keep only alphanumeric characters.
    //     String cleanText = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    //     return cleanText.equals(new StringBuilder(cleanText).reverse().toString());
    // }




    // public boolean isPalindrome(String s) {
    //     // keep only alphanumeric characters.
    //     String cleanText = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    //     ArrayList<Character> charList = new ArrayList<>();
    //     ArrayList<Character> charListRev = new ArrayList<>();

    //     for (char c : cleanText.toCharArray()) {
    //         charList.add(c);
    //         charListRev.add(c);
    //     }   
    //     Collections.reverse(charListRev);
    //     if(charList.equals(charListRev)) {
    //         return true;
    //     }

    //     return false;


    // }   

}
