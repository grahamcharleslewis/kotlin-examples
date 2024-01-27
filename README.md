# Kotlin Examples

## Install Kotlin (and Java)

Easiest way to to use `asdf`...

```shell
asdf plugin add java
asdf install java openjdk-21.0.2
asdf global java openjdk-21.0.2

asdf plugin add kotlin
asdf install kotlin 1.9.22
asdf global kotlin 1.9.22
```

## Compile

```shell
kotlinc main.kt -include-runtime -d hello.jar
```

## Run

```shell
java -jar hello.jar
```

## REPL

```shell
kotlinc-jvm
```

## VSCode Extensions

* https://marketplace.visualstudio.com/items?itemName=mathiasfrohlich.Kotlin
* https://marketplace.visualstudio.com/items?itemName=ms-vscode.anycode-kotlin
* https://marketplace.visualstudio.com/items?itemName=HarryHopkinson.vs-code-runner
* https://marketplace.visualstudio.com/items?itemName=Dannark.AndroidLauncher