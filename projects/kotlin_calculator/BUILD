load("@rules_kotlin//kotlin:kotlin.bzl", "kt_jvm_library", "kt_jvm_test")

kt_jvm_library(
    name = "kotlin_calculator_lib",
    srcs = ["src/main/kotlin/com/example/Calculator.kt"],
    deps = [],
)

kt_jvm_test(
    name = "kotlin_calculator_test",
    test_class = "com.example.CalculatorTest",
    srcs = ["src/test/kotlin/com/example/CalculatorTest.kt"],
    deps = [
        ":kotlin_calculator_lib",
        "@maven//:com_google_truth_truth",
        "@maven//:junit_junit",
    ]
)