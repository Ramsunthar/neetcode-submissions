class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    // isAnagram(s: string, t: string): boolean {
    //     var x1=(s.split("")).sort().join("")
    //     var x2=(t.split("")).sort().join("")
    //     console.log(x1)
    //     console.log(x2)

    //     if(x1==x2) {
    //         return true
    //     }
    //     else
    //         return false
    // }
        //better approch frequent counter
        isAnagram(s: string, t: string): boolean {
             if (s.length !== t.length) {
                 return false;
            }

            const count = new Map<string, number>();

            for (const char of s) {
                count.set(char,(count.get(char) ?? 0 ) +1);
            }
            for (const char of t) {
                count.set(char,(count.get(char) ?? 0 ) -1);
            }

            for(const value of count.values()) {
                if(value!==0) {
                    return false;
                }
            }
            return true;
    }
}
