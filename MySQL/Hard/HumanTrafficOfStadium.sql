-- 601. Human Traffic of Stadium
WITH ST AS (
    SELECT S.id, S.visit_date, S.people, id - row_number() OVER(ORDER BY id) AS grp
    FROM stadium S 
    WHERE people >= 100)
SELECT ST.id, ST.visit_date, ST.people
FROM ST 
WHERE grp IN (SELECT grp FROM ST GROUP BY grp HAVING COUNT(*) >= 3)