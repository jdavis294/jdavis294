import numpy as np
import statistics
def main():
    n = int(input("Enter n: "))
    if(n<=0):
        n=int(input("Please enter a positive integer thats greater than 0 for n: "))
    else:
        #local variables
        response=""
        length=n-1
        maximum=n
        minimum=0
        median=n//2
        #Temp array to store range of values between minimum and maximum
        temparray=[]

        print("Welcome to Guess My Number! \nPlease think of a number between 0 and" ,length)
        while response!="C":
            print("is your number: ", int(median), "?\nPlease enter C for correct, H for too high, or L for too low")
            response = input("Enter your response (H/L/C): ")

            """Median will become the new maximum then temp array will be set to the range of values between minimum and maximum,
            median will be updated accordingly to the middle number or half the list"""
            if (response == "H"):

                maximum=median
                temparray = np.arange(minimum, maximum, 1)
                median = statistics.median_high(temparray)

                """Median will become the new minimum then temp array will be set to the range of values between minimum and maximum,
                    median will be updated accordingly to the middle number or half the list"""
            elif (response == "L"):

                minimum=median

                temparray=np.arange(minimum,maximum,1)
                median = statistics.median_low(temparray)
                if minimum==median:
                    median=median+1
                elif minimum> median+1:
                    break


        print("Thank you for playing Guess My Number!")




if __name__ == '__main__':
    main()