myexe : myStrFunc.o myMain.o myMathFunc.o 
	gcc myStrFunc.o myMain.o myMathFunc.o -o myexe
myStrFunc.o : myStrFunc.c myStrFunc.h
	gcc -c myStrFunc.c
myMathFunc.o : myMathFunc.c myMathFunc.h
	gcc -c myMathFunc.c
myMain.o : myMain.c
	gcc -c myMain.c
