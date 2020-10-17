var fs = require("fs");
var nomeArquivo = "Valorant.json";
var weaponsVal = ["Classic", "Ghost", "Vandal", "Phantom"];
var jogos ={
    nome: "Valorant",
    weaponsVal//como qro criar propriedade com o msm nome da variavel (weaponsVal contendo weaponsVal), não preciso colocar weaponsVal: weaponsVal, mas se nome fosse outro precisava
};

/*
fs.writeFile(nomeArquivo, jogos, function(err){
    if(err){
        console.log(err);
    }
});
adicionar desse jeito vai criar o arquivo, mas dentro dele vai estar "objet object" tem que usar o Json.stringify (ver em objetoJson.js)
*/

fs.writeFile(nomeArquivo, JSON.stringify(jogos), function(err){
    if(err){
        console.log(err);
    } else{
        fs.readFile(nomeArquivo, "utf-8", function(err, data){
            if(err){
                console.log(err);
            } else{
                var obj = JSON.parse(data);
                /*Como foi transformado em string, pra poder adcionar alguma coisa nas variaveis tem que transformar de volta em objeto Json e é isso que to fazendo aqui*/
                obj.weaponsVal.push("Shorty");
                /*Agora to acionando a variavel onde armazenei o objeto Json e to chamando o array do weaponsVal pra adicionar o item*/
                fs.writeFile(nomeArquivo, JSON.stringify(obj), function(err){
                    //aqui to transformando de novo em arquivo, usando o msm nome do inicio e transformando de volta pra string o obj (variavel que criei pra armazenar o objeto e adicionar o item)
                    if(err){
                        console.log(err);
                    }
                })
            }
        })
    }
});