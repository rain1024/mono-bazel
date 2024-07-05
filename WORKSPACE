load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

http_archive(
    name = "com_google_googletest",
    urls = ["https://github.com/google/googletest/archive/release-1.11.0.zip"],
    strip_prefix = "googletest-release-1.11.0",
)

http_archive(
    name = "boost",
    urls = [
            #"https://sourceforge.net/projects/boost/files/boost/1.61.0/boost_1_61_0.tar.bz2/download",
            "https://boostorg.jfrog.io/artifactory/main/release/1.64.0/source/boost_1_64_0.tar.bz2",
    ],
    build_file = "BUILD.boost",
    type = "tar.bz2",
    strip_prefix = "boost_1_64_0/",
    sha256 = "7bcc5caace97baa948931d712ea5f37038dbb1c5d89b43ad4def4ed7cb683332",
)