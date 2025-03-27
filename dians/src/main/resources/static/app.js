document.getElementById('submitBtn').addEventListener('click', function() {
    const fileInput = document.getElementById('fileInput');
    const file = fileInput.files[0];

    if (!file) {
        alert("Мора да изберете датотека!");
        return;
    }

    const formData = new FormData();
    formData.append("file", file);

    fetch('/api/analyze', {
        method: 'POST',
        body: formData,
    })
        .then(response => response.json())
        .then(data => {
            const resultContainer = document.getElementById('analysisResult');
            resultContainer.innerHTML = `
            <p>Средна цена по акција:</p>
            <ul>
                ${data.map(result => `<li>${result.stockName}: ${result.avgPrice}</li>`).join('')}
            </ul>
        `;
        })
        .catch(error => {
            console.error('Грешка при испраќање на датотеката:', error);
        });
});
