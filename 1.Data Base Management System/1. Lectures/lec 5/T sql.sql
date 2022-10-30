----- T SQL----
select * from dept
select * from emp
select * from works
--1.variable--

declare @department varchar(10)
set @department = 'Admin'

select budget as new
from dept
where did = @department

declare @empid int
declare @sal real
set @empid = 1000


select @sal = salary
from emp
where eid = @empid

print @sal --if we want to print the value in the variable must use this statement


--2.if condition--

if 1000> 10

begin --we use begin and end if we have more than one statement in a single block--
	print 'Inside the if statement'
	print 'this is fun'

end
else 
	print'inside the else statement'


declare @value int
set @value = 1000

if @value < 10
	print 'inside if'
else 
	print 'inside else'
	 


if (select salary from emp where eid = 1000) > 100000
	print 'salary is higher than 100000'
else 
	print 'salary is lower than 100000'

--- 3. while statement---

create table employee 
(
eid int primary key,
empname varchar(20)
)

declare @count int
set @count = 1

while @count <= 100

begin 
  Insert into Employee values (@count, concat('employee',@count))
  set @count += 1
end

select * 
from employee

--4. function--

create function getEmpCount(@did varchar(12)) returns int
as
begin
	declare @ecount int
	select @ecount = count(*)
	from works
	where did = @did

	return @ecount
	
end

 declare @value int
 exec @value = getEmpCount'Admin'  --call the function
 print @value

 --exercise2 in function--

 create function total_percentage(@eid int) returns int
 as
 begin 
	declare @pct int
	select @pct = sum(pct_time)
	from works
	where eid = @eid
	group by eid

	return @pct
 end

 declare @total int
 exec @total = total_percentage'1004'
 print @total

 --5.Procedure--
 
 --in--
 create procedure increaseSalary(@pct int)
 as 
 begin

	update emp 
	set salary = salary + salary * @pct/100

 end

 exec increaseSalary 10

  select *
  from emp

--in and out--
create procedure get_stat(@did varchar(10),@max int output,@min int output)
as
begin
	select @max = max(e.salary), @min = min(e.salary)
	from emp e, works w
	where e.eid = w.eid and w.did = @did
end

declare @maxV int, @minV int
exec get_stat 'ITSD',@maxV output,@minV output

print concat('Max Value  ',@maxV)
print concat('Min Value  ',@minV)

--exercise 3 in procedures--

create procedure manage_sal(@did varchar (10),@ename varchar(20) output,@sal int output)
as
begin
	select @ename = e.ename, @sal = e.salary
	from dept d, emp e
	where e.eid = d.managerId and d.did = @did
end

declare @mname varchar(20), @salary int

exec manage_sal 'Admin',@mname output, @salary output
print concat('Manager Name - ',@mname)
print concat('Salary - ',@salary)
