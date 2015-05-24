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

毎回javacしてjavapを実行するのはつらいので、スクリプトを作りました。以下注意事項です。

* Scalaについては$のついていないクラスファイルを逆アセンブルするとUTF-7ベースで逆アセンブルされるのでこれについては意図的に逆アセンブルしていません。
* TraitとかInterfaceとか複数のクラスファイルを出力するプログラムには対応していません。

```
./sdisasm HelloWorld.scala
```


```
./jdisasm HelloWorld.java
```
