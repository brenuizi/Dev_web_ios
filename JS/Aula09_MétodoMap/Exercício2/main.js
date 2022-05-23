const alunos = [
    { Nome: 'Ana',
    Idade: 17,
    Nota:8,
    Ano: '2ºB'
    },

    { Nome: 'Bruno',
    Idade: 16,
    Nota: 6,
    Ano: '2ºC'
    },

    { Nome: 'Veronica',
    Idade: 16,
    Nota:6,
    Ano: '2ºC'
    },

    { Nome: 'Marta',
    Idade: 15,
    Nota: 5,
    Ano: '3ºC'
    },

    { Nome: 'Brenno',
    Idade: 19,
    Nota:6,
    Ano: '3ºC'
    },

    { Nome: 'Maria',
    Idade: 14,
    Nota:4,
    Ano: '1ºF'
    },
]
for(i=0;i<alunos.length;i++){
    console.log(alunos[i].Nome)
    console.log(alunos[i].Ano)
}
const ano = alunos.filter((alunos)=>{
    if(alunos.Ano== '2ºC'||alunos.Ano== '2ºB') console.log(alunos)
})

const media = (alunos[0].Nota+alunos[1].Nota+alunos[2].Nota+alunos[3].Nota+alunos[4].Nota+alunos[5].Nota) /6
if(media>=7) console.log(`Alunos foram aprovados com a media ${media}`)
else if(media<=7) console.log(`Alunos foram reprovados com a media ${media}`)