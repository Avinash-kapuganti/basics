#programs
#sum of numbers in a string

add=0
txt="ntn123hwr4ty4rdwa5"
for i in txt:
    if i.isdigit():
        add+=int(i)
print(add) 
    
