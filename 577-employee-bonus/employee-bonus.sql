SELECT e.name, b.bonus
FROM employee AS e
LEFT JOIN bonus AS b
ON e.empid = b.empid where b.bonus < 1000 or b.bonus is null;
