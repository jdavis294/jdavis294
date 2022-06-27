def main():
    print("What is your name? ")
    name=input("Please Enter your name: ")
    while(name == ""):
        name=input("Please Enter your name: ")

    print("Hello, ", name,"!" )

if __name__ == '__main__':
    main()