#separate capital,lower,symbols,digits
text="my name is Avinash @1234*&%"
capital=""
lower=""
symbols=""
digits=""
for i in text:
    if i.islower():
        lower+=i
    elif i.isupper():
        capital+=i
    elif i.isdigit():
        digits+=i
    else:
        symbols+=i
print('upper case: '+capital,'lower case: '+lower,'symbols: '+symbols.strip(),'digits: '+digits,sep="\n")
#strip() removes the white spaces
