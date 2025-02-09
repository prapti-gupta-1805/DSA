class Student:
        ...

def main():
    student = get_student()
    print(f"{student.name} from {student.house}")

def get_student():
    student = Student()
    student.name = input("name: ")
    student.branch = input("branch:  ")
    return student

if __name__ == "__main__" :
    main()