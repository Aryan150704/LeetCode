class Solution:
    def numberOfEmployeesWhoMetTarget(self, hours: List[int], target: int) -> int:
        count=0
        for r in hours:
            if r>=target:
                count+=1
        return count
        