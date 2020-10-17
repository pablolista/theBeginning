var numeros = [2, 3, 5, 7];
var i = 7;

while(i < 1000){ //enquanto i for menor que 1000
    var num = numeros[i];
    i++;

    if (i % num === 0){ //divide por 2 e se resto 0 = true
        numeros.push(i)
        continue; /*quando a condicao do if é atendida volta a interacao
        do inicio*/
    }
    console.log(numeros);
}