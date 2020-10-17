var a = 10;
var b = 5;
if (a > b) {
    console.log("a maior do que b");
} else if (b < a) {
    console.log("b maior do que a");
} else {
    console.log("a e b sao iguais");
}

var c = 30;
var d = "30";
if (c == d) {
    console.log("c é igual a d"); //converte d em int e compara
} else if (c === d) {
    console.log("c é igual a d"); //verifica tbm se o tipo é igual
} else if (c != d) {
    console.log("c é diferente de d"); //converte d em int e compara
} else if (c !== d) {
    console.log("c é diferente de d"); //verifica tbm se o tipo é diff
}

var e = 4;
var f = 3;
var g = 5;
var h = 7;
if ((e > f) && (g > h)) { //if both are true
    console.log ("e é maior que f E g é maior que h");
}
if (( e === f) || (g === h)) { //if one of them are true
    console.log("um dos dois era verdadeiro")
}

if (!(1>2)){ //vai executar se for falso (!)
    console.log("um nao é maior que 2")
}


var fruta = "";
var valor = 0;

switch (fruta) { //vai checar var fruta
    case "banana": //se for banana
        valor = 2; //substitui var valor por esse
        break; // se nao usar break ele sai executando tudo sem checar
    case "maca": //se for maca
        valor = 3; //substitui var valor por esse
        break;
    case "abacaxi":
        valor = 4;
        break;
    case "melao":
        valor = 5;
        break;
    case "mamao":
        valor = 5.50;
        break;
    default: //se nao for nenhuma cai aqui
        valor = 10; //substitui var valor por esse
}
console.log ("valor: " + valor);


var x = 1;
var y = 2;
var resultado = "";

resultado = x > y ? "x maior que y" : "senao"; //operador ternario
//funciona como 'if' do excel (:) é o separador
console.log(resultado);