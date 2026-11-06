class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        //for the frquent calculation map is recommened O(n)
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int num : nums) {
            map.put(num,map.getOrDefault(num,0) + 1);        
        }
        //converting to a list for sort
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        
       //sorting
       list.sort((a,b) -> b.getValue() - a.getValue());

        //get the k values 
        int[] response = new int [k];
        for(int i = 0; i<k ; i ++) {
            response[i] = list.get(i).getKey();
        }

        return response;

    }
}
