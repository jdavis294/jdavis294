def main():
    #gets value of character
    """ print("value of *", ord('*'))
    print("value of /", ord('/'))
    print("value of +", ord("+"))
    print("value of -", ord('-'))"""

    operator = []
    operand = []
    result=0
    expression = (input("Enter expression that you want to calculate in infix order \n\nExpression: "))
    for i in range(len(expression)):
        # this will take spaces out of expression
        if expression[i].strip():
            # this check will determine if the element in the array is a digit or not if it is we will append
            if (expression[i].isdigit()):
                operand.append(int(expression[i]))
            else:
                operator.append((expression[i]))

    for i in range(0,len(operator)):
        list= len(operator)
        if (operator[i]<operator[-1]):

            cal=operator.pop()
            if cal=="+":
                x = operand.pop()
                y = operand.pop()
                result= x + y
            elif cal=="-":
                x = operand.pop()
                y = operand.pop()
                result = x - y
            elif cal =="*":
                x = operand.pop()
                y = operand.pop()
                result= x * y
            elif cal =="/":
                x = operand.pop()
                y = operand.pop()
                result= y/x
            operand.append(result)


    print(operand)
    print(result)
if __name__ == '__main__':
    main()