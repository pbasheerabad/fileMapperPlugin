CREATE OR REPLACE PROCEDURE GET_DATA_TYPES 
(
  RESULTS OUT SYS_REFCURSOR 
)AS 
CMD  VARCHAR2(2000);
BEGIN
CMD:='select TYPE_NAME, TARGET_TABLE,IS_DIM_TABLE  from DATA_TYPES where IS_ACTIVE ='''||'Y' ||'''';
--DBMS_OUTPUT.PUT_LINE(CMD);
 open RESULTS for CMD;
END GET_DATA_TYPES;