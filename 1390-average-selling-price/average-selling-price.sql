# Write your MySQL query statement below
SELECT p.product_id,Round(IFNULL(SUM(p.price * u.units)/sum(u.units),0),2) as average_price
from Prices as p Left join UnitsSold as u
on p.product_id = u.product_id
and u.purchase_date BETWEEN p.start_date and p.end_date
group by p.product_id

