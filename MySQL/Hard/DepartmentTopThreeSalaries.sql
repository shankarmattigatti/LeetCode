-- 185. Department Top Three Salaries
SELECT D.name AS Department, E.Name AS Employee, E.Salary
FROM Employee E
JOIN Department D ON E.DepartmentId = D.Id
WHERE (Select COUNT(DISTINCT emp.Salary) 
		FROM Employee emp
		WHERE emp.DepartmentId = E.DepartmentId and emp.Salary > E.Salary) < 3;