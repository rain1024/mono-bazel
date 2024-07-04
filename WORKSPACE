load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

rules_kotlin_version = "1.9.0"
rules_kotlin_sha = "5766f1e599acf551aa56f49dab9ab9108269b03c557496c54acaf41f98e2b8d6"
http_archive(
    name = "rules_kotlin",
    urls = ["https://github.com/bazelbuild/rules_kotlin/releases/download/v%s/rules_kotlin-v%s.tar.gz" % (rules_kotlin_version, rules_kotlin_version)],
    sha256 = rules_kotlin_sha,
)

load("@rules_kotlin//kotlin:repositories.bzl", "kotlin_repositories")
kotlin_repositories()

load("@rules_kotlin//kotlin:core.bzl", "kt_register_toolchains")
kt_register_toolchains() # to use the default toolchain, otherwise see toolchains below

RULES_JVM_EXTERNAL_TAG = "4.5"
RULES_JVM_EXTERNAL_SHA = "b17d7388feb9bfa7f2fa09031b32707df529f26c91ab9e5d909eb1676badd9a6"

http_archive(
    name = "rules_jvm_external",
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    sha256 = RULES_JVM_EXTERNAL_SHA,
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % RULES_JVM_EXTERNAL_TAG,
)

load("@rules_jvm_external//:repositories.bzl", "rules_jvm_external_deps")

rules_jvm_external_deps()

load("@rules_jvm_external//:setup.bzl", "rules_jvm_external_setup")

rules_jvm_external_setup()

load("@rules_jvm_external//:defs.bzl", "maven_install")

maven_install(
    artifacts = [
        "junit:junit:4.13.2",
        "io.vertx:vertx-core:4.3.3",
        "io.vertx:vertx-web:4.3.3",
    ],
    fetch_sources = True,
    repositories = [
        "https://maven.google.com",
        "https://repo1.maven.org/maven2",
        "https://jcenter.bintray.com/",
    ],
    strict_visibility = True,
)