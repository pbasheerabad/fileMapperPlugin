CREATE OR REPLACE PROCEDURE GET_MAPS (
  RESULTS OUT SYS_REFCURSOR 
)AS 
CMD  VARCHAR2(2000);
BEGIN
 CMD:='SELECT MAP_ID, SOURCE_ID, DESCR FROM FILE_MAPS'; 
  open RESULTS for CMD;
END GET_MAPS;