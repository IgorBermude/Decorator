public class Azeitona extends PizzaDecorator{
    public Azeitona(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + ", azeitona";
    }

    @Override
    public double getPreco() {
        return pizza.getPreco() + 1.5; // Preço da azeitona
    }
}
