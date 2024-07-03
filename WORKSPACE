workspace(name = "mono-bazel")

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

http_archive(
    name = "rules_python",
    sha256 = "b593d13bb43c94ce94b483c2858e53a9b811f6f10e1e0eedc61073bd90e58d9c",
    strip_prefix = "rules_python-0.12.0",
    url = "https://github.com/bazelbuild/rules_python/archive/refs/tags/0.12.0.tar.gz",
)

### Python Setup
load("@rules_python//python:pip.bzl", "pip_install")

pip_install(
    name = "pip",
    requirements = "//third_party:requirements.txt",
)
