JAVAC=/usr/lib/jvm/java-9-openjdk/bin/javac
RMIC=/usr/lib/jvm/java-9-openjdk/bin/rmic
JAVA=/usr/lib/jvm/java-9-openjdk/bin/java

all:
	${JAVAC} ServidorMain.java
	${RMIC} ServidorImpl
	${JAVAC} ClienteMain.java

clean:
	rm *.class

run_cliente:
	${JAVA} ClienteMain

run_servidor:
	${JAVA} ServidorMain
