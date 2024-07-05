cc_library(
    name = "calculator_lib",
    srcs = ["src/calculator.cpp"],
    hdrs = ["src/calculator.h"],
    includes = ["src"],
    visibility = ["//visibility:public"]
)

cc_binary(
    name = "calculator_main",
    srcs = ["src/main.cpp"],
    deps = [":calculator_lib"]
)

cc_test(
    name = "calculator_test",
    srcs = ["tests/calculator_test.cpp"],
    deps = [
        ":calculator_lib",
        "@com_google_googletest//:gtest_main",
    ],
)