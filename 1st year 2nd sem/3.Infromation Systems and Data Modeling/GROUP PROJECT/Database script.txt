/*Table registered user*/
CREATE TABLE Registered_user  
(
	User_ID varchar(15) not null,
	Salutation varchar(6) not null,
	F_name varchar(40) not null,
	L_name varchar(40) not null,
	House_no varchar(30) not null,
	Street varchar(30) not null,
	Postal_code varchar(15) not null,
	City varchar(35) not null,
	Country varchar(20) not null,
	Password varchar(15) not null,
	DOB date not null,
	Gender varchar(10) not null,
	Email varchar(40) CHECK (Email LIKE '%_@__%.__%') not null,

	CONSTRAINT REG_USER_PK PRIMARY KEY(USer_ID)
);

 /*Table registered user phone*/
CREATE TABLE Registered_user_Phone
(
	User_ID varchar(15) not null,
	Phone_no decimal(10,0) not null,

	CONSTRAINT REG_USER_PHONE_PK PRIMARY KEY(USer_ID),
	CONSTRAINT REG_USER_PHONE_FK FOREIGN KEY(USer_ID) References Registered_user (USer_ID)
);

/*Table Tour_Guide*/
CREATE TABLE Tour_Guide 
(
	G_ID varchar(15) not null,
	F_name varchar(40) not null,
	L_name varchar(40) not null,
	House_no varchar(30) not null,
	Street varchar(30) not null,
	Postal_code varchar(15) not null,
	City varchar(35) not null,
	Password varchar(15) not null,
	DOB date not null,
	Email varchar(40) CHECK (Email LIKE '%_@__%.__%') not null,

	CONSTRAINT TOUR_GUIDE_PK PRIMARY KEY(G_ID)
);

CREATE TABLE Tour_Guide_Phone /*Table Tour Guide Phone*/
(
	G_ID varchar(15) not null,
	Phone_no decimal(10,0) not null,

	CONSTRAINT TOUR_GUIDE_PHONE_PK PRIMARY KEY(G_ID),
	CONSTRAINT TOUR_GUIDE_PHONE_FK FOREIGN KEY(G_ID) References Tour_Guide (G_ID)
);

/*Administrator Table */
CREATE TABLE Administrator (

    Admin_ID varchar(15) not null,
    F_name varchar(40) not null,
    L_name varchar(40) not null,
    House_no varchar(30) not null,
    M_ID varchar(15) not null,
    Street varchar(30) not null,
    Postal_code varchar(15) not null,
    city varchar(35) not null,
    Password varchar(15) not null,
    DOB date not null,
    Email varchar(35) CHECK (Email LIKE '%_@_%._%') not null,
    
    constraint Administrator_PK PRIMARY KEY (Admin_ID)

);


/*Administrator Phone numbers Table */
CREATE TABLE Administrator_Phone (
    
    Admin_ID varchar(15) not null,
    Phone_no decimal (10, 0) not null,
    
    CONSTRAINT Administrator_Phone_PK PRIMARY KEY (Admin_ID),
    CONSTRAINT Administrator_Phone_FK FOREIGN KEY (Admin_ID) REFERENCES Administrator(Admin_ID)

);



/*Manager table */
CREATE TABLE Manager (

    M_ID varchar(15) not null,
	Name varchar(40) not null,
    House_no varchar(30) not null,
    Street varchar(30) not null,
    Postal_code varchar(15) not null,
    city varchar(35) not null,
    Password varchar(15) not null,
    DOB date not null,
    Email varchar(35) CHECK (Email LIKE '%_@_%._%') not null,
    
    CONSTRAINT Manager_PK PRIMARY KEY (M_ID)

);

/*Manager phone numbers Table */
CREATE TABLE Manager_Phone (
    
    M_ID varchar(15) not null,
    Phone_no decimal (10, 0) not null,
    
    CONSTRAINT Manager_Phone_PK PRIMARY KEY (M_ID),
    CONSTRAINT Manager_Phone_FK FOREIGN KEY (M_ID) REFERENCES Manager(M_ID)

);


/* Report Table*/
CREATE TABLE Reports (
    M_ID varchar(15) not null,
    R_ID varchar(15) not null,
	R_type varchar(20) not null,
    R_date date not null,
    Exp_date date not null,
    
    CONSTRAINT Reports_PK PRIMARY KEY(R_ID),
    CONSTRAINT Reports_FK FOREIGN KEY(M_ID) REFERENCES Manager(M_ID)

);


