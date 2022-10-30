--1 a--
create table emp
(
eid integer primary key,
ename varchar(30)not null,
salary real,
)
alter table emp add age Integer
--b--
alter table emp add constraint emp_sal_chk check(salary>0)

--2--
create table dept
(
did varchar (20),
budget real,
managerid integer references emp

primary key(did)
)

--3--
create table work
(
	eid  integer,
	did varchar(20),
	constraint work_pk primary key (eid,did),
	constraint works_emp_fk foreign key(eid) references emp,
	constraint works_dept_fk foreign key(did) references dept

)

--4--
insert into emp values(1000,'Ruwan',33,40000)

select *
from emp

select getdate()

--5--
alter table emp add hireDate date default getdate()
insert into emp(eid,ename,age) values (1001,'suddah',25)

--6--
update emp
set hireDate = '1-january-2010'
where eid = 1000;

--7--
delete emp
where eid = 1000;

--8--
alter table emp drop column hireDate /*this gets error because this column has a default value and it causes to the dependacy*/
alter table emp drop constraint DF__emp__hireDate__1A34DF26 /*we must first drop that default value constraint int the hireDate table*/

--9--
drop table emp /*cannot execute this cause emp table eid references by the work table. se we must drop the constraint or delete the work table too*/
alter table work drop constraint works_emp_fk

--10--
select ename,salary
from emp

--11--
select ename,salary 
from emp
order by salary desc

--12--
select ename, salary
from emp
where salary > 50000

--13--
select ename
from emp
where ename LIKE 'S%'

select *
from dept
select *
from emp

--14--
select d.did, e.ename
from dept d, emp e
where d.managerid = e.eid

select d.did, e.ename
from dept d Inner Join emp e on d.managerid = e.eid

--15--
select e.ename, d.managerid
from emp e, works w, dept d
where salary > 75000 and e.eid = w.eid and d.did = w.did

--16--
select * from emp
select * from dept
select * from works

select e.ename
from emp e left outer join works w on e.eid = w.eid
where w.did is null

select e.ename 
from emp e
where eid NOT IN (select eid from works)

select e.ename 
from emp e
where NOT EXISTS (select * from works w where w.eid = e.eid)

--17--
select distinct(e.ename), e.age
from works w, emp e
where w.eid = e.eid and w.did IN ('ITSD', 'Academic')

select distinct(e.ename), e.age
from works w, emp e
where w.eid = e.eid and (w.did = 'ITSD' OR w.did = 'Academic') /*must put the brackets other wise it will give wrong answer*/

--18--
select e.ename, e.age
from emp e, works w
where e.eid = w.eid and w.did = 'ITSD' and w.did = 'academic'

--19--
select  e.ename, w.did 
from emp e, works w
where e.eid = w.eid

--20--
select MIN(salary)
from emp

select MAX(salary)
from emp

--21--
select e.ename, sum(w.pct_time) as workingPercentage
from emp e, works w
where e.eid = w.eid
group by e.ename

--22--
Select d.did, count(w.eid)
from dept d left outer join works w on d.did=w.did
group by d.did


--23--
select e.ename
from emp e, works w
where e.eid = w.eid
group by ename
having sum(pct_time) > 90

--24--
select w.did, sum(e.salary) as totalsalary
from emp e, works w
where e.eid = w.eid
group by w.did
having sum(e.salary) > 100000

--25--
select e.ename
from emp e
where e.salary > ALL(select d.budget
					from works w, dept d
					where e.eid = w.eid and d.did = w.did)

--26--
select managerId, sum(budget) as totalbudget
from dept
group by managerId
having sum(budget) > 1000000
 
 --27--
 select e.ename
 from emp e, dept d
 where e.eid = d.managerId and d.budget IN (Select Max(budget)
											from dept)


--28--
select d.managerId, sum(d.budget)
from dept d, works w
where d.did = w.did
group by d.managerId
having sum(d.budget) > 5000000

select managerId, sum(budget)
from dept
group by managerId
having sum(budget) > 500000

--29--
select managerid, sum(budget)
from dept
group by managerid
Having sum(budget) >= ALL (select sum(budget)
							from dept
							group by managerid)





