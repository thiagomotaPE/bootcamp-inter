function escrevaNome(nome){
    return console.log(nome);
}
function verificarIdade(idade){
    if(idade > 17.9){
        return console.log("Maior de idade");
    }else{
        return console.log("menor de idade");
    }
}

(function(){
    let nome = "thiago";
    let idade = 16;
    escrevaNome(nome);
    verificarIdade(idade);
})();

function calcularMedia(nota1, nota2) {
    const media = (nota1 + nota2) / 2;
}

console.log(calcularMedia(5, 5));