# Write your MySQL query statement below
SELECT p.project_id, Round(Sum(e.experience_years)/Count(p.employee_id),2) as average_years from Project as p
left join Employee as e 
on p.employee_id = e.employee_id
group by p.project_id