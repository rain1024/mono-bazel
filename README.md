# Mono Bazel

<p align="center">
  <a href="https://github.com/rain1024/mono-bazel/">
    <img src="https://raw.githubusercontent.com/rain1024/mono-bazel/main/images/system-design.png" height="300">
  </a>
</p>

[Bazel](https://bazel.build/) is an excellent build and test tool. It is designed to handle projects of any size, supporting multiple languages and platforms. Bazel helps developers to automate the build process, ensuring high performance, reliability, and scalability.

This repository is dedicated to providing useful instructions on how to use Bazel in real projects across different programming languages. It includes:

- **Setup guides** for installing and configuring Bazel.
- **Sample projects** in Kotlin, Python, Java, and Rust to demonstrate practical use cases.
- **Best practices** for structuring Bazel projects and managing dependencies.
- **Troubleshooting tips** to help resolve common issues encountered during the build process.

## Getting Started

To quickly get started with Bazel, use [Bazelisk](https://github.com/bazelbuild/bazelisk). Bazelisk is a wrapper for Bazel that automatically downloads and installs the correct Bazel version specified in your project.

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

## Build and test `java_calculator` Project

### Build `java_calculator` library

```sh
bazel build //projects/java_calculator:calculator

INFO: Analyzed target //projects/java_calculator:calculator (0 packages loaded, 0 targets configured).
INFO: Found 1 target...
Target //projects/java_calculator:calculator up-to-date:
  bazel-bin/projects/java_calculator/libcalculator.jar
INFO: Elapsed time: 0.145s, Critical Path: 0.00s
INFO: 1 process: 1 internal.
INFO: Build completed successfully, 1 total action
```

### Build and run `java_calculator` application

```
bazel run //projects/java_calculator:calculator_app

INFO: Analyzed target //projects/java_calculator:calculator_app (0 packages loaded, 1 target configured).
INFO: Found 1 target...
Target //projects/java_calculator:calculator_app up-to-date:
  bazel-bin/projects/java_calculator/calculator_app.jar
  bazel-bin/projects/java_calculator/calculator_app
INFO: Elapsed time: 0.524s, Critical Path: 0.25s
INFO: 5 processes: 4 internal, 1 worker.
INFO: Build completed successfully, 5 total actions
INFO: Running command line: bazel-bin/projects/java_calculator/calculator_app

Calculator App
The result of adding 76 and 97 is: 173
```

### Test java_calculator Project

```sh
$ bazel test //projects/java_calculator:calculator_test

INFO: Found 1 test target...
Target //projects/java_calculator:calculator_test up-to-date:
  bazel-bin/projects/java_calculator/calculator_test.jar
  bazel-bin/projects/java_calculator/calculator_test
INFO: Elapsed time: 27.617s, Critical Path: 6.97s
INFO: 15 processes: 4 internal, 6 linux-sandbox, 5 worker.
INFO: Build completed successfully, 15 total actions
//projects/java_calculator:calculator_test                 PASSED in 0.3s

Executed 1 out of 1 test: 1 test passes.
```

## Build and run `java_web` project

```sh
$ bazel run //projects/java_web:main_application

INFO: Running command line: bazel-bin/projects/java_web/main_application

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.1.0.RELEASE)
 2024-07-05 14:25:04.002  INFO 135462 --- [.TomcatWebServer  : Tomcat started on port(s): 5000 (http) with context path ''
```

