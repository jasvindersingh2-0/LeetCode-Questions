# Write your MySQL query statement below
Select product_name,year,price from Sales inner join Product
on Sales.product_id = Product.product_id