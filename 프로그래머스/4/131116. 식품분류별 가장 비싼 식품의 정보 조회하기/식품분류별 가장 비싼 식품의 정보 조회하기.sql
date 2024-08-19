SELECT 
    CATEGORY AS Food_Category,        -- 식품 분류
    PRICE AS Max_Price,               -- 최대 가격
    PRODUCT_NAME AS Product_Name      -- 식품 이름
FROM 
    FOOD_PRODUCT
WHERE 
    (CATEGORY, PRICE) IN (
        SELECT 
            CATEGORY, 
            MAX(PRICE) 
        FROM 
            FOOD_PRODUCT
        WHERE 
            CATEGORY IN ('과자', '국', '김치', '식용유')
        GROUP BY 
            CATEGORY
    )
ORDER BY 
    PRICE DESC;                       -- 가격 기준으로 내림차순 정렬