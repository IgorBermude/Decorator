public class Main {
    public static void main(String[] args) {
        Pizza pizza = new PizzaBase();

        pizza = new QueijoExtra(pizza); // Adiciona queijo extra
        pizza = new Calabresa(pizza); // Adiciona calabresa
        pizza = new Azeitona(pizza); // Adiciona azeitona

        System.out.println("Pedido: " + pizza.getDescricao());
        System.out.println("Preço do pedido: R$ " + pizza.getPreco());
    }
}