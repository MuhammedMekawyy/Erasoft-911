
DROP TABLE DOCTOR;

CREATE TABLE DOCTOR (
    ID NUMBER(4,0),
    NAME VARCHAR2(50),
    ADDRESS VARCHAR2(200),
    SALARY NUMBER(10,2)
);

INSERT INTO Doctor VALUES (1,  'Ahmed Ali',     'Cairo',       12000);
INSERT INTO Doctor VALUES (2,  'Sara Mohamed',   'Giza',        15000);
INSERT INTO Doctor VALUES (3,  'Omar Hassan',    'Alexandria',  11000);
INSERT INTO Doctor VALUES (4,  'Mona Youssef',   'Mansoura',    18000);
INSERT INTO Doctor VALUES (5,  'Kareem Adel',    'Tanta',       14000);
INSERT INTO Doctor VALUES (6,  'Nour Samir',     'Zagazig',     13000);
INSERT INTO Doctor VALUES (7,  'Heba Tarek',     'Ismailia',    16000);
INSERT INTO Doctor VALUES (8,  'Youssef Khaled', 'Aswan',       17000);
INSERT INTO Doctor VALUES (9,  'Salma Ahmed',    'Luxor',       12500);
INSERT INTO Doctor VALUES (10, 'Mostafa Nabil',  'Fayoum',      15500);

DELETE FROM DOCTOR WHERE ID=9;

SELECT NAME || ' salary is : '|| SALARY 
AS NAME_SALARY
FROM DOCTOR;

SELECT SALARY*2
AS DOUBLE_SALARY
FROM DOCTOR;

SELECT * FROM DOCTOR
WHERE SALARY =11000 OR SALARY=12000 OR SALARY=13000;

ALTER TABLE DOCTOR RENAME TO PRD_DOCTOR;