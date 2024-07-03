class Calculator:
    def add(self, a, b):
        return a + b

if __name__ == '__main__':
    calc = Calculator()
    result = calc.add(2, 3)
    print(f"The result of adding 2 and 3 is: {result}")