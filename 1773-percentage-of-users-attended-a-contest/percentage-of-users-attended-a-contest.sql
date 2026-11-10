# Write your MySQL query statement below
SELECT r.contest_id,Round((Count(r.user_id)/ (Select Count(user_id) from Users))*100,2)
as percentage from Register as r
group by r.contest_id
order By percentage DESC, r.contest_id ASC