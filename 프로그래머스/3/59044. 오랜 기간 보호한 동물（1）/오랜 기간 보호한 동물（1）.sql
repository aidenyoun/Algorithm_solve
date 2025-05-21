SELECT NAME, DATETIME
FROM (
    SELECT INS.*,
           ROW_NUMBER() OVER (ORDER BY INS.DATETIME ASC) as rn -- 보호소에 있었던 순서대로 순번 매기기
    FROM ANIMAL_INS INS
    WHERE NOT EXISTS (
        SELECT 1
        FROM ANIMAL_OUTS AUT
        WHERE AUT.ANIMAL_ID = INS.ANIMAL_ID -- 입양 간 동물은 제외
    )
)
WHERE rn <= 3;