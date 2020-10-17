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