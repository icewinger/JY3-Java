CREATE TABLE student
(
	stuId varchar(15) primary key,
	stuName varchar(10) not null,
	stuAge int,
	stuSex varchar(1)
)

CREATE TABLE course
(
	courseId tinyint primary key,
	courseName varchar(10) not null unique
)

CREATE TABLE stuAndCourse
(
	scId int primary key auto_increment,
	sId varchar(15),
	cId tinyint 
)

����ѧ�Ų�ѯ�γ���Ϣ
SELECT 