class Student:
        def __init__(self, name, branch):
            self.name = name
            self.branch = branch

def main():
    student = get_student()
    print(f"{student.name} from {student.branch}")

def get_student():
    # student = Student()
    # student.name = input("name: ")
    # student.branch = input("branch:  ")
    # return student

    name = input("name: ")
    branch = input("branch:  ")
    student = Student(name,branch) #constructor call
    return student

if __name__ == "__main__" :
    main()