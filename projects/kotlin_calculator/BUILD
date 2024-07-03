load("@rules_kotlin//kotlin:kotlin.bzl", "kt_jvm_library", "kt_jvm_test")

kt_jvm_library(
    name = "kotlin_calculator_lib",
    srcs = glob(["src/main/kotlin/**/*.kt"]),
    deps = [],
)

kt_jvm_test(
    name = "kotlin_calculator_test",
    srcs = glob(["src/test/kotlin/**/*.kt"]),
    deps = [
        ":kotlin_calculator_lib",
        "@maven//:junit_junit",
    ],
)