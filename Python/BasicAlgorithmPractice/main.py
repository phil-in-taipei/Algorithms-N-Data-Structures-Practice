from calculator import calculator_class


if __name__ == '__main__':
    print("-------------------------------------------------------------------------")
    print("Calculator class with 10 and 2 input as argument values")
    calculator = calculator_class.Calculator(10, 2)
    print("-------------------------------------------------------------------------")
    print("The addition output is: " + str(calculator.add()))
    print("-------------------------------------------------------------------------")
    print("The subtraction output is: " + str(calculator.subtract()))
    print("-------------------------------------------------------------------------")
    print("The multiplication output is: " + str(calculator.multiply()))
    print("-------------------------------------------------------------------------")
    print("The division output is: " + str(calculator.divide()))
    print("-------------------------------------------------------------------------")
    print("Finished!")
    print("-------------------------------------------------------------------------")


