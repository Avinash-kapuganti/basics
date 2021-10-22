inp=input('')
stack=[]
stack_close=[]
lst=['{','[','(']
lst2=['}',']',')']
for i in inp:
    if i in lst:
        stack.append(i)
    elif i in lst2 and len(stack)>0 and lst2.index(i)==lst.index(stack[-1]):
        stack.pop()
    else:
        stack_close.append(i)
        break
if(len(stack)==0 and len(stack_close)==0):
    print('Balanced')
else:
    print('Not Balanced')
# this is program of balance brackets 
