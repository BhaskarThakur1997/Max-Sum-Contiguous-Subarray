public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        int n = A.size();
        int max_first = Integer.MIN_VALUE, max_last=0;
        for(int i=0; i<n; i++){
            max_last = max_last + A.get(i);
            if(max_first < max_last)
            max_first = max_last;
            if(max_last < 0)
            max_last = 0;
        }
        return max_first;
    }
}
