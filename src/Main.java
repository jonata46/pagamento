void main() {

    FormaDePagamento pix =  new PagamentoPix();
    pix.processarPagamento();
    pix.processarPagamento();

    FormaDePagamento Boleto = new Boleto();
    Boleto.processarPagamento();
    Boleto.processarPagamento();
}
