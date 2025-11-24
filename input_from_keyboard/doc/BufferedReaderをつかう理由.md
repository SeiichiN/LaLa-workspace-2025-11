<style>
.my-text {
background-color: #f5f5f5;
padding: 10px;
margin-left: 30%;
}
</style>

<div class="my-text">
キーボードから入力された文字を受け取るには、Scannerクラスを使うやり方と
BufferedReaderクラスとInputStreamReaderクラスを組み合わせて使うやり方とがありますが、その違いと、どちらを使うべきか、教えてください。
</div>

---

キーボード入力（標準入力）を受け取るには、大きく分けて次の2つの方法があります。

**① `Scanner` を使う方法**
**② `BufferedReader + InputStreamReader` を使う方法**

それぞれの違いと、どちらを使うべきかをわかりやすく説明します。

---

# ■ 1. Scanner を使う方法

### ● 特徴

* **入力をトークン（単語）ごとに読み取るのが得意**
* 空白や改行で区切られた入力を簡単に扱える
* `nextInt()`, `nextDouble()`, `nextLine()` など便利メソッドが豊富
* **入力のパース（解析）に強い**

### ● サンプル

```java
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
String line = sc.nextLine();
```

### ● メリット

* **簡単・直感的に使える**
* 数値・単語・行など、多様な形式を簡単に取得できる
* Java初心者に優しい

### ● デメリット

* **入力バッファの扱いがやや複雑（特に nextInt() と nextLine() の混在）**
* **速度が遅め（オーバーヘッドが大きい）**
* スレッドセーフでない（通常は問題にならない）

---

# ■ 2. BufferedReader + InputStreamReader を使う方法

### ● 特徴

* **行単位で高速に入力を得られる**
* 読み取れるのは "文字列（String）" のみ
* 数値なら自分で `Integer.parseInt()` を使う必要

### ● サンプル

```java
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String line = br.readLine();
```

### ● メリット

* **非常に高速**
* コマンドライン入力を大量に読む競技プログラミングなどでよく使われる
* バッファリングが効いて効率的

### ● デメリット

* 数値や単語を得るには手動パースが必要

  ```java
  int n = Integer.parseInt(br.readLine());
  ```
* `IOException` の処理が必要
* 初心者には少し扱いづらい

---

# ■ 3. 結局どっちを使うべき？

### ▼ 初心者向け・普通のプログラム

➡ **Scanner** を使うのが良い

理由：

* 圧倒的に使いやすい
* 数値・文字・行などを簡単に取得可能
* 小規模～中規模プログラムなら速度差は気にしなくて良い

---

### ▼ 高速処理が必要（大量入力）

➡ **BufferedReader + InputStreamReader**

以下の状況で特に有利：

* 競技プログラミング
* 大きいファイルを読み取る
* ループで膨大な行を読み続ける

---

# ■ 4. 迷った場合の基準

| 条件              | 使うべきもの         |
| --------------- | -------------- |
| とにかく簡単に扱いたい     | Scanner        |
| 数値や単語を簡単に取りたい   | Scanner        |
| 高速性が重要          | BufferedReader |
| 大量データを行単位で読む    | BufferedReader |
| ちょっとしたコンソール入力だけ | Scanner        |

---

# ■ 5. 総合結論

* **初心者・一般用途 → `Scanner`**
* **高速処理したい → `BufferedReader + InputStreamReader`**

ゲーム制作などの普通のコンソール入力程度なら、**Scannerの利便性のほうが勝ちます。**

---

必要であれば：

* ScannerとBufferedReaderの速度比較
* nextLine() と nextInt() が衝突する理由
* どちらの方式がゲームに向いているか

なども詳しく説明します。



;; 修正時刻: Mon 2025/11/24 06:27:50
