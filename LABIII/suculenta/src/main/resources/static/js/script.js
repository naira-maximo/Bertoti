document.addEventListener('DOMContentLoaded', function() {
    const button = document.querySelector('button');
    const tabela = document.getElementById('tabela');
    const formCadastro = document.getElementById('form-cadastro');

    // Função para carregar a tabela
    function carregarTabela() {
        fetch('http://localhost:8080/suculentas')
            .then(response => response.json())
            .then(data => {
                renderTabela(data);
            })
            .catch(error => {
                console.error('Erro ao buscar suculentas:', error);
            });
    }

    // Renderiza a tabela no HTML
    function renderTabela(dados) {
        const templateScript = document.getElementById('template').innerHTML;
        const template = Handlebars.compile(templateScript);
        const html = template({ dados: dados });
        tabela.innerHTML = html;
    }

    // Carrega a tabela quando o botão é clicado
    button.addEventListener('click', carregarTabela);

    // Evento de envio do formulário para cadastrar nova suculenta
    formCadastro.addEventListener('submit', function(event) {
        event.preventDefault();

        const nome = document.getElementById('nome').value;
        const familia = document.getElementById('familia').value;

        // Envia os dados via POST para o backend
        fetch('http://localhost:8080/suculentas', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ nome: nome, familia: familia })
        })
        .then(response => response.json())
        .then(() => {
            // Limpa os campos do formulário
            document.getElementById('nome').value = '';
            document.getElementById('familia').value = '';
            // Atualiza a tabela após o cadastro
            carregarTabela();
        })
        .catch(error => {
            console.error('Erro ao cadastrar suculenta:', error);
        });
    });

    // Carrega a tabela inicialmente
    carregarTabela();
});
