all: mysum calculator

mysum: mysum.c
	gcc mysum.c -o mysum

clean:
	rm -f *.class mysum calculator

calculator: Example.class 
	echo "#!/bin/bash"
	echo "java Example" >> ./calculator
	chmod +x ./calculator

Example.class: *.java 
	javac *.java
