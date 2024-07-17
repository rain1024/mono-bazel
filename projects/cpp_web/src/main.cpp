using namespace std;

// include third_party/crow
#include "calculator.h"
#include <cstdlib>
#include <ctime>
#include <iostream>

int main() {
    // crow::SimpleApp app;
    Calculator calculator;

    cout << "Hello World!" << endl;

    // CROW_ROUTE(app, "/")([&calculator]() {
    //     std::srand(std::time(nullptr));
    //     int num1 = std::rand() % 100 + 1;
    //     int num2 = std::rand() % 100 + 1;
    //     int result = calculator.add(num1, num2);
    //     return crow::response("Do you know " + std::to_string(num1) + " + " + std::to_string(num2) + " = " + std::to_string(result) + "?");
    // });

    // app.port(5000).multithreaded().run();
}