//desafios de classe e objetos
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
const p1 = new pessoa("mota", 21);
const p2 = new pessoa("isaac", 22);

function compararPessoas(p1, p2){
    if(p1.idade > p2.idade){
        return console.log(`${p1.nome} é mais velho`);
    }else{
        return console.log(`${p2.nome} é mais velho`);
    }
}

compararPessoas(p1, p2);
*/
/*
crie uma classe para representar carros.
os carros possuem uma marca, uma cor e um gasto medio de combustivel por km rodado.
crie um metodo que dado a quantidade de km e o preço do combustivel nos de o valor gasto em reais para realizar o percurso
*/

class carros{
    marca;
    cor;
    gastoMedioPorKm;

    constructor(marca, cor, gastoMedioPorKm){
        this.marca = marca;
        this.cor = cor;
        this.gastoMedioPorKm = gastoMedioPorKm;

    }

    calcularGastoDoPercursso(distanciaEmKm, precoCombustivel){
        return distanciaEmKm * this.gastoMedioPorKm * precoCombustivel;
    }
}

const carro1 = new carros('toyota', 'vermelho', 1/8);
console.log(carro1.calcularGastoDoPercursso(70, 5));

const carro2 = new carros('fiat', 'preto', 1/12);
console.log(carro2.calcularGastoDoPercursso(300, 4.89));