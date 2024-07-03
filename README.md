# Mono Bazel

Mono Repository with [Bazel](https://bazel.build/)

## Getting Started

Install **bazel** with [bazelisk](https://github.com/bazelbuild/bazelisk)

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

## Build and Run Python Projects

To build, run, and test Python projects in Bazel, first set up [`rules_python`](https://github.com/bazelbuild/rules_python) in your `WORKSPACE` file and use `pip_install` to manage dependencies specified in `requirements.txt`. Next, define dependencies in your `BUILD` files, such as using `@pip_deps` for external packages. This approach ensures efficient dependency management and reproducible builds within a Bazel monorepo.

## Examples

This repository contains two projects: `python_calculator` and `python_web`.
The `python_web` project depends on the `python_calculator` project.

### Build `python_calculator` project

First, ensure that `python_calculator` is built successfully:

```sh
$ bazel build //projects/python_calculator:calculator_lib

INFO: Build completed successfully, 1 total action

$ bazel test //projects/python_calculator:calculator_test

//projects/python_calculator:calculator_test    (cached) PASSED in 0.4s
```

### Build `python_web` project

```sh
$ bazel run //projects/python_web
INFO: Build completed successfully, 1 total action
INFO: Running command line: bazel-bin/projects/python_web/python_web
 * Serving Flask app 'python_web'
 * Running on http://127.0.0.1:5000
```