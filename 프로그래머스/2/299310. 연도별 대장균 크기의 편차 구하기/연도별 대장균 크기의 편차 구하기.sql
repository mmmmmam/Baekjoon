WITH MaxColonySize AS (
    SELECT 
        EXTRACT(YEAR FROM DIFFERENTIATION_DATE) AS year,
        MAX(SIZE_OF_COLONY) AS max_size
    FROM 
        ECOLI_DATA
    GROUP BY 
        EXTRACT(YEAR FROM DIFFERENTIATION_DATE)
),
ColonyDeviation AS (
    SELECT 
        EXTRACT(YEAR FROM e.DIFFERENTIATION_DATE) AS year,
        (m.max_size - e.SIZE_OF_COLONY) AS year_dev,
        e.ID
    FROM 
        ECOLI_DATA e
    JOIN 
        MaxColonySize m
    ON 
        EXTRACT(YEAR FROM e.DIFFERENTIATION_DATE) = m.year
)
SELECT 
    year,
    year_dev,
    ID
FROM 
    ColonyDeviation
ORDER BY 
    year ASC, 
    year_dev ASC;
