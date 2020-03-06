# 筆記

## 陣列

### 新增固定空間並指定預設值

``` java
String[] array = new String[4];
Arrays.fill(row, "."); // [".", ".", ".", "."]
```

- [java.util.Arrays.fill(int[] a, int val)方法實例](http://tw.gitbook.net/java/util/arrays_fill_int.html)

## 註解文件

在 method 前面加上註解就可以。

範例：

``` java
/**
 * 某個方法
 * @param 一個參數
 * @return 一個回傳的字串
 */
String someMethod(String input) {
    return input
}
```
