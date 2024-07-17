licenses(["notice"])

package(default_visibility = ["//visibility:public"])

cc_library(
    name = "crow",
    hdrs = glob([
        "include/crow/*.h"
    ]),
    includes = ["include"],
    linkopts = [
        "-pthread",
    ],
    visibility = ["//visibility:public"],
    deps = [
        "@boost//:system",
    ],
)
