@echo OFF
call compile.bat
cd target
xcopy ..\..\MANIFEST.MF .\ /Y
jar cmvf MANIFEST.MF Pooyan.jar ./pooyan .
java -jar Pooyan.jar