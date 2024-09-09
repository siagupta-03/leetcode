# Write your MySQL query statement below

select project_id , ROUND(AVG(experience_years),2) as average_years
from Project
LEFT JOIN Employee on 
project.employee_id = employee.employee_id
group by project_id;
