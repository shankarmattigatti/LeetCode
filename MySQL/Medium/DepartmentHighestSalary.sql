-- 184. Department Highest Salary
SELECT D.Name AS Department, E.Name AS Employee, E.Salary
FROM Employee E
JOIN Department D ON E.DepartmentId = D.Id AND (DepartmentID,Salary) IN
(SELECT DepartmentId, MAX(Salary) AS Max FROM Employee GROUP BY DepartmentId)