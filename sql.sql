SELECT COUNT(*) FROM sample51;
SELECT COUNT(ALL name), COUNT(DISTINCT name) FROM sample51;
SELECT name, COUNT(name), SUM(quantity) FROM sample51 GROUP BY name;
SELECT name, COUNT(name) FROM sample51 GROUP BY name HAVING COUNT(name)=1;
SELECT name, COUNT(name), SUM(quantity) FROM sample51 GROUP BY name ORDER BY SUM(quantity) DESC ;
DELETE FROM sample54 WHERE a= (SELECT MIN(a) FROM sample54) ; 
SELECT * FROM sample54;
SELECT 
	(SELECT COUNT(*) FROM sample51) AS sq1;
UPDATE sample54 SET a= (SELECT MAX(a) FROM sample54);
SELECT * FROM (SELECT * FROM sample54) sq;

INSERT INTO sample541 VALUES (
 (SELECT COUNT(*) FROM sample51),
 (SELECT COUNT(*) FROM sample54)
 );
 SELECT * FROM sample541;
 
 INSERT INTO sample541 SELECT 1,2;
 SELECT * FROM sample541;
 SELECT * FROM sample551  SET a='있음' WHERE
 EXISTS (SELECT * FROM sample 552 WHERE no2=n0);
 
SELECT * FROM sample551;
SELECT * FROM sample551 WHERE no IN 
 	(SELECT no2 FROM sample552) ;
    CREATE TABLE sample632 (
 no INTEGER NOT NULL,
 sub_no INTEGER NOT NULL, 
 name VARCHAR(30),
 CONSTRAINT pkey_sample PRIMARY KEY (no.sub_no) 
 ) ;
SELECT * FROM sample_view_67;