/*Donation Table*/
CREATE TABLE Donation (
   User_ID VARCHAR(15) not null,
   D_ref_no VARCHAR(15) not null,
   D_date DATE not null,
   D_salutation VARCHAR(6) not null,
   D_name VARCHAR(15) not null,
   Amount FLOAT not null,
   Phone_no decimal(10,0) not null,
   
   CONSTRAINT Donation_PK PRIMARY KEY (D_ref_no),
   CONSTRAINT Donation_FK FOREIGN KEY (User_ID) REFERENCES Registered_user(User_ID)
);

/* Reservation Table details */
create table Reservation(
	Admin_ID varchar(15) NOT NULL,
	Res_ID varchar(15) NOT NULL,
	User_ID varchar(15) NOT NULL,
	Date date NOT NULL,
	F_name varchar(30) NOT NULL,
	L_name varchar(30) NOT NULL,
	Country varchar(40) NOT NULL,
	Phone_no int NOT NULL,
	No_adults int NOT NULL,
	No_children int NOT NULL,
	G_ID varchar(15)NOT NULL,
	status varchar(30) NOT NULL,
	P_ID varchar(15) NOT NULL,
	constraint reservation_PK primary key (Res_ID),
	constraint reservation_FK foreign key (Admin_ID) references Administrator(Admin_ID),
	constraint reservation1_FK foreign key (User_ID) references Registered_user(User_ID),
	constraint Phone_no_CHK CHECK (Phone_no BETWEEN 0000000000 AND 9999999999),
);
/*Admin manager Table*/
CREATE TABLE Admin_managesTG (
    
    G_ID varchar(15) not null,
    Admin_ID varchar(15) not null,
    
    CONSTRAINT Admin_managesTG_PK PRIMARY KEY (Admin_ID),
    CONSTRAINT Admin_managesTG_FK FOREIGN KEY (G_ID) REFERENCES Tour_Guide_Phone(G_ID)

);


/* Packages Table*/
CREATE TABLE Packages (
    P_ID VARCHAR(15) not null,
    P_price FLOAT not null,
    P_type VARCHAR(15) not null,
    User_ID VARCHAR(15) not null,
    
    CONSTRAINT Packages_PK PRIMARY KEY(P_ID),
    CONSTRAINT Packages_FK FOREIGN KEY(User_ID) REFERENCES Registered_user(User_ID)
    
);

/*Admin manages user Table*/
CREATE TABLE Admin_manageUser (
    
    User_ID varchar(15) not null,
    Admin_ID varchar(15) not null,
    
    CONSTRAINT Admin_manageUser_PK PRIMARY KEY (User_ID),
	CONSTRAINT Admin_manageUser_FK1 FOREIGN KEY (User_ID) REFERENCES Registered_user(User_ID),
	CONSTRAINT Admin_manageUser_FK2 FOREIGN KEY (Admin_ID) REFERENCES Administrator(Admin_ID),

); 


/* Feedback table */

create table Feedback(
	User_ID varchar(15) NOT NULL,
	Date date NOT NULL,
	F_ID varchar (15) NOT NULL,
	Rate float NOT NULL,
	Comment varchar(300),
	constraint Feedback_pk primary key (F_ID),
	constraint Feedback_FK foreign key(User_ID) references Registered_user(User_ID)
);


/*Inquires table*/

create table Inquires(
	User_ID varchar(15) NOT NULL,
	Inq_ID varchar(15) NOT NULL,
	date date NOT NULL,
	Inquiry varchar(500) NOT NULL,
	G_ID varchar(15)NOT NULL,
	constraint inquires_pk primary key (Inq_ID),
	constraint inquires_FK foreign key(User_ID) references Registered_user(User_ID),
	constraint inquires2_FK foreign key(G_ID) references Tour_guide(G_ID),
);


/* Inquiree_phone Table */

create table Inquiree_phone(
Inq_ID varchar(15)NOT NULL,
phone_no int , 
CONSTRAINT inquiree_phone_PK PRIMARY KEY (Inq_ID),
constraint inquiree_phone_FK foreign key(Inq_ID ) references Inquires(Inq_ID ),
);


/* Reservation Email Table */

create table Reservation_Email(
Res_ID varchar(15) NOT NULL,
Email varchar(50)NOT NULL,
CONSTRAINT Reservation_Email_PK PRIMARY KEY (Res_ID),
constraint Reservation_Email_FK foreign key(Res_ID) references Reservation(Res_ID),
constraint Reservation_Email_CHK CHECK (Email LIKE '%@%%'),
);


