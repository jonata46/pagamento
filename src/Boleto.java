import java.time.LocalDate;

public class Boleto extends FormaDePagamento {

    private LocalDate dataVencimento;

    public LocalDate getDataVencimento(){
        return dataVencimento = LocalDate.now().plusDays(10);
    }

    @Override
    public void processarPagamento(){
        String getDataCriacao;
        IO.println("seu Boleto foi gerado com sucesso!"
                + "\n o codigo de operação é: "
                + getCodigo() + "\n Data de Criação:"
                + getDataCriacao()
                + "A data de vencimento é: "
                + getDataVencimento()
        );
    }

}
