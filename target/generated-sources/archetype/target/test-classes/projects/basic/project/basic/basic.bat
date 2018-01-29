@echo off

REM Variable donde indicamos donde localizamos el directorio del comando JAVA. A definir dependiendo del Entorno
set "JAVA_BIN=%JAVA_HOME%\bin"

REM Definimos el CLASSPATH necesario
set PRE_CLASSPATH=./properties/;./jar/${project.build.finalName}.jar;
set PRE_CLASSPATH=%PRE_CLASSPATH%;../LibreriasBatch/log4j-1.2.17.jar;
set PRE_CLASSPATH=%PRE_CLASSPATH%;../LibreriasBatch/spring-core-3.1.1.RELEASE.jar;
set PRE_CLASSPATH=%PRE_CLASSPATH%;../LibreriasBatch/spring-asm-3.1.1.RELEASE.jar;
set PRE_CLASSPATH=%PRE_CLASSPATH%;../LibreriasBatch/spring-beans-3.1.1.RELEASE.jar;
set PRE_CLASSPATH=%PRE_CLASSPATH%;../LibreriasBatch/spring-context-3.1.1.RELEASE.jar;
set PRE_CLASSPATH=%PRE_CLASSPATH%;../LibreriasBatch/spring-aop-3.1.1.RELEASE.jar;
set PRE_CLASSPATH=%PRE_CLASSPATH%;../LibreriasBatch/spring-expression-3.1.1.RELEASE.jar;
set PRE_CLASSPATH=%PRE_CLASSPATH%;../LibreriasBatch/spring-orm-3.1.1.RELEASE.jar;
set PRE_CLASSPATH=%PRE_CLASSPATH%;../LibreriasBatch/spring-tx-3.1.1.RELEASE.jar;
set PRE_CLASSPATH=%PRE_CLASSPATH%;../LibreriasBatch/spring-jdbc-3.1.1.RELEASE.jar;
set PRE_CLASSPATH=%PRE_CLASSPATH%;../LibreriasBatch/aopalliance-1.0.jar;
set PRE_CLASSPATH=%PRE_CLASSPATH%;../LibreriasBatch/ibatis-2.3.0.677.jar;
set PRE_CLASSPATH=%PRE_CLASSPATH%;../LibreriasBatch/commons-logging-1.2.jar;
set PRE_CLASSPATH=%PRE_CLASSPATH%;../LibreriasBatch/commons-dbcp-1.2.2.jar;
set PRE_CLASSPATH=%PRE_CLASSPATH%;../LibreriasBatch/commons-pool-1.3.jar;
set PRE_CLASSPATH=%PRE_CLASSPATH%;../LibreriasBatch/ojdbc7-12.1.0.2.jar;

REM Anadimos nuestro classpath al del sistema
set classpath=%classpath%;%PRE_CLASSPATH%;

echo Iniciando proceso del Batch basic

REM Lanzamos la aplicacion
"%JAVA_BIN%"\java -Dlogs.batch.path=%1 -classpath %classpath% it.pkg.batch.Lanzador

echo Proceso Finalizado del Batch basic. Consultar el log para mas informacion
