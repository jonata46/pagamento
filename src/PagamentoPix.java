public class PagamentoPix extends  FormaDePagamento{
    @Override
    public void processarPagamento(){
        String getDataCriacao;
        IO.println("seu pix foi reaizado com sucesso!"
        + "\n o codigo de operação é: "
        + getCodigo() + "\n Data de Pagamento:"
        + getDataCriacao()
        );
    }




}
