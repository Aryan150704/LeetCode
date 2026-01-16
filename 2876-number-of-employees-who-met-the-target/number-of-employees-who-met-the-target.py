class Solution:
    def numberOfEmployeesWhoMetTarget(self, hours: List[int], target: int) -> int:
        c=0
        for i in range (len(hours)):
            if hours[i]>=target:
                c+=1
        return(c)
        