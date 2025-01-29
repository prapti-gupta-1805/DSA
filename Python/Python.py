print("hello world!")


# single line comment
'''
multiple
line
comment
'''

print("a", end = "") #puts nothing at EOL instead of newline
print("a") #end = '\n' by 
a = input("What is your name?  ")
print("Hello " + a + "!!")
print("Hello" ,a, "!!", sep = "") #puts no space between two values
print("Hello" ,a, "!!") #adds space by default
print(f"Hello {a}")


#to print quotes
#print("Hello "friend"") - won't work
print('Hello "friend"')
print("hello \"friend\"")


#.strip() function removes whitespaces from string
name1 = name2 = name3 = "                 PRAPTI                 "
name4 = "prapti"

name1 = name1.lstrip() #for left spaces
print("/" + name1 + "/", sep="")
name2 = name2.rstrip() #for right spaces
print("/" + name2 + "/", sep="")
name3 = name3.strip() #for all spaces
print("/" + name3 + "/", sep="")
name4 = name4.strip('i') #to remove argument passed
print(name4)