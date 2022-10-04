let v = ["Venezuela", "Vaticano"];
let o = ["Omã"];
let l = ["Londres"];
let t = ["Turquia"];
let a = ["Alemanha"];
let posicoes = ['V', 'O', 'L', 'T', 'A'];
let acertos = 0;
let erros = 0;

function load() {
    let msg = document.getElementById("answer").value;
    if (msg == "") {
        setColor("yellow");
        document.getElementById("aviso").innerHTML = `Digite algum Lugar!`;
    }
    msg = msg.toLowerCase();
    msg = msg[0].toUpperCase() + msg.substring(1);
    document.getElementById("answer").value = "";
    console.log(msg);
    if (msg.charAt(0) == posicoes[acertos]) {
        erros = 0;
        document.getElementById("aviso").innerHTML = `Você pode viajar para ${msg}!`;

        if (!getLista().includes(msg)) {
            getLista().push(msg);
            console.log(getLista());
        }
        setColor("green");
        acertos++;

    } else {
        setColor("red");
        document.getElementById("aviso").innerHTML = `Você não pode viajar para ${msg}!`;
        erros++;

        if (erros == 3) {
            setColor("purple");
            document.getElementById("aviso").innerHTML ="Dica: Você pode ir para " + getLista()[0];
            erros = 0;
        }
    }
    if (acertos == 5) {
        acertos = 0;
    }
}
function getLista() {
    switch (acertos) {
        case 0:
            return v;

        case 1:
            return o;

        case 2:
            return l;

        case 3:
            return t;

        case 4:
            return a;

    }
}

function setColor(color){
    document.getElementById("aviso").style.color = color;
    document.getElementById("answer").style.borderColor = color;
    document.getElementById("botao").style.borderColor = color;
}

document.addEventListener("keydown", (teclado) => {
    if (teclado.key === "Enter") {
        load();
    }
});