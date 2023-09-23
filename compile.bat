@echo OFF
cd src
javac -d .\target .\pooyan\Pooyan.java
xcopy /s .\pooyan\resources .\target\pooyan\resources\ /Y