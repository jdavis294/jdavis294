def main():
    calculator=[]
    response = "y"
    #while loop to keep calculator going
    while(response == "y"):
        expression= (input("enter expression that you want to calculate in post fix order \nex. 1 5 + is equal to  1+5 \n\nExpression: "))
        # test cases :  if expression isn't entered or contains letters raise an exception
        if not expression:
            raise Exception("No expression entered")
        if expression.isalpha():
            raise Exception("this contains letters please try again")

        """ Take user input and loop through with checks to append to stack"""
        for i in range (len(expression)):
            # this will take spaces out of expression
            if expression[i].strip():
                # this check will determine if the element in the array is a digit or not if it is we will append
                if(expression[i].isdigit()):
                    calculator.append(int(expression[i]))
                #if the element is a operator we will pop the elements before and calculate
                #after the expresion is done we will append the result of ot back in to the stack
                #adition
                elif expression[i]=="+":
                    x= calculator.pop()
                    y = calculator.pop()
                    result= x + y
                    calculator.append(result)
                    #subtraction
                elif expression[i]=="-":
                    x= calculator.pop()
                    y = calculator.pop()
                    result= y - x
                    calculator.append(result)
                    #multiplication
                elif expression[i]=="*":
                    x = calculator.pop()
                    y = calculator.pop()
                    result= x * y
                    calculator.append(result)
                    #division
                elif expression[i]=="/":
                    x= calculator.pop()
                    y = calculator.pop()
                    result= y / x
                    calculator.append(int(result))
        print(calculator)
        response= input("would you like to try again y or n ? ")


# the time complexity of this algorithm is 0(1) constant time
""" if ran with a deque i think you'll be able to go through the list more efficiently.
It is somewhat the same but you can do more with deque interface"""
if __name__ == '__main__':
    main()