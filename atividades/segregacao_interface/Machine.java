/*
Neste código, temos uma interface Machine que possui três métodos: print(), scan() e fax(). 
Em seguida, temos a classe AllInOnePrinter que implementa essa interface. 
No entanto, essa implementação viola o Princípio de Segregação de Interface, 
pois nem todas as classes que implementam a interface Machine precisam de todas as funcionalidades.
 */
public interface Machine {
    void print();
    void scan();
    void fax();
}