/* Reservation phone number Table */

create table Reservation_phone(
Res_ID varchar(15) NOT NULL,
Phone_no int ,
CONSTRAINT Reservation_phone_PK PRIMARY KEY (Res_ID),
constraint Reservation_phone_FK foreign key(Res_ID ) references Reservation(Res_ID),
);


 

/* Add table details */



/* Registered_user table details*/

INSERT INTO Registered_user VALUES ('W0001', 'Mr', 'Kamal', 'Samantha', 'No.56/2', 'Galle road','dfaffad', 567, 'Sri lanka', '****', '1985-10-08','Male', 'kamal@gmail.com' );
INSERT INTO Registered_user VALUES ('W0002', 'Mr', 'Madura', 'Dimantha', 'No.9/7', 'Nugegoda road','Nugegoda', 347, 'Sri lanka', '****', '1985-10-08','Male', 'madura@gmail.com' );
INSERT INTO Registered_user VALUES ('W0003', 'Ms', 'Sakuni', 'Sansala', 'No.36/8', 'Gothami road','hdhkjhf', 963, 'Australia', '****', '1985-10-08','Male', 'sakuni@gmail.com' );
INSERT INTO Registered_user VALUES ('W0004', 'Mr', 'Sithum', 'Apsara', 'No.25/47', 'Mahinda road','dsfjhadsf', 347, 'Canada', '****', '1985-10-08','Male', 'dimantha@gmail.com' );
INSERT INTO Registered_user VALUES ('W0005', 'Mrs', 'Malki', 'Jayathilaka', 'No.5/12', 'Rajakaruna road','dfkajfa', 741, 'Sri lanka', '****', '1985-10-08','Male', 'malki@gmail.com' );


/*Register_user_Phone table details*/
INSERT INTO Registered_user_Phone VALUES ('W0001', 0747456123);
INSERT INTO Registered_user_Phone VALUES ('W0002', 0767845684);
INSERT INTO Registered_user_Phone VALUES ('W0003', 0787456128);
INSERT INTO Registered_user_Phone VALUES ('W0004', 0779854623);
INSERT INTO Registered_user_Phone VALUES ('W0005', 0115875247);

/*Tour_Guide Table details*/

INSERT INTO Tour_Guide VALUES ('G0001', 'Waruna' , 'Deshappriya', 'No.8/12', 'Mahameuna Road', 964, 'Kandy', 'fkjdij', '1991-4-8', 'Deshappriya@gmail.com'  );
INSERT INTO Tour_Guide VALUES ('G0002', 'Silwa' , 'Sinhawanshe', 'No.8/45', 'Hewagama Road', 654,'Jaffna', 'ejijijk', '1985-9-15', 'Hewa@gmail.com'  );
INSERT INTO Tour_Guide VALUES ('G0003', 'Waruna' , 'Wijerathna', 'No.18', 'Nelligala Road', 964, 'Kandy', 'fkjdij', '1981-4-4', 'Wijerathna@gmail.com'  );
INSERT INTO Tour_Guide VALUES ('G0004', 'Nelum' , 'Sliva', 'No.1/62', 'Gegoda Road', 964, 'Kandy', 'fkjdij', '1991-4-8', 'silva@gmail.com'  );
INSERT INTO Tour_Guide VALUES ('G0005', 'Kamal' , 'Rathnayaka', 'No.1/962', 'kesbawa Road', 954, 'Borella', 'xeedj', '1991-5-21', 'Kamal@gmail.com'  );


/*Tour_Guide_Phone Table details*/

INSERT INTO Tour_Guide_Phone VALUES ('G0001', 0759638252);
INSERT INTO Tour_Guide_Phone VALUES ('G0002', 0755475561);
INSERT INTO Tour_Guide_Phone VALUES ('G0003', 0765245322);
INSERT INTO Tour_Guide_Phone VALUES ('G0004', 0754278232);
INSERT INTO Tour_Guide_Phone VALUES ('G0005', 0786424585);


/*Administator Table details*/

