//calcular e imprimir o combustivel gasto em uma viagem no console
//você tera 3 variaveis: 
//1 - preço do combustivel
//2 - gasto medio de combustivel do veiculo por km
//3 - distancia em km da viagem

const precoCombustivel = 4.69;
let kmPorLitros = 14;
let distanciaPercorridaKm = 100;
let combustivelUtilizado = distanciaPercorridaKm / kmPorLitros;
let valorGasto = combustivelUtilizado * precoCombustivel;

console.log("voce gastou:", valorGasto.toFixed(2), "reais");

