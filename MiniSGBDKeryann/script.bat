javac -d %~dp0\compilation\classes %~dp0\src\main.java %~dp0\src\SQL\command.java %~dp0\src\SQL\tempdb.java %~dp0\src\SQL\translator.java
pause
java -classpath %~dp0\compilation\classes main
pause