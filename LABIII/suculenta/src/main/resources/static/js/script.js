document.addEventListener('DOMContentLoaded', function() {
    const button = document.querySelector('button');
    const tabela = document.getElementById('tabela');

    button.addEventListener('click', function() {
        fetch('http://localhost:8080/suculentas')
            .then(response => response.json())
            .then(data => {
                renderTabela(data);
            })
            .catch(error => {
                console.error('Erro ao buscar suculentas:', error);
            });
    });

    function renderTabela(dados) {
        const templateScript = document.getElementById('template').innerHTML;
        const template = Handlebars.compile(templateScript);
        const html = template({ dados: dados });
        tabela.innerHTML = html;
    }
});