#supplemetary file created to showcase user defined libraries in python

def main():
    print(hello("prapti"))
    print(goodbye("prapti"))


def hello(name="world"):
    return f"hello, {name}"

def goodbye(name):
    return f"goodbye, {name}"

if __name__ == "__main__":
    main()