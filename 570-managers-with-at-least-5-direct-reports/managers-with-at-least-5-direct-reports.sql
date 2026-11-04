# Write your MySQL query statement below
SELECT memp.name from Employee as emp
join Employee as memp
on emp.managerId = memp.id
group by memp.id, memp.name
having count(emp.id)>4