INSERT INTO Administrator (Admin_ID,F_name,L_name,House_no,M_ID,Street,Postal_code,city,Password,DOB,Email) VALUES ('A0001', 'sithum', 'munasinhe', 'No.273', 'M0001', 'Kota road', 586, 'Sithawa', 'suhjwghuy' ,'1993-03-02', 'munasinhe@gmail.com');
INSERT INTO Administrator (Admin_ID,F_name,L_name,House_no,M_ID,Street,Postal_code,city,Password,DOB,Email) VALUES ('A0002' ,'hethum', 'hathurusinhe', 'No.87', 'M0002', 'King road', 865, 'Pasyala', 'swdefdf' ,'1999-03-04', 'hathurusinhe@gmail.com');
INSERT INTO Administrator (Admin_ID,F_name,L_name,House_no,M_ID,Street,Postal_code,city,Password,DOB,Email) VALUES ('A0003', 'Sethmi' ,'ijesinghe', 'No.67', 'M0003','Mathil road', 745, 'jaffna', 'shhysuj', '1994-03-05', 'Wijesinghe@gmail.com');
INSERT INTO Administrator (Admin_ID,F_name,L_name,House_no,M_ID,Street,Postal_code,city,Password,DOB,Email) VALUES ('A0004', 'Nirmal', 'alupahana' ,'No.54', 'M0004', 'Nilmal road', 632, 'Kalutara', 'sdauijm', '1997-02-24', 'kalupahana@gmail.com');
INSERT INTO Administrator (Admin_ID,F_name,L_name,House_no,M_ID,Street,Postal_code,city,Password,DOB,Email) VALUES ('A0005', 'Jayantha', 'jayathilaka', 'No.90', 'M0005', 'Kahatagas road', 953, 'Athurugiriya', 'sdauijm', '1989-07-09', 'ayathilaka@gmail.com');
 

/*Administrator_Phone Table details*/

INSERT INTO Administrator_Phone VALUES ('A0001', 0769576321);
INSERT INTO Administrator_Phone VALUES ('A0002', 0798745624);
INSERT INTO Administrator_Phone VALUES ('A0003', 0769645872);
INSERT INTO Administrator_Phone VALUES ('A0004', 0789643425);
INSERT INTO Administrator_Phone VALUES ('A0005', 0719755466);

/*	Manager table details*/

INSERT INTO Manager VALUES ('M0001', 'lalith kothalawala', 'No.98', 'Gamunu road', 654, 'Malabe', 'shuidh', '1996-05-30', 'kothalawala@gmail.com');


/* Manager_Phone table details*/

INSERT INTO Manager_Phone VALUES ('M0001', 0119632856);


/* Reports table details */

INSERT INTO Reports VALUES  ('M0001', 'R0001', 'Don_report','2019-12-11', '2019-12-31');
INSERT INTO Reports VALUES  ('M0001', 'R0002', 'Res_report','2019-12-21', '2019-12-31');
INSERT INTO Reports VALUES  ('M0001', 'R0003', 'Res_report','2020-12-19', '2020-12-31');
INSERT INTO Reports VALUES  ('M0001', 'R0004', 'Don_report','2020-12-28', '2020-12-31');


/*Donation table details*/
INSERT INTO Donation VALUES ('W0001', 'D0001', '2019-05-08', 'Mr', 'Kamal' , 10000 , 0712546489);
INSERT INTO Donation VALUES ('W0002', 'D0002', '2019-06-12', 'Mr', 'Madura' , 20000 , 0725487683);
INSERT INTO Donation VALUES ('W0003', 'D0003', '2019-05-07', 'Ms', 'Sakuni' , 50000 , 0776451367);
INSERT INTO Donation VALUES ('W0004', 'D0004', '2020-07-30', 'Mr', 'sithum', 100000, 0706895426);
INSERT INTO Donation VALUES ('W0005', 'D0005', '2021-10-01', 'Mrs', 'Malki', 90000, 0714465488);


/*Admin Admin_managesTG */
INSERT INTO Admin_managesTG VALUES ( 'G0002', 'A0003');
INSERT INTO Admin_managesTG VALUES ('G0003', 'M0001');
INSERT INTO Admin_managesTG VALUES ('G0004', 'M0002');
INSERT INTO Admin_managesTG VALUES ('G0001', 'M0004');


/*Packages table details*/
INSERT INTO Packages VALUES ('P0001', 50000, 'PT0001', 'W0001');
INSERT INTO Packages VALUES ('P0002', 75000, 'PT0002', 'W0002');
INSERT INTO Packages VALUES ('P0003', 90000, 'PT0003', 'W0003');
INSERT INTO Packages VALUES ('P0004', 85000, 'PT0003', 'W0004');
INSERT INTO Packages VALUES ('P0005', 67000, 'PT0003', 'W0005');

