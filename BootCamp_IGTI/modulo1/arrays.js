var weaponsVal = ["Classic", "Ghost", "Vandal", "Phantom"];
console.log(weaponsVal);

var armaUm = weaponsVal[0];
var armaDois = weaponsVal[1];
var armaTres = weaponsVal[2];

console.log("primeira posicao: " + armaUm);
console.log("segunda posicao: " + armaDois);
console.log("terceira posicao: " + armaTres);

weaponsVal[2] = "Shorty";
/*mesmo mudando o item da lista, como var armaTres
ja foi definida como Vandal, ela nao muda*/

console.log("tamanho da lista: " + weaponsVal.length);
console.log("ultimo item: " + weaponsVal[weaponsVal.length - 1]);

/*adicionando itens ao final da lista*/
weaponsVal[weaponsVal.length] = "Odin";
console.log(weaponsVal);
/*sabendo quantos elementos existem,, e possivel adicionar pelo numero
ao inves da length*/


weaponsVal[8] = "Ares";
console.log(weaponsVal);
/*indicar numero maior que o ultimo item, anteriores sao criados
como empty item*/

weaponsVal.push("Knife"); //empurra novo item a ultima posição
console.log(weaponsVal);