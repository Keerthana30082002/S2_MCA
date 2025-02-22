-- 01
SELECT * FROM countries;
-- 02
SELECT email, phone_number FROM employees;
-- 03
SELECT * FROM employees WHERE last_name="Fay";
-- 04
SELECT hire_date FROM employees WHERE last_name="Grant" OR last_name="Whalen";
-- 05
select first_name,last_name from employees join jobs on jobs.job_id=employees.job_id WHERE job_title="Shipping Clerk";
-- 06
SELECT * FROM employees WHERE department_id=8;
-- 07
SELECT * FROM Dept ORDER BY department_name DESC;
-- 08
SELECT * FROM employees WHERE last_name LIKE "K%";
-- 09
SELECT * FROM employees WHERE YEAR(hire_date) BETWEEN 1995 and 1997;
-- 10
SELECT * FROM jobs WHERE max_salary< 5000;
-- 11
SELECT LOWER(email) from employees;
-- 12
SELECT first_name,last_name from employees WHERE YEAR(hire_date)=1995;
-- 13
INSERT INTO employees VALUES(212, "Paul", "Newton", "paulnewton@gmail.com", "234824873", "1956-02-12", 4, 12000, 100, 11, 231);
-- 14
set sql_safe_updates=0;
DELETE FROM Dept WHERE department_name="Shipping";
-- 15
SELECT * FROM employees WHERE dayname(hire_date)="Thursday";