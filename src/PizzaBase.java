public class PizzaBase implements Pizza{
    @Override
    public String getDescricao() {
        return "Pizza base";
    }

    @Override
    public double getPreco() {
        return 10.0; // Preço da pizza sem adicionais
    }
}
