load("@pip//:requirements.bzl", "requirement")

py_library(
    name = "python_web_lib",
    srcs = ["python_web.py"],
    deps = [
        "//projects/python_calculator:calculator_lib",
        requirement("Flask")
    ],
)

py_binary(
    name = "python_web",
    srcs = ["python_web.py"],
    deps = [":python_web_lib"],
)