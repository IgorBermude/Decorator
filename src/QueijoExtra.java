public class QueijoExtra extends PizzaDecorator{
    public QueijoExtra(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + ", queijo extra";
    }

    @Override
    public double getPreco() {
        return pizza.getPreco() + 2.0; // Preço do queijo extra
    }
}
