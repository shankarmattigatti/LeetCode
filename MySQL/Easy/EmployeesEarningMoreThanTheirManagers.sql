-- 181. Employees Earning More Than Their Managers
SELECT E.Name AS Employee
FROM Employee E
INNER JOIN Employee M ON E.ManagerId = M.id
WHERE E.Salary > M.Salary;