/*Reservation table details*/
INSERT INTO Reservation VALUES ('A0001', 'RE0001', 'W0001', '2019-06-19', 'Kamal', 'Samantha', 'Sri lanka', 0712546489, 1, 2, 'G0001', 'Approved', 'P0001');
INSERT INTO Reservation VALUES ('A0002', 'RE0002', 'W0002', '2019-12-12', 'Madura', 'Dimantha', 'Sri lanka', 0725487683, 2, 1, 'G0002', 'Approved', 'PT0002');
INSERT INTO Reservation VALUES ('A0003', 'RE0003', 'W0003', '2020-03-29', 'Sakuni', 'Sansala',  'Australia', 0776451367, 4, 3, 'G0003', 'Approved', 'P0003');
INSERT INTO Reservation VALUES ('A0004', 'RE0004', 'W0004', '2021-06-06', 'Sithum', 'Apsara',  'Canada', 0706895426, 3, 2, 'G0004', 'Approved', 'P0004');
INSERT INTO Reservation VALUES ('A0005', 'RE0005', 'W0005', '2022-01-18', 'Malki', 'Jayathilaka', 'Sri lanka', 0714465488, 2, 2, 'G0005', 'Cancelled', 'P0005');

/* Admin_manageUser table details*/
INSERT INTO Admin_manageUser VALUES ('W0001', 'A0001');
INSERT INTO Admin_manageUser VALUES ('W0002', 'A0002');
INSERT INTO Admin_manageUser VALUES ('W0003', 'A0003');
INSERT INTO Admin_manageUser VALUES ('W0004', 'A0004');
INSERT INTO Admin_manageUser VALUES ('W0005', 'A0005');

/*Feedback table details*/
INSERT INTO Feedback VALUES ('W0001', '2019-08-11', 'F0001', 5, 'Nice journey');
INSERT INTO Feedback VALUES ('W0002', '2019-11-25', 'F0002', 3, 'Good Service');
INSERT INTO Feedback VALUES ('W0003', '2020-02-06','F0003', 4, 'Perfect place');
INSERT INTO Feedback VALUES ('W0004', '2020-04-13', 'F0004', 5, 'Wonderful Expericence');
INSERT INTO Feedback VALUES ('W0005', '2021-04-27', 'F0005', 4, 'Enjoyful');

/*Inquires*/
INSERT INTO Inquires VALUES('W0001','IN0001','2022-01-01','can i know about package details?','G0001');
INSERT INTO Inquires VALUES('W0002','IN0002','2022-01-03','how to requests for requests cancelation?','G0002');
INSERT INTO Inquires VALUES('W0003','IN0003','2022-01-08','let me know available dates for reservation?','G0003');
INSERT INTO Inquires VALUES('W0004','IN0004','2022-02-03','can i donate funds without registering for the system?','G0004');
INSERT INTO Inquires VALUES('W0005','IN0005','2022-03-09','can we share our experiences in your website and how to do that?','G0005');

/*Inquires_Phone*/
INSERT INTO Inquiree_phone VALUES('IN0001',0753243154);
INSERT INTO Inquiree_phone VALUES('IN0002',0767861245);
INSERT INTO Inquiree_phone VALUES('IN0003',0789800780);
INSERT INTO Inquiree_phone VALUES('IN0004',0779123456);
INSERT INTO Inquiree_phone VALUES('IN0005',0789088990);

/*Reservation_Email*/
INSERT INTO Reservation_Email VALUES('RE0001','kamal@gmail.com');
INSERT INTO Reservation_Email VALUES('RE0002','madura@gmail.com');
INSERT INTO Reservation_Email VALUES('RE0003','sakuni@gmail.com');
INSERT INTO Reservation_Email VALUES('RE0004','dimantha@gmail.com');
INSERT INTO Reservation_Email VALUES('RE0005','malki@gmail.com');

/*Reservation_Phone*/
INSERT INTO Reservation_Phone VALUES('RE0001',0753243154);
INSERT INTO Reservation_Phone VALUES('RE0002',0767861245);
INSERT INTO Reservation_Phone VALUES('RE0003',0789800780);
INSERT INTO Reservation_Phone VALUES('RE0004',0779123456);
INSERT INTO Reservation_Phone VALUES('RE0005',0789088990);

