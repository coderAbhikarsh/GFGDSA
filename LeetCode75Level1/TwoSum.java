class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> valCheck = new HashMap<>();
        int res[] = new int[2];

        for(int i=0; i<nums.length; i++){
            valCheck.put(nums[i], i);
        }

        for(int i=0; i<nums.length; i++){
            int val = target-nums[i];
            if(valCheck.containsKey(val)){
                if(valCheck.get(val) != i){
                    res[0] = i;
                    res[1] = valCheck.get(val);
                    break;
                }
            }
        }

        return res;
    }
}