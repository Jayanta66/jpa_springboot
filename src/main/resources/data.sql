
insert into EMPLOYEE(EMP_id, EMP_name, DESIG)
values (1, 'Ram', 'Developer');
insert into EMPLOYEE(EMP_id, EMP_name, DESIG)
values (2, 'Saam', 'Developer');
insert into EMPLOYEE(EMP_id, EMP_name, DESIG)
values (3, 'Jadu', 'Developer');
insert into EMPLOYEE(EMP_id, EMP_name, DESIG)
values (4, 'Madhu', 'Developer');
insert into EMPLOYEE(EMP_id, EMP_name, DESIG)
values (5, 'Alex', 'Developer');
insert into EMPLOYEE(EMP_id, EMP_name, DESIG)
values (6, 'Bob', 'Developer');
insert into EMPLOYEE(EMP_id, EMP_name, DESIG)
values (7, 'Jack', 'Developer');
insert into EMPLOYEE(EMP_id, EMP_name, DESIG)
values (8, 'Adam', 'Developer');
insert into EMPLOYEE(EMP_id, EMP_name, DESIG)
values (9, 'Albert', 'Developer');
insert into EMPLOYEE(EMP_id, EMP_name, DESIG)
values (10, 'Jackson', 'Developer');
insert into EMPLOYEE(EMP_id, EMP_name, DESIG)
values (11, 'Tony', 'Developer');
insert into EMPLOYEE(EMP_id, EMP_name, DESIG)
values (12, 'Vijay', 'Developer');


INSERT INTO SALARY (EMP_ID, MONTHS, SALARY)
	VALUES (1, 'Jan', '10000.00');
INSERT INTO SALARY (EMP_ID, MONTHS, SALARY)
	VALUES (2, 'Feb', '12000.00');
INSERT INTO SALARY (EMP_ID, MONTHS, SALARY)
	VALUES (3, 'Mar', '10000.00');
	
INSERT INTO SALARY (EMP_ID, MONTHS, SALARY)
	VALUES (4, 'Apr', '40000.00');
INSERT INTO SALARY (EMP_ID, MONTHS, SALARY)
	VALUES (5, 'May', '60000.00');
INSERT INTO SALARY (EMP_ID, MONTHS, SALARY)
	VALUES (6, 'Jun', '50000.00');
INSERT INTO SALARY (EMP_ID, MONTHS, SALARY)
	VALUES (7, 'Jul', '150000.00');
INSERT INTO SALARY (EMP_ID, MONTHS, SALARY)
	VALUES (8, 'Aug', '165000.00');
INSERT INTO SALARY (EMP_ID, MONTHS, SALARY)
	VALUES (9, 'Sep', '10600.00');
INSERT INTO SALARY (EMP_ID, MONTHS, SALARY)
	VALUES (10, 'Oct', '104000.00');
INSERT INTO SALARY (EMP_ID, MONTHS, SALARY)
	VALUES (11, 'Nov', '100600.00');
INSERT INTO SALARY (EMP_ID, MONTHS, SALARY)
	VALUES (12, 'Dec', '10050.50');

	
	
	
	
select * from employee;
select * from salary;
		
		
select * from EMPLOYEE e left join SALARY s on e.emp_id = s.emp_id ;
		
select * from EMPLOYEE e right join SALARY s on e.emp_id = s.emp_id;
		
select * from EMPLOYEE e inner join SALARY s on e.emp_id = s.emp_id;

