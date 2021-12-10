#Creating a Calulator
while True:
    print("Options:");
    print("Enter 'add' to add two numbers");
    print("Enter 'subtract' to subtract two numbers");
    print("Enter 'multiply' to multiply two numbers");
    print("Enter 'divide' to divide two numbers");
    print("Enter 'quit' to end the program");
    user_input = input(": ");

    if (user_input == "quit"):
        break;
    elif (user_input == "add"):
        a1 = float(input("Enter a number: "));
        a2 = float(input("Enter another number: "));
        result = str(a1 + a2);
        print("The answer is " + result);
    elif (user_input == "subtract"):
        s1 = float(input("Enter a number: "));
        s2 = float(input("Enter another number: "));
        result = str(s1 - s2);
        print("The answer is " + result);
    elif (user_input == "multiply"):
        m1 = float(input("Enter a number: "));
        m2 = float(input("Enter another number: "));
        result = str(m1 * m2);
        print("The answer is " + result);
    elif (user_input == "divide"):
        d1 = float(input("Enter a number: "));
        d2 = float(input("Enter another number: "));
        result = str(d1 / d2);
        print("The answer is " + result);
    else:
        print("Unknown input");
