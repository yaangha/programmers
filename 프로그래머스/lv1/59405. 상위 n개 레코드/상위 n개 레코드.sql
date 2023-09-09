-- 코드를 입력하세요
SELECT name
FROM (SELECT name, datetime, rank() over (ORDER BY datetime) as rnk FROM animal_ins)
WHERE rnk = 1;