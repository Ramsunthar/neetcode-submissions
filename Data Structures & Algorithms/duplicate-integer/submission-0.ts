class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums: number[]): boolean {
        for(var i=0; i<nums.length; i++) {
            for(var j=i+1; j<nums.length; j++) {
                if(nums[i]==nums[j]) {
                    return true
                }
                    
            } 

        }
        return false

        /**
         * bettey way of doing it 
         * 
         * hasDuplicate(nums: number[]): boolean {
    const seen = new Set<number>();

    for (const num of nums) {
        if (seen.has(num)) {
            return true;
        }

        seen.add(num);
    }

    return false;
}
         */
    }
}
