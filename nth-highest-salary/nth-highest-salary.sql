CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
declare m int;
set m=n-1;
  RETURN (
      # Write your MySQL query statement below.
     SELECT DISTINCT Salary FROM Employee ORDER BY Salary DESC LIMIT M, 1
      
  );
END