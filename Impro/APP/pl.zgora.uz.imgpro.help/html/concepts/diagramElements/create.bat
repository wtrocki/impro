@echo off

FOR /F %%i IN (%CD%\aalista.txt) DO (
copy Template.htm %%i
)