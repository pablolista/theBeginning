var weaponsVal = ["Classic", "Ghost", "Vandal", "Phantom"];
var weaponVal = weaponsVal.pop();//'.pop' REMOVE ultimo item do array
console.log(weaponVal);//dps de retirar armazenei nesssa variavel
console.log(weaponsVal);//imprime 'novo' array pós '.pop'

weaponsVal.push("Knife"); //empurra novo item a ultima posição
console.log(weaponsVal);

var x = weaponsVal.push("Shorty");//empurra novo e armazena length na var
console.log(x);//imprime tamanho do array pós inserção

weaponsVal.shift();//remove frist item do array, o [0], e att os outros
console.log(weaponsVal);//imprime 'novo' array pós '.shift'

weaponsVal.unshift("Sheriff");//insere novo no [0] e att os outros
console.log(weaponsVal);

delete weaponsVal[3];//deleta item do array mas nao att os outros (fica undefined)
console.log(weaponsVal)

weaponsVal.splice(3, 1, "Ares", "Operator");
//1º numero indica onde começa, 2º quantos elementos a frente serão deletados, o resto é o que vai ser adicionado a partir do indice dito no 1º numero e att o resto. IMPORTANTE . O item do 1º numero não é deletado se o 2º numero for "0". Nesse caso ele é empurrado para o próximo. [3] vira o item adicionado e o antigo é empurrado junto com resto da lista
console.log(weaponsVal);

weaponsVal.splice(4, 1);
console.log(weaponsVal);

var oldWeapons = ["classic", "spectre", "bulldog"];
var allWeapons = weaponsVal.concat(oldWeapons); //junta os arrays
console.log(allWeapons);

var weapons = allWeapons.slice(0, 5)//corta o array, que foi armazenado em outra variavel, ou seja, o original nao foi alterado
console.log(weapons)
console.log(allWeapons)