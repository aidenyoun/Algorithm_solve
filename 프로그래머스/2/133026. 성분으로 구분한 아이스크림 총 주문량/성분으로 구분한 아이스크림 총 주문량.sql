-- 코드를 입력하세요
SELECT INFO.INGREDIENT_TYPE, SUM(HALF.TOTAL_ORDER) AS "TOTAL_ORDER"
FROM FIRST_HALF HALF
   , ICECREAM_INFO INFO
WHERE HALF.FLAVOR = INFO.FLAVOR   
GROUP BY INFO.INGREDIENT_TYPE
ORDER BY 2
