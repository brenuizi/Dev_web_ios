class Pessoa {
    constructor(nome, nasc) {
        this.nome = nome;
        this.nasc = new Date(nasc);
    }
    getIdade(date) {
        let idade = date.getFullYear() - this.nasc.getFullYear();
        if (date.getMonth() < this.nasc.getMonth()) idade--;
        else if (
            date.getMonth() == this.nasc.getMonth() &&
            date.getDate() < this.nasc.getDate
        )
            idade--;
        return idade;
    }
    getName() {
        return this.nome;
    }
}
let nd = new Date();
let pessoas = new Array(10);
pessoas[0] = new Pessoa('Rafaela', '2000-02-01');
pessoas[1] = new Pessoa('Hendrik', '2000-08-17');
pessoas[2] = new Pessoa('Breno', '2001-09-12');
pessoas[3] = new Pessoa('Victória', '2001-11-19');
pessoas[4] = new Pessoa('Jacob', '1998-06-30');
pessoas[5] = new Pessoa('Manu', '2001-02-01');
pessoas[6] = new Pessoa('Maycon', '2000-11-12');
pessoas[7] = new Pessoa('Murilo', '2002-03-17');
pessoas[8] = new Pessoa('Daniely', '1997-09-14');
pessoas[9] = new Pessoa('Pedro', '2002-06-14');

Pessoa.prototype.getNiver = function (date) {
    let n = 0;
    if (date.getMonth() < this.nasc.getMonth()) ++n;
    else if (
        date.getMonth() == this.nasc.getMonth() &&
        date.getDate() < this.nasc.getDate
    )
        ++n;
    return n == 0;
};
console.log(pessoas[0].getNiver(nd));
for (i = 0; i < pessoas.length; i++) {
    if (pessoas[i].getNiver(nd) === false)
        console.log(
            `${pessoas[i].getName()} tem ${pessoas[i].getIdade(
                nd
            )} anos e não fez aniversário esse ano`
        );
    else if (pessoas[i].getNiver(nd) === true)
         console.log(
        `${pessoas[i].getName()} tem ${pessoas[i].getIdade(
            nd
        )} anos e já fez aniversário esse ano`
         );
}