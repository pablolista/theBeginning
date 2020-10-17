var pessoa = {
    "nome": "Pablo", //em objetos Json, adicionar "" na variavel é opcional
    idadade: 25,
    telefone: "(22) 999999999",
    temCarro: true,
    animaisDeEstimacao:[
        'bacalhus',
        'danilo'
    ],
    pai: { //outro objeto criado dentro de um objeto
        nome: "Jose",
        idade: 38
    }
}

console.log(pessoa); //imprime tudo, ja q pessoa é var original
console.log(pessoa.nome); //imprime so nome da pessoa
console.log(pessoa.pai.nome); //imprime nome do pai da pessoa
//O '.' funciona como ponto de acesso
pessoa.animaisDeEstimacao.push("Juca");//insere mais um item nesse array
pessoa.nome += " Silva";//modify ".name" in person adding Silva
console.log(pessoa);//imprime tudo pós mudanças

/*OBJETOS TAMBEM PODEM SER PARAMETROS DE FUNCAO*/

/*
pessoa.mae = "Maria"; //cria dentro do objeto pessoa a var mae com "maria"
console.log(pessoa)
*/

pessoa.mae ={ //cria dentro do objeto pessoa a var mae
    nome: "Maria", //dentro da var mae, a var nome com Maria
    idade: 37 //debtri da var mae a var idade
};

JSON.stringify(pessoa);//transforma o objeto em string
console.log(JSON.stringify(pessoa));//transforma o objeto em string e imprime

JSON.parse();//recebe uma string e transforma em objeto JSON