/**
 * Neste código, a classe LightSwitch possui uma dependência direta da classe LightBulb. 
 * A criação da instância de LightBulb é feita dentro do construtor de LightSwitch, 
 * o que acopla as duas classes de forma rígida. 
 * Isso viola o Princípio de Inversão de Dependência, pois a classe de alto nível (LightSwitch) 
 * depende de uma classe de baixo nível (LightBulb).
 */
public class LightBulb {
    public void turnOn() {
        System.out.println("Light bulb turned on");
    }

    public void turnOff() {
        System.out.println("Light bulb turned off");
    }
}