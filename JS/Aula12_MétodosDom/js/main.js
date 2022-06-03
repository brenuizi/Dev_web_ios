// Método getElementById
// Pega elemento pelo id

let titulo = document.getElementById('titulo');

//alterando o conteúdo do HTML
titulo.innerHTML = 'Vai perder o PC galera do AWS';

//configurando o CSS do HTML 
titulo.style.textAlign = 'center';
titulo.style.backgroundColor = '#CCCCC9';
titulo.style.borderBottom = 'solid 3px #000';
titulo.style.margin = '20px';

//getElementsByClassName

let itens = document.getElementsByClassName('item');
console.log(itens);
console.log(itens[1]);
itens[1].textContent = 'Hello 2';
itens[1].style.fontWeight = 'bold';
itens[1].style.backgroundColor = 'yellow';

// Utiliza o FOR para percorrrer a lista
for(let i = 0; i < itens.length; i++){
    itens[i].style.backgroundColor = '#CCCCC9'
}

// Método getElementsByTagName
let li = document.getElementsByTagName('li');
console.log(li);
for(let i = 0; i < li.length; i+=2){
    li[i].style.backgroundColor = 'pink'
}

// Método getElementsByName
let nome = document.getElementsByName('fitem');

console.clear();
console.log(nome);
nome[0].textContent = 'Pose de quebrada';
nome[0].style.backgroundColor = 'yellow';
nome[1].textContent = 'RECEBAAAA';
nome[1].style.backgroundColor = 'yellow';

// Remover conteúdo
let item2 = document.getElementById('item2')
item2.remove();

//Inserir um valor
let lista = document.getElementById('itens');
let item1 = document.getElementById('item1');
lista.insertBefore(item2, item1.nextSibling);

// Alterarr estilo da lista
let ul = document.getElementById('itens');
ul.style.listStyle = 'none';

ul.style.listStyle = 'decimal inside';

// Dica do Dieguinho lifestyle para alterar apenas um pai especifico
let teste = document.getElementById('itens');
