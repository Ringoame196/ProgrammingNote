# 基本
``sql
  SELECT SUM(カラム名) FROM テーブル名;
``

# SQLメモ：ジャンルごとの在庫数合計を取得する

## 📘目的
`Items` テーブルから **ジャンルごとの在庫数合計** を集計するSQLを記録。

---

## ✅ 基本形

```sql
SELECT genre, SUM(stock_count)
FROM Items
GROUP BY genre;
```
