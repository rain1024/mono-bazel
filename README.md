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

**Creating a `Cute` application with Bazel**

In this section, we’ll build a simple Bazel project named [`cute`](https://github.com/rain1024/mono-bazel/tree/main/projects/cute). Every project in Bazel includes a `BUILD` file that provides instructions for compiling, testing, and packaging code. In this project, we use a [`genrule`](https://bazel.build/reference/be/general#genrule) to execute custom shell commands and generate files from specified inputs.

```
genrule(
    name = "cute",
    srcs = ["input.txt"],
    outs = ["output.txt"],
    cmd = """
        cat $(SRCS) > $(OUTS) && \
        echo 'Look at you, all cute and ready to build! 💖' >> $(OUTS)
    """
)
```

This rule concatenates the contents of `input.txt` into `output.txt` and appends a charming message, ensuring your build process is both efficient and adorable.

To build the project, use the following Bazel command:

```sh
$ bazel build //projects/cute

INFO: Analyzed target //projects/cute:cute (1 packages loaded, 2 targets configured).
INFO: Found 1 target...
Target //projects/cute:cute up-to-date:
  bazel-bin/projects/cute/output.txt
INFO: Elapsed time: 0.066s, Critical Path: 0.00s
INFO: 1 process: 1 internal.
INFO: Build completed successfully, 1 total action
```

After building, you can view the content of the generated output file with:

```sh
$ cat bazel-bin/projects/cute/output.txt
Hey Bazel! 🛠️
Look at you, all cute and ready to build! 💖
```

**Congratulations!** You’ve successfully built and run your first Bazel application. 🎉

## Build more awesome applications with Bazel

<table>
  <tr>
    <td align="center">
        <img
          src="https://raw.githubusercontent.com/rain1024/mono-bazel/main/images/python.png"
          alt="Python Example"
          height="150"/>
        <br/>
        <a href="https://github.com/rain1024/mono-bazel/tree/python">Python Example</a>
        <br/>
    </td>
    <td align="center">
        <img
          src="https://raw.githubusercontent.com/rain1024/mono-bazel/main/images/kotlin.png"
          alt="Kotlin Example"
          height="150"/>
        <br/>
        <a href="https://github.com/rain1024/mono-bazel/tree/kotlin">Kotlin Example</a>
    </td>
    <td align="center">
        <img
          src="https://raw.githubusercontent.com/rain1024/mono-bazel/main/images/java.png"
          alt="Java Example"
          height="150"/>
        <br/>
        <a href="https://github.com/rain1024/mono-bazel/tree/java">Java Example</a>
    </td>
  </tr>
</table>

bazel build //projects/cpp_calculator:calculator_main
bazel run //projects/cpp_calculator:calculator_main

bazel test //projects/cpp_calculator:calculator_test

bazel build //projects/cpp_web:cpp_web
bazel run //projects/cpp_web:cpp_web