

var atualData = new Date(); 
var dia = atualData.getDate();
var mes = atualData.getMonth(); 
var ano4 = atualData.getFullYear(); 
var str_data = dia + '/' + (mes + 1) + '/' + ano4;

let nome = document.getElementById('name');
let dataNasc = document.getElementById('dataNasc');
let email = document.getElementById('email');
let item = document.getElementById('item');

let form = document.getElementById('form');
function adduser(e) {
    e.preventDefault();
    if (!validarIdade()) {
        return;
    }
    if (!validandoEmail()) {
        return;
    }
    var li = document.createElement('li');
    li.innerText = `${nome.value}, ${nasc.value}, ${email.value}`; 
    li.style.textAlign = 'center'
    li.style.listStylePosition = 'inside'
    users.appendChild(li);
}

function validarIdade() {
    var nascimento = new Date(nasc.value);

    let idade = atualData.getFullYear() - nascimento.getFullYear();
    if (atualData.getMonth() < nascimento.getMonth()) {
        idade--;
    } else if (
        atualData.getMonth() == nascimento.getMonth() &&
        atualData.getDate() < nascimento.getDate() + 1
    ) {
        idade--;
    }

    if (idade < 18) {
        alert(`Somente +18`);
        return false;
    }
    return true;
}

function validandoEmail() {
    let padrao = new RegExp(/.*@.*\..*/i);
    padrao.test(email.value);
    if (padrao.test(email.value)) {
        return true;
    }
    alert(`Email inválido`);
    return false;
}

function excluirItem() {
    var usuarios = users.getElementsByTagName('li');
    var valor = parseInt(item.value);
    var li = usuarios[valor];
    li.remove();
    console.log(li);
}

form.addEventListener('submit', adduser);

const delBtn = document.getElementById('excluir'); 
delBtn.addEventListener('click', excluirItem);