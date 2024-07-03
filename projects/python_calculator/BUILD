load("@rules_python//python:defs.bzl", "py_test")

py_library(
    name = "calculator_lib",
    srcs = ["calculator.py"],
    visibility = ["//visibility:public"]
)

py_binary(
    name = "calculator_main",
    srcs = ["calculator.py"],
    deps = [":calculator_lib"],
)

py_test(
    name = "calculator_test",
    srcs = ["test_calculator.py"],
    main = "test_calculator.py",
    deps = [
        ":calculator_lib",
    ],
)