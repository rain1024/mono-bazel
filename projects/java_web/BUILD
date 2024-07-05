load("@rules_java//java:defs.bzl", "java_binary")

package(default_visibility = ["//visibility:public"])

java_binary(
    name = "main_application",
    srcs = glob(["src/main/java/**/*.java"]),
    main_class = "com.example.MainApplication",
    deps = [
        "//projects/java_calculator:calculator",
        "@maven//:org_springframework_boot_spring_boot",
        "@maven//:org_springframework_boot_spring_boot_autoconfigure",
        "@maven//:org_springframework_boot_spring_boot_starter_web",
        "@maven//:org_springframework_spring_web"
    ],
)