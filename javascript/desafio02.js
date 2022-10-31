/*
const numero = 0;
const numeroPar =  (numero % 2) === 0;

if (numero === 0){
    console.log("numero invalido");
}else if(numeroPar){
    console.log("é par");
}else{
    console.log("é impar");
}
*/
/*
faça um programa para calcular o valor de uma viagem

você tera 5 variaveis, sendo elas:
1 - preço do etanol
2 - preço da gasolina
3 - tipo de combustivel que seu veiculo utiliza
4 - gasto medio de cumbustivel por km
5 - distancia em km percorrida

imprima no console o valor que sera gasto para realizar a viagem
*/

const precoEtanol = 3.49;
const precoGasolina = 5.69;
let combustivelVeiculo = 'etanol';
let kmPorLitro = 12;
let distanciaPercorridaKm = 360;
let litrosUtilizados = distanciaPercorridaKm / kmPorLitro;
let valorGasto;

if (combustivelVeiculo === 'etanol'){
    valorGasto = litrosUtilizados * precoEtanol;
}else if(combustivelVeiculo === 'gasolina'){
    valorGasto = litrosUtilizados * precoGasolina;
}

console.log("você precisara de :", litrosUtilizados);
console.log("e gastara: ", valorGasto.toFixed(2));




