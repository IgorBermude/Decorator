public class Calabresa extends PizzaDecorator{
    public Calabresa(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + ", calabresa";
    }

    @Override
    public double getPreco() {
        return pizza.getPreco() + 3.0; // Preço da calabresa
    }
}
