//Trablhando com Strings
//Concatenar
let exemplo1 = 10;
let exemplo2 = 2;
let string1 = 'Aqui vai um texto';

console.log('O resultado da soma é: ' + exemplo1 + exemplo2);
console.log('O resultado da soma é: ' + (exemplo1 + exemplo2));
console.log(`O resultado da soma é: ${exemplo1 + exemplo2}`);
console.clear();
//Metodos de string

//Acessa uma string
let string2 = 'Aqui vai um texto';
console.log(string2.charAt([0]))
//Tamanho da string
let string3 = 'Aqui vai um texto';
console.log(string3.length);

//Maiúsculas e minúsculas
let string4 = 'AQUI VAI UM TEXTO';
console.log(string4.toLowerCase());
//console.log(string4.toUpperCase());

//Substring 
let string5 = 'Mozilla';
console.log(string5.substring(1,3));

//Split
let string6 = 'A raposa é um animal esperto';
let string7 = string6.split(' ');
console.log(string7[3]);

//Substituir uma string dentro da string
let string8 = 'Aqui vai um texto';
let string9 = string8.replace('Aqui', 'Kauan');
console.log(string9);

//Remover espaços da string
let string10 = '  Aqui vai um texto  ';
console.log(string10);
console.log(string10.trim());

//Métodos de buscar em strings
let string11 = 'Aqui vai um texto Aqui';
//String.indexOf():
console.log(string11.indexOf('Aqui'));
//String.lastIndexOf():
console.log(string11.lastIndexOf('Aqui'));
//String.search():
console.log(string11.search('Aqui'));
//String.startsWith():
console.log(string11.startsWith('A'));
console.log(string11.startsWith('Aqui'));
//String.endsWith():
console.log(string11.endsWith('.'));
console.log(string11.endsWith('i'));
console.log(string11.endsWith('I'));