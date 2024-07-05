cc_binary(
    name = "cpp_web",
    srcs = ["src/main.cpp"],
    deps = [
        "//projects/cpp_calculator:calculator_lib"
    ],
    includes = ["third_party/crow/include"],
    copts = ["-Ithird_party/crow/include"],
)