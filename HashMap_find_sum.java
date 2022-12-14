class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i=0;  i< nums.length; i++){
            map.put(nums[i],i);
        }
        
        for (int i=0;i<nums.length; i++){
            int val = target-nums[i];
            
            if(map.containsKey(val)){
                int index = map.get(val);
                if(index == i) continue;
                
                return new int[] {i, index};
            }     
        }
        return new int[] {};
    }
}
