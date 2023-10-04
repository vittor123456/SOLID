/**
 * Neste código, a classe LightSwitch possui uma dependência direta da classe LightBulb. 
 * A criação da instância de LightBulb é feita dentro do construtor de LightSwitch, 
 * o que acopla as duas classes de forma rígida. 
 * Isso viola o Princípio de Inversão de Dependência, pois a classe de alto nível (LightSwitch) 
 * depende de uma classe de baixo nível (LightBulb).
 */
public class LightSwitch {
    private LightBulb lightBulb;

    public LightSwitch() {
        this.lightBulb = new LightBulb();
    }

    public void press() {
        if (lightBulb.isOn()) {
            lightBulb.turnOff();
        } else {
            lightBulb.turnOn();
        }
    }
}