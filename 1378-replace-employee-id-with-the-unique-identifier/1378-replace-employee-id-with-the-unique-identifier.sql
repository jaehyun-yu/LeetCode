# Write your MySQL query statement below
select B.unique_id, A.name from Employees A left Join EmployeeUNI B
on A.id = B.id;

