#separate capital,lower,symbols,digits
text="my name is Avinash @1234*&%"
capital=""
lower=""
symbols=""
digits=""
for i if text:
    in i.islower():
        lower+=i
    elseif i.isupper():
        capital+=i
    elseif i.isdigit():
        digits+=i
    else:
        symbols+=i
print(capital,lower,symbols.strip(),digits,sep="\n")        #strip() removes the white spaces
