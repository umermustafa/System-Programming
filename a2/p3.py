matrix=[]
	
for i in range(8):
	matrix.append([])
	for j in range(8):
		matrix[i].append(i+j)

d2=[[1,2],[2,3]]

print matrix

for a in range(8):
	for b in range(8):
	 if matrix[a][b]==d2[0][0]:
	   if matrix [a][b+1]==d2[0][1]:
	    if matrix[a+1][b]==d2[1][0]:
	     if	matrix[a+1][b+1]==d2[1][1]:			
			print d2
			print a ,b
		

