var primeNum = [2, 3, 5];
var i = 7;

while (i <= 1000){
    var x = 0;
    x = primeNum[x];
    //console.log(x); //esta imprimindo certo ate aqui (2)
    if ((i < x) || (i % x !==0)){
        primeNum.push(i);
        i++;
        break;
    }else{
        x++;
        continue;
    }
}

console.log(primeNum)


//console.log(primeNum)
//imprime a lista

//console.log(primeNum[x])
//imprime 2

//x = primeNum.length;
//console.log(x);
//imprime 4

//x = primeNum[0]; x <= primeNum; x++
//console.log(x)
//imprime 3

/*
for (var i = 7; i < 1000; i++){
    if ((i % 2 !== 0) && (i % 3 !== 0) && (i % 5 !== 0) && (i % 7 !==0)){
        primeNum.push(i);
    }
}

console.log(primeNum);*/