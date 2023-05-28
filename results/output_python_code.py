#  мы можем создавать множество; 
NEW_SET = set() 
another_set = set("a","b","cdcd") #  операции 
NEW_SET.add("element") 
"some el" in NEW_SET 
another_set.clear() 
another_set.discard(1) 
another_set.clear() #  мы можем создавать словарь
dict = {} #  операции
dict.update({0,1}) 
dict.get(0) 
del dict[12912] 
999 in dict 
len(dict) #  массивы
s = [2,4,5] 
array = ["new","array","of syms"] #  операции
len(array) 
s.extend(["s"]) 
s.pop(0) 
s.pop() 
s[3]="3" #  функции
def add_numbers(number1,number2):
    sum = [number1] 
    return sum 
#  if (a > 5){ #      console.log(a)
#  } #  else{
#      console.log("Hello it's working!!!"); #  }
def add_3(num1):
    return 3 
a=add_3(0)+3**3 #  блоки с условием if
aa = 5 
cc = 5 
if(cc == 5):
    print(2)  
if(aa != cc):
    print(cc) 
else:
    if(aa >= cc):
        print("wow?")   