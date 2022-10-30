select * from dept
select * from emp
select * from works
--create virtual table using view---
create view dpt_info(budget,ename,salary) 
AS
select d.budget, e.ename, e.salary
from dept d, emp e
where e.eid = d.managerId

--check whether table is created--
select *
from dpt_info

--update table using update----
update dpt_info
set salary = 45000
where ename = 'Amila'

--02 . create emp_info table ---
create view emp_info(eid,name,salary,total_percentage)
As
select e.eid, e.ename, e.salary, SUM( w.pct_time)
from emp e, works w
where e.eid = w.eid
group by e.eid, e.ename, e.salary
-- For this views we can treat as normal tables--

select * 
from emp_info

-- for drop a view--

Drop view dpt_info
Drop view emp_info

select * from dpt_info --no table here now-