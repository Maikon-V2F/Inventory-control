public class MyProgram {
   
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    //Construtor
    public MyProgram(String nome, double preco, int quantidadeEmEstoque) {
      this.nome = nome;
      this.preco = preco;
      this.quantidadeEmEstoque = quantidadeEmEstoque;
  }


    //getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    //setters
    public void setPreco(double preco) {
        // Verifica se é positivo
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: Preço não pode ser negativo.");
        }
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        // Verifica se a quantidade em estoque é positiva
        if (quantidadeEmEstoque >= 0) {
            this.quantidadeEmEstoque = quantidadeEmEstoque;
        } else {
            System.out.println("Erro: Quantidade em estoque não pode ser negativa.");
        }
    }

    // Método para adicionar unidades ao estoque
    public void adicionarEstoque(int quantidade) {
        // Verifica se a quantidade é positiva
        if (quantidade >= 0) {
            this.quantidadeEmEstoque += quantidade;
        } else {
            System.out.println("Erro: A quantidade a adicionar não pode ser negativa.");
        }
    }

    // Método para exibir as informações do produto
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque + " unidades");
    }

    public static void main(String[] args) {
        // Criando um objeto MyProgram
        MyProgram camiseta = new MyProgram("Camiseta", 29.99, 50);

        camiseta.setPreco(39.99);

        camiseta.adicionarEstoque(10);

        camiseta.exibirInformacoes();
    }
}
