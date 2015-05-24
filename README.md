# なにこれ？

Scalaのクラスファイルを逆アセンブルしたり逆コンパイルしたりしてScalaとJVMの関係を明らかにしてみようというオレオレリポジトリ

# クラスファイルの逆アセンブル結果を確認したいんだけど
## 基本形

Scalaの基本はこちらです。

```
scalac HelloWorld.scala
javap -p -v -c  HelloWorld$
```

ScalaはJVM言語なので、Javaと同じようにjavapでクラスファイルを逆アセンブルできます。

Javaの基本はこちらです。

```
javac HelloWorld.java
javap -p -v -c  HelloWorld
```

## スクリプトで実行

毎回javacしてjavapを実行するのはつらいので、スクリプトを作りました。

```
./sdisasm HelloWorld.scala
```


```
./jdisasm HelloWorld.java
```
