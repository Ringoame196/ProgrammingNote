## サーバーにリクエスト
```js
fetch('https://localhost');
```

## エラーハンドリング
```js
fetch('https://localhost').catch((error) => {
  console.error('エラーが発生しました:', error);
});
```
