SELECT 
    ti.ITEM_ID,
    ti.ITEM_NAME,
    ti.RARITY
FROM 
    ITEM_TREE it
JOIN 
    ITEM_INFO ti ON it.ITEM_ID = ti.ITEM_ID
JOIN 
    ITEM_INFO parent_info ON it.PARENT_ITEM_ID = parent_info.ITEM_ID
WHERE 
    parent_info.RARITY = 'RARE'
ORDER BY 
    ti.ITEM_ID DESC;
