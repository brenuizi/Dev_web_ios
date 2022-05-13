// Laço while do Matheus
/*let profHelo = 1;

while(profHelo <=5){
    console.log("bate palma");
    // profHelo = profHelo + 1
    profHelo++ //Sempre existir um incremento ou decremento
}*/

//Exibir o valor de 1 até 10
let contador = 1;

while (contador <= 10) {
    console.log(`O valor do contador é? ${contador}`);
    contador++
}

/*do {
    console.log('bater palma');
    console.log(profHelo);
    profHelo++;
} while (profHelo <= 5);*/

//Decremento
let contador2 = 10;
while (contador2 >= 0) {
    console.log(`O valor do contador é? ${contador2}`);
    contador2--
}

//Laço For
for(let profHelo = 1; profHelo <= 5; profHelo++){
    console.log("Olá jackass");
}

for(let counter = 10; counter >=0; counter--){
    console.log(`O valor do contador é? ${counter}`);
}

//Laços de repetição e array
const frutas = ['maca', 'laranja', 'pera', 10];

for(let j = 0; j < frutas.length; j++){
    console.log(`Nome: ${frutas[j]}`)
}

//crie um array chamado carros com 8 carros e percorra o array de 2 em 2 exibindo os carros no array

const carros = ['Gol', 'Saveiro', 'Fiat Uno', 'Honda Civic', 'Corolla', 'Golf', 'Hilux', 'Fiorino']

for(let C = 0; C < carros.length; C+=2){
    console.log(`Carro: ${carros[C]}`)
}

