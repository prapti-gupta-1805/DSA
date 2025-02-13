import random

class Hat:
    houses = ["Gryffindor","Hufflepuff","Ravenclaw","Slytherin"]

    @classmethod #to use a class method without instantiating it/creating an object
    def sort(cls,name):
        print(name,"is in",random.choice(cls.houses))
        
Hat.sort("Harry")


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
# Subclass demonstrating inheritance
class HogwartsStudent(Student):
    def __init__(self, name, house, patronus, year):
        super().__init__(name, house, patronus)  # Call the parent constructor
        self.year = year
    
    def __str__(self):
        return f"{self.name}, a year {self.year} student from {self.house}, with a patronus of {self.patronus}"

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
    year = input("year: ")

    student = HogwartsStudent(name, house, patronus, year)
    return student

if __name__ == "__main__" :
    main()