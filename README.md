# Mono Bazel

Mono Repository with Bazel

## Getting Started

Install bazel with bazelisk

```sh
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

## Build and Run Projects

This repository contains two projects: `python_calculator` and `python_web`.
The `python_web` project depends on the `python_calculator` project.

### Build `python_calculator` project

First, ensure that `python_calculator` is built successfully:

```sh
$ bazel build //projects/python_calculator:calculator_lib

$ bazel test //projects/python_calculator:calculator_test
```

### Build `python_web` project

```sh
$ bazel run //projects/python_web
```