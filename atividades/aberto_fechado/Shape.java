/*
Neste código, a classe Shape possui um método draw() que verifica o tipo de forma 
(circle, rectangle ou triangle) e chama o método correspondente para desenhar a forma. 
Isso viola o Princípio OCP, pois a classe está aberta para modificação 
sempre que um novo tipo de forma é adicionado.
*/
public class Shape {
    private String type;

    public Shape(String type) {
        this.type = type;
    }

    public void draw() {
        if (type.equals("circle")) {
            drawCircle();
        } else if (type.equals("rectangle")) {
            drawRectangle();
        } else if (type.equals("triangle")) {
            drawTriangle();
        }
    }

    private void drawCircle() {
        System.out.println("Drawing a circle");
    }

    private void drawRectangle() {
        System.out.println("Drawing a rectangle");
    }

    private void drawTriangle() {
        System.out.println("Drawing a triangle");
    }
}