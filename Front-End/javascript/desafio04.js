/**
 algoritimo para calcular desconto ou acrescimo de um produto de acordo com a forma de pagamento
 condição de pagamento:
 1 - a vista debito, 10% desconto
 2 - a vista dinheiro, 15% desconto
 3 - em duas vezes, preço normal
 4 - acima de duas vezes, 10% juros
 */

const precoEtiqueta = 100;
let formaPagamento = 4;
let totalPagar = precoEtiqueta;
let desconto;
let acrescimo;



 if(formaPagamento === 1){
    desconto = (10/100)*precoEtiqueta;
    totalPagar = precoEtiqueta - desconto;
 }else if (formaPagamento === 2){
    desconto = (15/100)*precoEtiqueta;
    totalPagar = precoEtiqueta - desconto;
 }else if(formaPagamento === 3){
    console.log("em 2x de", precoEtiqueta/2);
 }else if(formaPagamento === 4){
    desconto = (10/100)*precoEtiqueta;
    totalPagar = precoEtiqueta + desconto;
 }
 console.log(totalPagar);