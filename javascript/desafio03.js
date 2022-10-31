/*faça um algoritimo que dado as 3 notas tiradas por um aluno em um semestre da faculdade,
calcule e imprima sua media e sua classificação conforme a tabela abaixo: 

    media menor que 5 - reprovado
    media entre 5 e 7 - recuperação
    media acima de 6 - aprovado
*/

let nota1 = 5;
let nota2 = 6;
let nota3 = 6;
let media = (nota1 + nota2 + nota3)/3;

console.log(media.toFixed(2));
if(media < 5){
    console.log("reprovado");
}else if(media > 4 && media < 7){
    console.log("recuperação");
}else{
    console.log("aprovado");
}