#include <iostream>
#include "calculator.h"

int main() {
    Calculator calc;
    int result = calc.add(3, 4);
    std::cout << "Result of adding 3 and 4: " << result << std::endl;
    return 0;
}