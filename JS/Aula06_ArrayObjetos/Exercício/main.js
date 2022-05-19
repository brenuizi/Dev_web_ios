const alunos = [
    {
    nome: 'Breno',
    idade: 20,
    endereço: ['Rua da alegria, 66'],
    notas: [10, 8, 7, 9],
    materia: 'Biologia',
    turma: 'C',
    cidade: 'São Paulo',
    professor: 'Bruno',    
    },

    {nome: 'Victória',
    idade: 15,
    endereço: ['Rua da infelicidade, 10'],
    notas: [4, 6, 5, 4],
    materia: 'Programação',
    turma: 'ADS',
    cidade: 'São Paulo',
    professor: 'Bruno', 
},

{
    nome: 'Bruno',
    idade: 21,
    endereço: ['Rua da Persistência, 25'],
    notas: [8, 10, 9, 10],
    materia: 'Programação',
    turma: 'ADS',
    cidade: 'São Paulo',
    professor: 'Rafael', 
}

];

let media = (alunos[0].notas[0] + alunos[0].notas[1] + alunos[0].notas[2] + alunos[0].notas[3] ) /4
console.log(media);

let media1 = (alunos[1].notas[0] + alunos[1].notas[1] + alunos[1].notas[2] + alunos[1].notas[3] ) /4
console.log(media1);

let media2 = (alunos[2].notas[0] + alunos[2].notas[1] + alunos[2].notas[2] + alunos[2].notas[3] ) /4
console.log(media2);

console.log(`Aluno ${alunos[0].nome}, obteve as notas ${alunos[0].notas} e reside em ${alunos[0].endereço}, sua média foi de ${media} portanto foi aprovado `)

console.log(`Aluno ${alunos[1].nome}, obteve as notas ${alunos[1].notas} e reside em ${alunos[1].endereço}, sua média foi de ${media1}, portanto foi reprovada `)

console.log(`Aluno ${alunos[2].nome}, obteve as notas ${alunos[2].notas} e reside em ${alunos[2].endereço}, sua média foi de ${media2}, portando foi aprovado `)
