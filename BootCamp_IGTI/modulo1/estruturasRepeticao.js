for (var i = 0; i < 10; i++) {
    //cria variavel i com valor 0, para i menor que 10, adiciona +1 em i
    console.log(i);
}

var weaponsVal = ["Classic", "Ghost", "Shorty", "Vandal", "Phantom"];
for (var i = 0; i < weaponsVal.length; i++){
    /*cria variavel i c valor 0, para i menor que quantidade de itens na
    lista, adiciona +1 em i*/
    console.log(weaponsVal[i]);
    /*imprime itens da lista conforme valor de i*/
}
for (var i = weaponsVal.length - 1; i >= 0; i--){
    console.log(weaponsVal[i]);
    //mesma coisa só que de trás pra frente
}

var i = 0; //cria variavel que while vai usar
while (i < weaponsVal.length) {
    //enquanto i for menor que numero de elementos na lista = true, funfa
    console.log(weaponsVal[i]); //imprime o item
    i++ //adiciona e repete ate a condicao de while for = false
}

var i = 0; //cria variavel que while vai usar
while (i < weaponsVal.length) {
    //enquanto i for menor que numero de elementos na lista = true, funfa
    console.log(weaponsVal[i]); //imprime o item
    if (weaponsVal[i] === "Shorty"){ //add condicao dentro do while
        console.log("found them"); //condicao foi atingida, imprime isso
        break; //quebra condicao do if e sai do while
    }
    i++ //adiciona e repete ate a condicao de while for = false
}

var numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
var i = 0;
while(i < numeros.length){
    var num = numeros[i];
    i++;

    if (num % 2 === 0){
        console.log(num + " é par");
        continue; /*quando a condicao do if é atendida volta a interacao
        do inicio*/
    }
    console.log(num + " é impar");
}

var j = 0;
do{ //vai rodar uma vez independente do que for
    j++; //adiciona +1 a variavel j
    console.log(j); //imprime 1
} while(j > 10); //enquanto j for menor que 10, volta pro 'do'

for (var wpn of weaponsVal) { //cria variavel wpn pra lista weaponsVal
    console.log(wpn); //imprime o conteudo da variavel
    //NAO CRIA INDICE DA LISTA, DIFERENTE DO OUTRO EXEMPLO COM FOR
}