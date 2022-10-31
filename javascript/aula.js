/* funções
function gasolina(distanciaPercorridaKm, kmPorLitros){
    return distanciaPercorridaKm / kmPorLitros;
}
function gastos(combustivelUtilizado, precoCombustivel){
    return combustivelUtilizado * precoCombustivel;
}
(function main(){
    const precoCombustivel = 10;
    let kmPorLitros = 10;
    let distanciaPercorridaKm = 100;
    
    let combustivelUtilizado = gasolina(distanciaPercorridaKm, kmPorLitros);

    console.log("voce gastou:", gastos(combustivelUtilizado, precoCombustivel).toFixed(2), "reais");
})();
*/

//classe e objetos(poo)
/*
class pessoa {
    nome;
    idade;

    constructor(nome, idade){
        this.nome = nome;
        this.idade = idade;
    }

    descrever(){
        console.log(`nome: ${this.nome}, idade: ${this.idade}`);
    }
}

const vitor = new pessoa("costa", 15);
const thiago = new pessoa("mota", 21);
vitor.descrever();
thiago.descrever();
*/
