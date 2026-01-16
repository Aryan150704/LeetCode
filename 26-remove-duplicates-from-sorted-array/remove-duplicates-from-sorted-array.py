class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if not nums:
            return 0
        i=0
        for n in range(1,len(nums)):
            if nums[n]!=nums[i]:
                i+=1
                nums[i]=nums[n]
        return i+1
        
            



        