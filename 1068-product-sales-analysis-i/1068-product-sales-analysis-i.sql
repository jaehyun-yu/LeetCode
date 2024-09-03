# Write your MySQL query statement below
select B.product_name, A.year, A.price 
    from Sales A , Product B
where A.product_id = B.product_id;