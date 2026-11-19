```js
const input = document.getElementById('input');
let data = [];
input.addEventListener('change', (event) => {
  const file = event.target.files[0];
  if (!file) return;

  const reader = new FileReader();

  reader.onload = (e) => {
    const csvText = e.target.result;
    data = convertCSVtoArray(csvText);
  };

  reader.readAsText(file, 'UTF-8');
});

function convertCSVtoArray(str) {
  const rows = str.replace(/\r/g, '').split('\n');
  const parsed = [];

  for (const row of rows) {
    if (row.trim() === '') continue;
    parsed.push(row.split(','));
  }

  return parsed;
}
```
