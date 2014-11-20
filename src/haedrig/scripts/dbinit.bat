@echo off

call "%~dp0setenv"

set MYSQL_LOGON=-u%DBUSER%
if not "%DBPASS%" == "" set MYSQL_LOGON=%MYSQL_LOGON% -p%DBPASS%
"%MYSQL_HOME%\bin\mysql" %MYSQL_LOGON% -f mysql < %~dp0etc\mysql.sql
"%MYSQL_HOME%\bin\mysql" %MYSQL_LOGON% zkbc < %~dp0etc\zkbc.sql
"%MYSQL_HOME%\bin\mysql" %MYSQL_LOGON% mgmt < %~dp0etc\mgmt.sql
pause
