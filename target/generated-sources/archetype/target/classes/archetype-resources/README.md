# ArquetipoBatch

> mvn archetype:create-from-project

Maven genera el siguiente directorio
	
	\target\generated-sources
	
	En la carpeta  \target\generated-sources\archetype\src\main\resources\META-INF\maven
	se crea la info del artifact y el fichero "archetype-metadata.xml" que contiene la configuracion de como se generará el artifact. 
	Si lo abrimos podemos ver, que define los directorios base para los proyectos maven (es decir la carpeta src/main/java y la  /test.  
	Este fiehero se puede editar por si queremos excluir alguna extension de archivo y cosas asi).

# Instalación del Arquetipo en el repositorio local
    
	Vamos a la raiz del artifact \target\generated-sources\archetype (aqui esta el pom.xml del arfifact).
	Para instalarlo hacemos como un modulo normal de Maven:

	> mvn clean install

# Creación de un proyecto a partir del arquetipo local

    Ir al workspace y ejecutar:
		
	> mvn archetype:generate -DarchetypeCatalog=local

	Aparece un listado de arquetipos disponibles en local.
	
    Introducir los datos del proyecto: groupId, artifactId y paquetería.

	El proyecto será creado en un directorio con el nombre del artifactId introducido.
	
    Ir al directorio del proyecto recien creado y ejecutar:

	> mvn eclipse:eclipse
	
	El proyecto es preparado para trabajar con Eclipse
	
    Construir el proyecto para que se actualicen las dependencias.

	> mvn clean install