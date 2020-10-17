console.log("Um salve sendo executado em arquivo externo")

function clickBotao(){
    //DOM - Document Object Model
    document.getElementById("paralelogramo").innerHTML = "Texto alterado com sucesso. KATCHAW";
    document.getElementById("paralelogramo").style.color = "red";

    for(var i = 0; i < document.getElementsByClassName("y").length; i++){
        document.getElementsByClassName("y")[i].style.color = "purple"
        document.getElementsByClassName("y")[i].style.fontWeight = "bold"
        //os outros estavam mudand o código html, esse está indo adtras da classe do CSS
    }
}

function clickBotao2(){
    //DOM - Document Object Model
    document.getElementById("paralelogramo").style.display = "none";
}

function clickBotao3(){
    //DOM - Document Object Model
    document.getElementById("paralelogramo").style.display = "block";

    var botoes = document.getElementsByTagName("button");
        //esse está indo atras da TAG HTML de nome button. A TAG, não o TYPE
    var i = 0;
    while (i < botoes.length){
        botoes[i].style.fontSize = "30px";
        i++;
        //depois de clicar, vai aumentar o tamanho da fonte do botao
    }
}

function ligarLampada(){
    document.getElementById("lampada").src="C:/Users/BebePanda/Desktop/tumblr_ov6j2hAJz81qismuzo1_1280.png";
}

function desligarLampada(){
    document.getElementById("lampada").src="C:/Users/BebePanda/Desktop/maxresdefault.jpg";
}

var quantidadeElementos = 0;

function adicionarElemento(){
    var elemento = document.createElement("P");
    elemento.innerHTML = "elemento " + quantidadeElementos;

    quantidadeElementos++;

    document.getElementById("div-elementos").appendChild(elemento);
}

function removerElemento(){
    var filhos = document.getElementById("div-elementos").childNodes;
    var size = filhos.length

    for (var i = 0; i < size; i++){
        document.getElementById("div-elementos").removeChild(filhos[0]);
    }
}