package Invoice;

class Invoice {
    private String numeroItemFatura;
    private String descricaoItem;
    private int quantidadeComprada;
    private double precoUnitarioItem;

    public Invoice(String numeroItemFatura, String descricaoItem, int quantidadeComprada, double precoUnitarioItem) {
        this.numeroItemFatura = numeroItemFatura;
        this.descricaoItem = descricaoItem;
        this.quantidadeComprada = quantidadeComprada;
        this.precoUnitarioItem = precoUnitarioItem;
    }

    public String getNumeroItemFatura() {
        return numeroItemFatura;
    }

    public void setNumeroItemFatura(String numeroItemFatura) {
        this.numeroItemFatura = numeroItemFatura;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public double getPrecoUnitarioItem() {
        return precoUnitarioItem;
    }

    public void setPrecoUnitarioItem(double precoUnitarioItem) {
        this.precoUnitarioItem = precoUnitarioItem;
    }

    public double calcularValorTotal() {
        return quantidadeComprada * precoUnitarioItem;
    }

    public void imprimirFatura() {
        System.out.println("Número do item da fatura: " + numeroItemFatura);
        System.out.println("Descrição do item: " + descricaoItem);
        System.out.println("Quantidade comprada: " + quantidadeComprada);
        System.out.println("Preço unitário do item: " + precoUnitarioItem);
        System.out.println("Valor total da fatura: " + calcularValorTotal());
    }


    public static void main(String[] args) {
        Invoice invoice = new Invoice("12345", "Teclado", 2, 50.0);

        invoice.imprimirFatura();
    }
}
