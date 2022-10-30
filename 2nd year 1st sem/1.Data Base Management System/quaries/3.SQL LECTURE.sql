create table student
(
studentid integer ,
sname varchar(50),
gpa real,
progid varchar(10)

constraint student_pk primary key(studentid)
)
 
alter table student add foreign key (progid) references program(progid)

create table program
(
progid varchar(10),
years integer,
offerby varchar(20)

constraint program_pk primary key(progid)
)

select *
from program

select* 
from student

insert into student values (1000,'Amal',3.2,'BM')
insert into student(studentid,sname,progid) values (1001,'Nimali','IT')
insert into student values (1002,'Aruni',3,'SE')
insert into student values (1003,'surani',2.5,'IT')
insert into student(studentid,sname,progid) values (1004,'Imali','BM')

insert into program values ('BM',3,'SLIIT')
insert into program values ('IT',4,'SLIIT')
insert into program values ('SE',3,'SHU')

update program
set offerby = 'Curtin'
where progid = 'BM'

update student
set gpa = 4.0
where studentid = 1004

update student
set gpa = 3.8
where studentid = 1002

update student 
set gpa = 2.8
where studentid = 1001

/*IS NULL and IS NOT NULL*/
select sname
from student
where gpa is not null

select sname
from student
where gpa is null

/*LIKE*/
select sname
from student
where sname LIKE '%A'

select sname
from student
where sname LIKE '%i'

select sname 
from student 
where sname LIKE '_r%'

/*DISTINCT*/

select distinct progid
from student

select count(distinct progid) as numberofProg
from student

/*BETWEEN*/
select studentid
from student
where gpa between 3.7 and 4.00

/*ORDER BY*/
select sname, gpa
from student
order by gpa 

select sname, gpa
from student
order by gpa desc

/*inner join*/
select s.sname,p.years
from student s, program p
where s.progid = p.progid and offerby = 'SLIIT';

/*LEFT OUTER JOIN*/
select s.sname, p.offerby
from student s LEFT OUTER JOIN program p ON s.progid = p.progid

select * 
from student

/*RIGHT OUTER JOIN*/

select s.sname, p.offerby
from student s RIGHT JOIN program p ON s.progid = p.progid

/*IN OPERATOR*/

select s.sname 
from student s
where s.sid IN(select SID 
				from grades 
				where grade = 'A')

/*some,any,all*/

select s.sname
from student s
where s.progid = 'BM' and s.gpa > any (select sl.gpa
									from student sl
									where progid = 'IT')

									select s.sname
from student s
where s.progid = 'BM' and s.gpa > some (select sl.gpa
									from student sl
									where progid = 'IT')

select s.sname
from student s
where s.progid = 'IT' and s.gpa > all (select sl.gpa
										from student sl
										where progid = 'BM')

/*AVG,MIN,MAX*/

select AVG(gpa) as average, MIN(gpa) as minimum, MAX(gpa) as maximum
from student

/*sum, count*/

select sum(gpa) as sumofgpa , count(gpa) as countofstudent
from student

/*group by*/
select progid,count(sname)
from student
group by progid
having count(studentid) > 1


