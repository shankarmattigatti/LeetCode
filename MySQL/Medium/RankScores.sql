-- 178. Rank Scores
SELECT s.score, COUNT(DISTINCT t.score) AS 'Rank'
FROM Scores s JOIN Scores t ON s.score <= t.score
GROUP BY s.Id
ORDER BY s.Score DESC;