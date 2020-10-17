function multiplicacao(p1, p2){
    console.log("funtion multiplicacao executada");
    return p1*p2;
}

multiplicacao(4, 3); //imprime so a linha dois, pois resultado nao esta
//nos parametros da impressao

var resultado = multiplicacao(4, 3);
console.log(resultado); //imprime linha 2 e o resultado da multiplicacao
//que foi armazenada na variavel resultado

console.log(multiplicacao(4, 3)); //imprime linha 2 e o resultado da
//multiplicacao, pois funcao foi executada dentro de console.log


function saudacao(nome){
    console.log("Olá" + nome + " seja bem vindo!");
    //cria funcao saudacao que vai "funcionar" guardando parametro da var
    //nome. quando 'nome' for designado, console.log vai imprimir com
    //a entrada
}

saudacao("Pablo"); //da os parametros pra variavel nome e como console.log
//ja foi chamado na funcao, a impressao já é feita sem precisar ser
//chamada de novo

function funcaoSemParametro(){ //uma funcao nao necessariamente precisa
    //de um parametro
    var a = 1;
    var b = 2;
    console.log(a + b); //imprime resultado dessa soma
}//variaveis criadas dentro de funcoes so tem vida dentro da mesma

/*OBJETOS TBM PODEM SER PARAMETROS DE FUNCOES*/