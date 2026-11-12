class Solution {
    public boolean isPalindrome(String s) {
        // keep only alphanumeric characters.
        String cleanText = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        ArrayList<Character> charList = new ArrayList<>();
        ArrayList<Character> charListRev = new ArrayList<>();

        for (char c : cleanText.toCharArray()) {
            charList.add(c);
            charListRev.add(c);
        }   
        Collections.reverse(charListRev);
        if(charList.equals(charListRev)) {
            return true;
        }

        return false;


    }
}
