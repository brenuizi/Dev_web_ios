function alertCookie() {
    alert('Você quer um cookie?')
    console.log('Você quer um cookie?')
}

const alertSucesso = () =>{
    alert('Mensagem gerada com sucesso')
    console.log('Mensagem gerada com sucesso')
}

//Exercício 2
const notebook = {
    marca: 'Dell',
    color: 'preto',
    modelo: 'inspiron',
    valor: '3500k',
    processador: 'I5'
};

console.log(notebook);

//Exercício 3
function diasAnos (dias = 365, anos = 2) {
    return 365 * 2;
};

console.log(diasAnos());
