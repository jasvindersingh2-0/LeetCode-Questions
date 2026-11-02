# Write your MySQL query statement below
Select w2.id from Weather w2  join Weather w1
on DATEDIFF(w2.recordDate,w1.recordDate) = 1
where w1.temperature < w2.temperature 