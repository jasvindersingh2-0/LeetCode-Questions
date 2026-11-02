# Write your MySQL query statement below
Select ep.name,bn.bonus 
    from Employee as ep
    left Join Bonus as bn
    on ep.empId = bn.empId
    where bonus<1000
    Or bn.bonus is null