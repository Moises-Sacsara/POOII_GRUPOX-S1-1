package Clases;

public class Circulo {
    //Las variables
    private double radio=12.5;
    private String color="azul";
    
    
    //Constructor sin argumentos
    public Circulo() {
        
    }
    //Constructor con un argumento
    public Circulo(double radio) {
        this.radio = radio;
    }
    //Modificando el constructor con argumentos
    public Circulo(double radio, String color){
        this.setRadio(radio);
        this.setColor(color);
    }
    
    //Metodo getRadio
    public double getRadio() {
        return radio;
    }
    //Metodo getArea
    public double getArea() {
        return this.radio * this.radio * Math.PI;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    //Describimos el objeto
    @Override
    public String toString(){
        return "Circulo \n"
                + "Radio: "+radio+"\n"
                + "Area: "+getArea()+"\n"
                + "Color: "+color;
    }
    
    /*
    1. ¿Puedes ejecutar la clase “Circulo.java”? ¿Por que?
    Respuesta: No se podria ejecutar la clase Circulo.java porque no tiene el
    metodo main
    *****************************************************************************************
    2. ¿Qué pasos en común debe realizar para ejecutar cada uno de los ejercicios? Describir 
    conceptos del paradigma orientada a objetos.
    Respuesta:
    - Cree y defini mis clases
    - encapsule los atributos y metodos
    *****************************************************************************************
    a. ¿Qué es el constructor y para qué sirve?
    Rspuesta: Es un metodo que es generado cuando se crea una instancia, y sirve para
    inicializar con valores especificos
    *****************************************************************************************
    b. ¿Con qué metodo recupero el radio del circulo?
    Respuesta: Con el metodo getRadio()
    *****************************************************************************************
    c. ¿Por que los atributos son privados y los metodos son publicos?
    Respuesta: Para controlar el acceso a los datos
    *****************************************************************************************
    d. ¿Que pasa si accedes directamente a los atributos del circulo desde el metodo 
    main()?
    Respuesta: Saldria error ya que sus metodos son publicos
    *****************************************************************************************
    e. ¿Qué pasa si modificas directamente el atributo area del círculo desde el método 
    main()?
    Respuesta: No se podria modificar el atributo ya que solo existe el metodo Area
    *****************************************************************************************
    f. En la clase “CirculoTest.java”, ejecuta la siguiente instrucción: 
    System.out.println(c1.radius), donde c1 es una instancia del objeto Círculo. ¿Qué 
    ocurió?. Explique el mensaje de error.
    Respuesta: Generaria un erros ya que el atributo radio es privado y no se puede acceder
    *****************************************************************************************
    g. En la clase “CirculoTest.java”, ejecuta la siguiente instrucción: c1.radius=42.0, 
    donde c1 es una instancia del objeto Círculo. ¿Qué ocurió?. Explique el mensaje 
    de error.
    Respuesta: Generaria un error ya que no se puede modificar el atributo radio por ser privado
    *****************************************************************************************
    h. ¿Con qué método modificas el valor de un atributo de la clase “Circulo.java”?
    Respuesta: Con el metodo setRadio o setColor
    *****************************************************************************************
    j. ¿Para qué sirve la palabra reservada “this”?
    Respuesta: Es utilizado para diferenciar los atributos y parametros
    *****************************************************************************************
    k. ¿Para qué sirve el método toString()?
    Respuesta: Sirve para imprimir en cadena la informacion de un objeto
    
    Diagrama de flujo en lucidchart:
    https://lucid.app/lucidchart/9f9a1c17-ed3b-4a21-b403-d40222e79853/edit?view
    _items=NmG6oHAxQgQk&invitationId=inv_e601ead2-8d47-49e4-944d-ac7e0a7fbf9b
    */
}
