# Write your MySQL query statement below
SELECT * from Cinema as c
where c.id%2 != 0
and description != 'boring'
order by c.rating DESC