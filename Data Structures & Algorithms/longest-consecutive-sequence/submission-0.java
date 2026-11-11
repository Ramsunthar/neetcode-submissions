class Solution {
    public int longestConsecutive(int[] nums) {
        //intiial validation
        if (nums.length == 0) return 0;

        //sort and remove duplicates
        Set<Integer> set = new TreeSet<>();
        for(int n: nums) set.add(n);

        List<Integer> list = new ArrayList<>(set);
        int max = 1;
        int count = 1;

        for(int i=1; i<list.size();i++) {
            if(list.get(i) == (list.get(i-1)+1)) {
                count++;
            }else {
                count = 1; 
            }
            max = Math.max(max, count);
        }
        // System.out.println(set);

        return max;

    }
}
