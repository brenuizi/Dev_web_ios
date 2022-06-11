window.document.body.style.backgroundColor = 'green'

let btns = document.querySelectorAll('.B_12');
for (i = 0; i < btns.length; i++) {
    btns[i].style.border = '2px solid #D9BC66';
    btns[i].style.padding = '.5rem';
    btns[i].style.backgroundColor = '#BFBFBF';
    btns[i].style.margin = '.7rem';
}

let btn1 = document.querySelector('#B_01');
let btn2 = document.querySelector('#B_02');
let btn3 = document.querySelector('#B_03');
let btnDelete = document.querySelector('#B_04');

let figure = document.createElement('figure')
let tab = document.createElement('div')
let msg = document.createElement('div')
let img = document.createElement('img')

document.body.appendChild(msg)
document.body.appendChild(tab)
document.body.appendChild(figure)
document.body.appendChild(img)


const inserir = () => {
    let serie = document.createElement('serie');
    img.src = 'TheUmbrellaAcademy.webp';
    img.appendChild(serie);
    img.style.maxWidth = '50%';
    img.style.margin = '0 auto';
    img.style.display = 'block';
    img.style.marginTop = '75px';
};
btn1.addEventListener('click', inserir);


const mensagem = () => {
    let usuario = prompt('Por favor, preencha seu nome:')
    let paragrafo = document.createElement('p')
    paragrafo.innerHTML = (`Olá ${usuario}, Bem-vindo a nossa academia.`);
    paragrafo.style.background = 'white'
    paragrafo.style.color = 'black'
    msg.appendChild(paragrafo)
    document.body.style.fontSize = '1.8rem'
};
btn2.addEventListener('click', mensagem);


const tabuada = () => {
    let mult = parseInt(prompt('Por favor, digite um número para multiplicação:'));
    if (isNaN(mult)) {
        alert('Insira um valor numérico')
        return;
    }
    else {
        for (i = 1; i <= 10; i++) {
            let conta = document.createElement('p')
            conta.style.fontSize = '1.3rem'
            conta.style.color = 'white'
            conta.innerHTML = (`${i} X ${mult} = ${i * mult} <br/>`);
            tab.appendChild(conta);
        }
    }
};
btn3.addEventListener('click', tabuada);

const resetar = () => {
    img.remove();
    msg.remove();
    tab.remove();
};
btnDelete.addEventListener('click', resetar);
