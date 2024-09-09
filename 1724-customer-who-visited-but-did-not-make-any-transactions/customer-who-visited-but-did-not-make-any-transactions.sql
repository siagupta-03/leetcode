# Write your MySQL query statement below
Select visits.customer_id, COUNT(visits.visit_id) AS count_no_trans
from visits
 LEFT JOIN transactions ON
visits.visit_id= transactions.visit_id
where Transaction_id IS NULL
Group by customer_id;