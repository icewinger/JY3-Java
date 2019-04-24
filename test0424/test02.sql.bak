//测试2


//01
SELECT first_name,salary
FROM employees
WHERE salary > 12000;

//02
SELECT first_name,department_id,(salary*12)
FROM employees
WHERE employee_id = 176;

//03
SELECT first_name,salary
FROM employees
WHERE salary<5000 AND salary > 12000;

//SELECT*FROM employees
//WHERE salary in (5000,10000);

//04
SELECT first_name,department_id
FROM employees
WHERE department_id in (20,50);

//05
SELECT first_name,job_id
FROM employees
WHERE manager_id IS null;

//06
SELECT first_name,salary,commission_pct
FROM employees
WHERE commission_pct is not null;

//07
SELECT first_name
FROM employees
WHERE first_name LIKE "__a%";

//08
SELECT first_name
FROM employees
WHERE first_name LIKE "%a%e%"
OR first_name LIKE "%e%a%";

//09
SELECT first_name
FROM employees
WHERE first_name LIKE "%e";

//10
SELECT first_name,job_id
FROM	employees
WHERE department_id BETWEEN 80 AND 100;

//11
SELECT first_name job_id
FROM employees
WHERE manager_id in (100,101,110);