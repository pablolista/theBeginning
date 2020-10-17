/*
    Criar um jogo no qual o jogador tenha que advinhar um número.
    O jogo deve gerar um número aleatório entre 1 e 100 e depois desafiar o jogador a descobrir qual o número em no máximo 10 tentativas.
    A cada tentativa, caso o jogador não tenha acertado o número, o jogo deve informar se o número informado é maior ou menor que o sroteado.
    O jogo termina se o jogador acertar o número ou acabarem o nnúmero de tentativas.

    1) Gerar um número aleatório entre 1 e 100
    2) Inicializar o número de tentativas como 10
    3) Pedir o jogador pra tentar advinhar o número
    4) Decrementar o número de tentativas
    5) Verificar se a tentativa está correta
    6) Se estiver certo:
        -Informar que acertou
        -Encerar o jogo
    7) Se estiver errado e acabou tentativa:
        -Avisa que perdeu
        -Encerra
    8) Se tiver errada e ainda tiver tentativa:
        -Informa se é maior ou menor que o número sorteado
        -Pedir outra tentativa
*/
var readline = require("readline");//puxando require readline da biblioteca do node.js
var rl = readline.createInterface({//esse vai pedir por um input no terminal
    input: process.stdin,
    output: process.stdout
});

var numeroAleatorio = Math.round(Math.random() * 100);//math.random cria um numero de 0 a 1, entao pra ser utilizavel aqui, multiplicamos por 100 e arrendodamos pra um inteiro, se nao ia gerar muitas casas decimais
if (numeroAleatorio === 0){
    numeroAleatorio = 1;
}

var numeroTentativas = 10;

pergunta();//chama a funcao que esta logo ali em baixo

function pergunta(){//transforma tudo isso pra baixo em uma funcao
    rl.question("Hit me with your best shot: ", function(numero){
        //question vai esperar o user dar "uma resposta a pergunta" e essa vai a interface que foi criada la na variavel rl, que vai retornar uma funcao que chamamos de numero e acabamos de criar
        numero = parseInt(numero);//o input estava sendo dado como string, o que entrava em conflito com === porq o tipo do numeroaleatorio é integer, entao necessario converter. como saber o tipo das entradas? da um console.log(typeof(~oque qr descobrir aqui~))
        numeroTentativas--;
        if(numero === numeroAleatorio){
            console.log("Acerto, mizeravi");
            rl.close();//finaliza o rl.question
        } else if (numeroTentativas === 0){
            console.log("You lose!");
            rl.close();
        } else if (numero > numeroAleatorio){
            console.log("Menos. Você ainda tem " + numeroTentativas + " tentativas");
            pergunta();//chama novamente a funcao para efeito de repeticao da pergunta, vai assim ate ativar um dos rl.close
        }  else {
            console.log("Mais. Você ainda tem " + numeroTentativas + " tentativas");
            pergunta();//chama novamente a funcao para efeito de repeticao da pergunta, vai assim ate ativar um dos rl.close
        }
    })
}