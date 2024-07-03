from flask import Flask
import random
from projects.python_calculator.calculator import Calculator

app = Flask(__name__)

@app.route('/')
def hello():
    num1 = random.randint(1, 100)
    num2 = random.randint(1, 100)
    calculator = Calculator()
    result = calculator.add(num1, num2)
    return f"Do you know {num1} + {num2} = {result}?"

if __name__ == '__main__':
    app.run(debug=True)