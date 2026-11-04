# Write your MySQL query statement below
SELECT sg.user_id,round(Avg(Case
when c.action = 'confirmed' then 1.00
else 0.00 end),2) as confirmation_rate
from Signups as sg
left join Confirmations as c
On sg.user_id = c.user_id
group by sg.user_id