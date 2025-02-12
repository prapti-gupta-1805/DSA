import csv
#TEXT FILES

#"w" opens new file if doesn't exist | clears file if exists
file = open("names.txt","w") #cursor object
file.write(input("enter a name "))
file.close
file.write("\n")

#other syntax to open a file
#"a" opens file with cursor at end if file already exists | throws error if file doesn't exist
with open("names.txt","a") as file: #cursor object
    name = input("enter a name ")
    file.write(f"{name}\n")
file.close

# with open("names.txt","r") as file:
#     lines = file.readlines()
# for line in lines:
#     print("hello, ", line, end = "")

#or
names = []
with open("names.txt","r") as file:
    for line in file:
        names.append(line)
for name in names:
    print(f"hello, {name}", end = "")

#CSV FILE


# # without csv module
# with open("names.csv","r") as file:
#     for line in file:
#         # row = line.rstrip().split(",")
#         # print(f"{row[0]} is in {row[1]}")
#         # or
#         name,house = line.rstrip().split(",")
#         print(f"{name} is in {house}")

with open("names.csv","r") as file:
    students = []
    reader = csv.reader(file)
    for row in reader:
        students.append({"name": row[0], "home": row[1]})

    for student in sorted(students, key = lambda student:student["name"]):
        print(f"{student['name']} is from {student['home']}") 

with open("names.csv","a") as file:
    writer = csv.writer(file)
    writer.writerow(["Cedric","Hufflepuff\n"])