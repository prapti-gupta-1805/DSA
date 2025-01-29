# single line comment
'''
multiple
line
comment
'''



a = input("What is your name?  ") #taking input

print("Hello " + a + "!!")
print("Hello" ,a, "!!")
print(f"Hello {a}")

print("a", end = "") #puts nothing at EOL instead of newline (end = '\n' by default)
print("a" + "b", sep = "")  #puts no space between two values (sep = " " by default)


#to print quotes within quotes
print('Hello "friend"')
print("hello \"friend\"")


name = "prapti gupta"
name1 = "                 PRAPTI                 "
name2 = "prapti"
 
#.strip() function removes whitespaces from string
print("/" + name1.strip() + "/") #for all spaces
print("/" + name1.lstrip() + "/") #for left spaces
print("/" + name1.rstrip() + "/") #for right spaces
print(name2.strip('i')) #to remove argument passed

print(name.capitalize()) #capitaize first letter

print(name.title()) #title case

first, last = name.split(" ") #split a multi word string around the space
print(first + " | " + last)