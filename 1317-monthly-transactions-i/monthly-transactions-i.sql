# Write your MySQL query statement below
SELECT DATE_FORMAT(trans_date,'%Y-%m') as month,
country,Count(state) as trans_count,
Sum(Case when state = 'approved' Then 1 else 0 END)as approved_count,Sum(amount)as trans_total_amount,
Sum(Case when state='approved' Then amount else 0 END)as approved_total_amount
from Transactions 
group by month,country
