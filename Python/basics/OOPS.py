import random

class Hat:
    def __init__(self):
        self.houses = ["Gryffindor","Hufflepuff","Ravenclaw","Slytherin"]

    def sort(self,name):
        print(name,"is in",random.choice(self.houses))
        
hat = Hat()
hat.sort("Harry")

class Student:
    def __init__(self, name, house,patronus):
        self.name = name
        self.house = house
        self.patronus = patronus

    def __str__(self):
        return f"{self.name} from {self.house} with a patronus of {self.patronus}"


    #Getter
    @property
    def house(self):
        return self._house

    #Setter
    @house.setter
    def house(self,house):
        if house not in ["Gryffindor","Hufflepuff","Ravenclaw","Slytherin"]:
            raise ValueError("Invalid House")
        self._house = house


    @property
    def name(self):
        return self._name
    
    @name.setter
    def name(self, name):
        if not name:
            raise ValueError("Missing Name")
        self._name = name


    @property
    def patronus(self):
        return self._patronus

    @patronus.setter
    def patronus(self, patronus):
        if not patronus.strip():
            raise ValueError("Missing Patronus")
        self._patronus = patronus


    def charm(self):
        match self.patronus:
            case "Stag":
                return "🐴"
            case "Otter":
                return "🦦"
            case "Jack Russel Terrier":
                return "🐶"
            case _:
                return "🧝🏻‍♀️"

def main():
    student = get_student()
    print(f"{student.name} from {student.house}")
    print("Expecto Patronum")
    print(student.charm())
    print(student)

def get_student():
    # student = Student()
    # student.name = input("name: ")
    # student.house = input("house:  ")
    # return student

    name = input("name: ")
    house = input("house:  ")
    patronus = input("patronus:  ")

    student = Student(name,house,patronus) #constructor call
    return student

if __name__ == "__main__" :
    main()