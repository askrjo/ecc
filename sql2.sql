SELECT a AS c FROM sample71_a
UNION 
SELECT b AS c FROM sample71_b ORDER BY c;
SELECT * FROM sample71_a
UNION ALL
SELECT * FROM sample71_b;
SELECT * FROM sample72_x, sample72_y ;
SELECT 상품.상품명, 재고수.재고수
	FROM 상품 INNER JOIN 재고수
      ON 상품.상품코드 = 재고수.상품코드
   WHERE 상품.상품분류 = '식료품' ;