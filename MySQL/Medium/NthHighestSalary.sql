-- 177. Nth Highest Salary
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      SELECT DISTINCT e1.salary
      FROM Employee e1
      WHERE N-1 = (
          SELECT COUNT(DISTINCT e2.Salary)
          FROM Employee e2 WHERE e1.Salary < e2.Salary
      )
  );
END