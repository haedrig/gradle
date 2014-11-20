@echo off

call "%~dp0..\..\scripts\setenv"

set GRADLE_USER_HOME=%UserProfile%\.gradle-p2p-pro.fep

cd /d "%~dp0.."
gradle run 2>&1 | "%~dp0..\..\scripts\tee" "%~dp0stdout.log"

pause
