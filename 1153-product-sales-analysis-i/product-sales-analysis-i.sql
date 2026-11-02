# Write your MySQL query statement below
SELECT pd.product_name,sl.year,sl.price from
Sales as sl Join Product as pd on sl.product_id = pd.product_id
