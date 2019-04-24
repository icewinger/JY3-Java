//01
SELECT first_name,department_id,(salary*12)
FROM employees
ORDER BY (salary*12) DESC,first_name;

//02
SELECT first_name,salary
FROM employees
WHERE salary<8000 OR salary>17000
ORDER BY salary DESC;

//03
SELECT *
FROM employees
WHERE email LIKE "%e%" AND LENGTH(email),

