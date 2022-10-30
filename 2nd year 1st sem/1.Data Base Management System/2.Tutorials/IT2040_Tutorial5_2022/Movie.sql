Create table Movie
(
	title char(30), 
	year int,
	length float,
	language char(15), 
	filmtype char(1),
	DirectorName varchar(15)
	primary key (title, year)
)

insert into Movie values('Spider-man',2018,2.5,'English','F','Jon Watts')
insert into Movie values('Black Panther',2018,3,'English','F','Ryan Coogler')
insert into Movie values('Avengers',2018,3,'English','F','Anthony Russo')
insert into Movie values('Ghost in Shell', 2017, 2.5,'English','D','Rupert Sanders')
insert into Movie values('Jurrasic World',2018,2.75,'English','D','Colin Trevorrow')
insert into Movie values('Passengers',2016,2.75,'English','F','Morten Tyldum')

Create table MovieStar
(
	name char(25) primary key,
	country varchar(40),
	gender char(1),
	birthdate date
)

Insert into MovieStar values('Tom Holland','England','M','1-Jun-1996')
Insert into MovieStar values('Robert Downey','America','M','4-Apr-1963')
Insert into MovieStar values('Chadwick Boseman','America','M','29-Nov-1977')
Insert into MovieStar values('Scarlett Johansson','America','F','22-Nov-1984')
Insert into MovieStar values('Chris Pratt','England','M','21-Jun-1979')
Insert into MovieStar values('Bryce Howard','America','F','2-Mar-1981')
Insert into MovieStar values('Jennifer Lawrence','America','F','15-Aug-1990')

Create table StarsIn 
(
	movieTitle char(30), 
	movieYear int,
	starname char(25), 
	role varchar(15),
	primary key (movieTitle,movieYear,starname),
	foreign key (movieTitle,movieYear) references Movie,
	foreign key (starname) references MovieStar
)

insert into StarsIn values('Spider-man',2018,'Tom Holland','lead')
insert into StarsIn values('Spider-man',2018,'Robert Downey','support')
insert into StarsIn values('Black Panther',2018,'Chadwick Boseman','lead')
insert into StarsIn values('Black Panther',2018,'Robert Downey','support')
insert into StarsIn values('Avengers',2018,'Robert Downey','lead')
insert into StarsIn values('Avengers',2018,'Chadwick Boseman','lead')
insert into StarsIn values('Avengers',2018,'Scarlett Johansson','lead')
insert into StarsIn values('Ghost in Shell',2017,'Scarlett Johansson','lead')
insert into StarsIn values('Jurrasic World',2018,'Chris Pratt','lead')
insert into StarsIn values('Jurrasic World',2018,'Bryce Howard','lead')
insert into StarsIn values('Passengers',2016,'Chris Pratt','lead')
insert into StarsIn values('Passengers',2016,'Jennifer Lawrence','lead')

create table Theater
(
	theaterName varchar(20) primary key,
	country varchar (40), 
	city varchar (20), 
	capacity int 
)

insert into Theater values('Beverly','America','LA',300)
insert into Theater values('Electric','England','London',275)
insert into Theater values('Grand Rex','France','Paris',300)
insert into Theater values('Nitehawk','America','New York',200)
insert into Theater values('Cinnemaworld','Australia','Melbourne',250)

Create table Show 
(
showId int primary key,
movieTitle char (30),
theaterName varchar(20),
datetime datetime, 
ticketPrice real, 
spectators  int
)

insert into Show values(1,'Spider-man','Electric','1-Jan-2018',200,275)
insert into Show values(2,'Spider-man','Grand Rex','1-Jan-2018',200,200)
insert into Show values(3,'Avengers','Grand Rex','1-Apr-2018',200,98)
insert into Show values(4,'Black Panther','Beverly','1-Jan-2018',200,205)
insert into Show values(5,'Black Panther','Grand Rex','1-Jan-2018',300,300)
insert into Show values(6,'Passengers','Nitehawk','1-Jan-2018',200,176)
insert into Show values(7,'Jurrasic World','Nitehawk','1-Jan-2018',200,176)
insert into Show values(8,'Black Panther','Nitehawk','1-Jan-2018',200,219)
insert into Show values(9,'Ghost in Shell','Cinnemaworld','1-Jan-2018',200,101)
insert into Show values(10,'Black Panther','Grand Rex','1-Jan-2018',200,200)
insert into Show values(11,'Jurrasic World','Cinnemaworld','1-Jan-2018',200,188)

create table Booking
(
	showId int,
	custName varchar(25),
	numTickets int,
	primary key(showId,custName),
	Foreign key (showId) references Show(showId)
)
