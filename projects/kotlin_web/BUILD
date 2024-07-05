load("@rules_kotlin//kotlin:jvm.bzl", "kt_jvm_binary")

kt_jvm_binary(
    name = "vertx_example",
    srcs = glob(["src/main/kotlin/**/*.kt"]),
    main_class = "com.example.MainVerticle",
    deps = [
        "//projects/kotlin_calculator:kotlin_calculator_lib",
        "@maven//:io_vertx_vertx_core",
        "@maven//:io_vertx_vertx_web"
    ]
)