const names = ['Joaquim', 'José', 'Silva', 'Xavier'];

const names1 = ['Joaquim', 'José', 'Silva', 'Xavier'];
let one = names1.unshift('Amanda'); // one = 5

console.log(names1);
console.log(one);

console.clear();
const names2 = ['Amanda', 'Joaquim', 'José', 'Silva', 'Xavier'];
let two = names2.pop('Xavier');

console.log(names2);
console.log(two);

console.clear();
const names3 = ['Amanda', 'Joaquim', 'José', 'Silva'];
let three = names3.push('Zuleica');

console.log(names3);
console.log(three);

console.clear
const names4 = ['Amanda', 'Joaquim', 'José', 'Silva','Zuleica'];
let four = names4.shift('Amanda');

console.log(names4);
console.log(four);

console.clear
const names5 = ['Joaquim', 'José', 'Silva', 'Zuleica'];
names5 [2] = 'Silvana';

console.log(names5);

//Exercício 2

const series = ['Anne with an E', 'American horror story', 'Pretty litte liars', 'Emily in Paris', 'Stranger Things'];

console.log(series);

const series1 = ['Anne with an E', 'American horror story', 'Pretty litte liars', 'Stranger Things', 'Emily in Paris'];
series1.splice(4);

console.log(series1);

const series2 = ['Anne with an E', 'American horror story', 'Pretty litte liars', 'Stranger Things'];
let dois = series2.push('Alice in borderland');

console.log(series2);

const series3 =  ['Anne with an E', 'American horror story', 'Pretty litte liars', 'Stranger Things', 'Alice in borderland'];
let tres = series3.pop('Alice in borderland');

console.log(series3);

const series4 = ['Anne with an E', 'American horror story', 'Pretty litte liars', 'Stranger Things'];
const favs = series4.slice(1);

console.log(`Top 3, séries fav:, ${series4,[favs]}`);




