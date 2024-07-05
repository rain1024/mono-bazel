#include "calculator.h"
#include <gtest/gtest.h>

TEST(CalculatorTest, AddTest) {
    Calculator calc;
    EXPECT_EQ(calc.add(1, 1), 2);
    EXPECT_EQ(calc.add(-1, -1), -2);
    EXPECT_EQ(calc.add(-1, 1), 0);
    EXPECT_EQ(calc.add(0, 0), 0);
}

int main(int argc, char **argv) {
    ::testing::InitGoogleTest(&argc, argv);
    return RUN_ALL_TESTS();
}