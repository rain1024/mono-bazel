# Mono Bazel

Mono Repository with Bazel

## Getting Started

Mono Repository with [Bazel](https://bazel.build/)

```
$ curl -Lo bazelisk https://github.com/bazelbuild/bazelisk/releases/latest/download/bazelisk-linux-amd64
$ chmod u+x bazelisk
$ sudo mv bazelisk /usr/local/bin/bazel
$ bazel version

Bazelisk version: v1.20.0
WARNING: Invoking Bazel in batch mode since it is not invoked from within a workspace (below a directory having a WORKSPACE file).
OpenJDK 64-Bit Server VM warning: Options -Xverify:none and -noverify were deprecated in JDK 13 and will likely be removed in a future release.
Build label: 7.2.1
Build target: @@//src/main/java/com/google/devtools/build/lib/bazel:BazelServer
Build time: Tue Jun 25 15:53:05 2024 (1719330785)
Build timestamp: 1719330785
Build timestamp as int: 1719330785
```

## Build and Test Kotlin Projects

To build Kotlin with Bazel, we use the [rules_kotlin](https://github.com/bazelbuild/rules_kotlin) rule. For installing additional packages, we use [rules_jvm_external](https://github.com/bazelbuild/rules_jvm_external) and maven_install.

### Build and test `kotlin_calculator` Project

Build `kotlin_calculator` Project

```sh
$ bazel build //projects/kotlin_calculator:kotlin_calculator_lib 

INFO: Found 1 target...
Target //projects/kotlin_calculator:kotlin_calculator_lib up-to-date:
  bazel-bin/projects/kotlin_calculator/kotlin_calculator_lib.jar
  bazel-bin/projects/kotlin_calculator/kotlin_calculator_lib.jdeps

INFO: Elapsed time: 10.064s, Critical Path: 1.76s
INFO: 2 processes: 1 internal, 1 worker.
INFO: Build completed successfully, 2 total actions
```

Test `kotlin_calculator` Project

```sh
$ bazel test //projects/kotlin_calculator:kotlin_calculator_test

INFO: Build completed successfully, 12 total actions
//projects/kotlin_calculator:kotlin_calculator_test      PASSED in 0.5s

Executed 1 out of 1 test: 1 test passes.
```

### Build `kotlin_web` project

```sh
$ bazel run //projects/kotlin_web:vertx_example

INFO: Elapsed time: 0.846s, Critical Path: 0.11s
INFO: 1 process: 1 internal.
INFO: Build completed successfully, 1 total action
INFO: Running command line: bazel-bin/projects/kotlin_web/vertx_example
A web service is running on port 5000
```

