@echo off

call "%~dp0..\..\scripts\setenv"

cd /d "%~dp0.."
gradle -Dfile.encoding=UTF-8 clean build 2>&1 | "%~dp0..\..\scripts\tee" "%~dp0stdout.log"

pause
