//Método forEach com arrays
const frutas = ['Maca', 'Pera', 'Melancia'];
frutas.forEach(minhaFuncao);

    function minhaFuncao(index, item){
        console.log(`Indice: ${item}`);
        console.log(`Elemento: ${index}`);
    }

//Com Arrow Function
const frutas2 = ['Maca', 'Pera', 'Melancia'];
frutas2.forEach((index, item)=>{
    console.log(`Indice: ${item}`);
    console.log(`Elemento: ${index}`);
})

// .
const tarefas = [
    {
        id: 1,
        texto: "Aqui vai um texto",
    },
    {
        id: 2,
        texto: "Aqui vai dois textos",
    },
    {
        id: 3,
        texto: "Aqui vai três textos"
    }
];

// Metodo Map
const numeros = [16, 4, 9, 25];
const newArray = numeros.map(Math.sqrt);

console.log('Array antigo');
console.log(numeros);
console.log('Novo Array');
console.log(newArray);

//Outro exemplo de map
const mapText = tarefas.map((valor) =>{
    return valor.texto;
})

console.log(mapText);

//Metodo filter()
const idade = [32, 15, 8, 98, 70]

let filtroIdade = idade.filter((idades) => {
    return idades >= 18;
})

console.log(filtroIdade);

//Metodos find
const meuArray = [
    {Nome: 'Diego',idade: 12, altura: 120, sexo: 'masculino'},

    {Nome: 'Jissara',idade: 15, altura: 170, sexo: 'feminino'},
    
    {Nome: 'Jheniffer',idade: 70, altura: 180, sexo: 'feminino'}
]

console.log(
    meuArray.filter((genero) =>{
        return genero.sexo === 'feminino';
    })
);

//Crie um array de objetos com quatro objetos
//e cada objeto tera 4 propriedades 
//e retorne o nome de todos oa alunos 
//Retorne todos os alunos que tirou nota maior que 6
//Retorne o primeiro aluno que tirou nota menor que 5


