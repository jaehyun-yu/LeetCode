# Write your MySQL query statement below
select A.name , B.bonus from Employee A left join Bonus B on A.empId = B.empId
where (bonus < 1000 or bonus is null);