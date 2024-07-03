load("@rules_kotlin//kotlin:kotlin.bzl", "kt_jvm_library", "kt_jvm_test")

kt_jvm_library
(
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
        "@maven//:org_junit_jupiter_junit_jupiter_api",
        "@maven//:org_junit_jupiter_junit_jupiter_engine",
        "@maven//:org_junit_platform_junit_platform_console_standalone"
    ],
    main_class = "org.junit.platform.console.ConsoleLauncher",
)