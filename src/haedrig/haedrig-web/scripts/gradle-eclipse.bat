@echo off

call "%~dp0..\..\scripts\setenv"

cd /d "%~dp0.."
call gradle clean cleanEclipse eclipse

pause
