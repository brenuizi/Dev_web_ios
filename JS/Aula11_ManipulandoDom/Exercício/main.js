console.log(window);
window.alert("Seja bem vindo(a)!)");
document.title = 'Exercício DOMP1';

let section = document.createElement('section');
document.body.appendChild(section);

let title = document.createElement('h1')
title.innerText = 'Tenha um grandioso dia!'
section.appendChild(title);

let paragrafo = document.createElement('p')
paragrafo.innerText = 'E para todos os outros dias também'
section.appendChild(paragrafo);

let article = document.createElement('article');
document.body.appendChild(article);

let escrita = document.createElement('h1')
escrita.innerText = 'Frase motivacional'
article.appendChild(escrita);

let text = document.createElement('p')
text.innerText = 'As pessoas costumam dizer que a motivação não dura sempre. Bem, nem o efeito do banho, por isso recomenda-se diariamente.'
article.appendChild(text);