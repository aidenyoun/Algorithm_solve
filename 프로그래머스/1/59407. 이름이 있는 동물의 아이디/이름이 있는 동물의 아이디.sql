-- 코드를 입력하세요
SELECT ANIMAL_ID
FROM (
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
ORDER BY ANIMAL_ID ASC)
WHERE NAME IS NOT NULL;