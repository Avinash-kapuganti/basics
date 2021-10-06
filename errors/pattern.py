rows = int(input('Enter no.of rows:'))
j=0

for i in range(rows):
    #print(i+1,end='')
    # For indexing, delete the comments from the above commented statement.
    print('*',end= '')   # This prints a * star on the triangle's left side outer layer.
    
    if(i==(rows-1)):     # If block is used here to ensure that the last line only contains * and not spaces.
        print('*'*(i+1))
        continue
        
    print(end= ' '*(i))  # This statement specifies the number of gaps needed within the triangle.
    print("*"*j)    # The right half of the triangle is covered with a * star in this print statement.
    j=1
