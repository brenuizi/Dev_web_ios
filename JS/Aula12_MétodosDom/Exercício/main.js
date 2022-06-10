let botao = document.getElementsByClassName('B_12');
let b1 = document.getElementById('B_01');
let b2 = document.getElementById('B_02');
let b3 = document.getElementById('B_03');
for (i = 0; i < botao.length; i++) {
    botao[i].style.border = 'solid 2px #D9BC66';
    botao[i].style.padding = '.5rem';
    botao[i].style.backgroundColor = '#BFBFBF';
    botao[i].style.margin = '.7rem';
}
const inserir = () => {
    let serie = document.createElement('serie');
    document.body.appendChild(serie);

    let img = document.createElement('img');
    img.src = 'umbrella.webp';
    serie.appendChild(img);
    document.body.style.backgroundColor = '#262525';
    img.style.maxWidth = '50%';
    img.style.margin = '0 auto';
    img.style.display = 'block';
    img.style.marginTop = '75px';
}
b1.addEventListener('click', inserir );