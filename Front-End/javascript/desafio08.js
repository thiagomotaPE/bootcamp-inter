//desaio estruturas de repetição
/*
crie um programa que percorra uma lista de numeros e imprima todos os numeros pares encontrados
*/

const lista = [];
lista.push(2);
lista.push(5);
lista.push(6);
lista.push(9);
lista.push(3);
lista.push(4);
lista.push(1);
lista.push(7);
lista.push(0);
lista.push(5);

for (let i = 0; i < lista.length; i++) {
    const element = lista[i];
    if (element % 2 === 0){
        console.log(element);
    } 
}