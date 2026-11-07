class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded_string = new StringBuilder();


        for(String s : strs) {
            encoded_string.append(s.length()+"#");
            encoded_string.append(s);
        }

        return encoded_string.toString();

    }

    public List<String> decode(String str) {

        List<String> decoded_string = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        char[] chrArray = str.toCharArray();
        int i=0;
        String val = "";
        for(int j = 0; j < chrArray.length; j++) {

            while(Character.isDigit(chrArray[j])) {
                val+=chrArray[j];
                j++;
            }

            int count = Integer.parseInt(val);
                for(i=j+1;i<=count+j;i++) {
                
                    sb.append(chrArray[i]);
                }
                val="";
                j=i-1;
                decoded_string.add(sb.toString());
                sb.setLength(0);
            

        }

        return decoded_string;
        
    }
}
