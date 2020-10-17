/*
1) Função que retorna o nome do funcionário que tem o maior salário da empresa.
2) Função que retorna o nome do funcionário que tem o menor salário da empresa.
3) Função que retorna a média salarial da empresa.
4) Função que recebe um setor como parâmetro e retorna o funcionário de maior salário do setor informado.
5) Função que recebe um setor como parâmetro e retorna o funcionário de menor salário do setor informado.
6) Função que recebe um setor como parâmetro e retorna a média salarial do setor informado.
*/
var fs = require("fs");
var funcionarios = null;


fs.readFile("funcionarios.json", "utf-8", function(err, data){
    if (err){
        console.log(err);
    } else{
        funcionarios = JSON.parse(data).funcionarios;
        console.log("O maior salario é da " + maiorSalario());
        console.log("O menor salario é do " + menorSalario());
        console.log("A média salarial é de " + mediaSalario());
        console.log("O maior salario da Administração é " + maiorSalario("Administrativo"));
        console.log("O maior salario da Produção é " + maiorSalario("Produção"));
        console.log("O maior salario do Comercial é " + maiorSalario("Comercial"));
        console.log("O menor salario da Administração é " + menorSalario("Administrativo"));
        console.log("O menor salario da Produção é " + menorSalario("Produção"));
        console.log("O menor salario do Comercial é " + menorSalario("Comercial"));
        console.log("A média salarial da Administração é " + mediaSalarioSetores("Administrativo"));
        console.log("A média salarial da Produção é " + mediaSalarioSetores("Produção"));
        console.log("A média salarial do Comercial é " + mediaSalarioSetores("Comercial"));
    }
});

//Primeira resposta
function maiorSalario(setor) {//O parametro independe da função. aqui a função não sabe o que é setor até que eu diga pra ela usar no readfile, que ta ali em cima.
//                              Ai ela vai jogar esses parametos em cima daqueles dados
    var funcMaiorSalario = null;
    for (var i = 0; i < funcionarios.length; i++) {
        if (setor && (funcionarios[i].setor !== setor)){
            continue;
        }
        if (funcMaiorSalario === null){
            funcMaiorSalario = funcionarios[i];
            continue;
        }
        if (funcionarios[i].salario > funcMaiorSalario.salario) {
            funcMaiorSalario = funcionarios[i];
        }
    }
    return funcMaiorSalario.nome;
}

//Segunda resposta
function menorSalario(setor) {
    var funcMenorSalario = null;
    for (var i = 0; i < funcionarios.length; i++) {
        if (setor && (funcionarios[i].setor !== setor)){
            continue;
        }
        if (funcMenorSalario === null){
            funcMenorSalario = funcionarios[i];
            continue;
        }
        if (funcionarios[i].salario < funcMenorSalario.salario) {
            funcMenorSalario = funcionarios[i];
        }
    }
    return funcMenorSalario.nome;
}

//Terceira resposta
function mediaSalario() {
    var salarioMedia = 0
    var x = 0
    for (var i = 0; i < funcionarios.length; i++){
        x += funcionarios[i].salario;
        salarioMedia = x / funcionarios.length
    }
    return salarioMedia;
}

function mediaSalarioSetores(setor) {
    var salarioMediaSetores = 0
    var x = 0
    var y = 0
    for (var i = 0; i < funcionarios.length; i++){
        if (setor && (funcionarios[i].setor !== setor)){
            continue
        }if (setor && (funcionarios[i].setor == setor)){
            x += funcionarios[i].salario;
            if (x++){
                y++
            }
        }
        salarioMediaSetores = x / y
    }
    return salarioMediaSetores;
}