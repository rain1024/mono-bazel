load("@rules_java//java:defs.bzl", "java_library", "java_binary")

java_library(
    name = "calculator",
    srcs = glob(["src/main/java/com/example/*.java"]),
    visibility = ["//visibility:public"]
)

java_binary(
    name = "calculator_app",
    srcs = glob(["src/main/java/com/example/*.java"]),
    main_class = "com.example.CalculatorApp",
)

java_test(
    name = "calculator_test",
    srcs = glob(["src/test/java/com/example/*.java"]),
    test_class = "com.example.CalculatorTest",
    deps = [
        ":calculator",
        "@maven//:junit_junit",
    ],
)