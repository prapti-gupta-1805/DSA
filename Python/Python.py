print("hello world!")


# single line comment
'''
multiple
line
comment
'''


print("a") #end = '\n' by default
print("a", end = "") #puts nothing at EOL instead of newline
a = input("What is your name?  ") #taking input
print("Hello " + a + "!!")

print("Hello" ,a, "!!") #sep = " " by default
print("Hello" ,a, "!!", sep = "") #puts no space between two values
print(f"Hello {a}")


#to print quotes within quotes
print('Hello "friend"')
print("hello \"friend\"")


#.strip() function removes whitespaces from string
name1 = "                 PRAPTI                 "
name2 = "prapti"
 
print("/" + name1.lstrip() + "/") #for left spaces
print("/" + name1.rstrip() + "/") #for right spaces
print("/" + name1.strip() + "/") #for all spaces
print(name2.strip('i')) #to remove argument passed


name = "prapti gupta"
print(name.capitalize()) #capitaize first letter
print(name.title()) #title case