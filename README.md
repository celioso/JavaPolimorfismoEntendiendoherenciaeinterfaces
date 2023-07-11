# JavaPolimorfismoEntendiendoherenciaeinterfaces

Llegó la hora de poner en práctica todo lo que fue visto en el aula. Para esto, ejecute los pasos listados abajo.

En Eclipse, cree un proyecto nuevo Java llamado **byteBank-heredado**.

Dentro del proyecto, cree la clase Funcionario con los atributos privados nombre e documentoIdentidad de tipo **String**, e salario de tipo **double**.

Genere los getters e setters para todos los atributos de la clase Funcionario

El funcionario puede recibir una bonificación del 10% de su salario, así que cree el método getBonificacion(), que haga ese cálculo:

```java
public double getBonificacion() {
    return this.salario * 0.1;
}
```

Para probar la clase que acabas de implementar, cree la clase **TestFuncionario**, con el método *main*. En él, instancia un **Funcionario** asignándole un nombre, documentoIndentidad y salario, e imprímelos.

````java
public class TestFuncionario {

    public static void main(String[] args) {
        Funcionario nico = new Funcionario();

        nico.setNombre("Nico Steppat");
        nico.setDocumentoIdentidad("223355646-9");
        nico.setSalario(2590.80);

        System.out.println(nico.getNombre());
        System.out.println(nico.getBonificacion());

    }

}
```

Ahora, crea la clase *Gerente*, que **es un Funcionario**, luego haga que la clase herede todo de la clase *Funcionario*

Además, un Gerente tiene una contraseña, así que cree este atributo, de tipo entero y privado, junto a su *setter*, y un método para autenticar esa contraseña en el sistema:

```java
public boolean autenticar(int contraseña) {
    if (this.contraseña == contraseña) {
        return true;
    } else {
        return false;
    }
}
```

Finalmente, para probar la clase Gerente, cree una clase *TestGerente*, con el método *main*. En ella instancie un Gerente, asígnale un nombre, documento de Identidad, salario y contraseña, luego imprímelos. Además de eso, pruebe la autenticación de la contraseña.

```java
public class TestGerente {

    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setNombre("Marco");
        g1.setDocumentoIdentidad("235568413");
        g1.setSalario(5000.0);

        System.out.println(g1.getNombre());
        System.out.println(g1.getDocumentoIdentidad());
        System.out.println(g1.getSalario());

        g1.setContraseña(2222);
        boolean autentico = g1.autenticar(2222);

        System.out.println(autentico);

    }

}
```

### Opinión del instructor

La clase Funcionario quedaría de esta forma.

```java
public class Funcionario {

    private String nombre;
    private String documentoIdentidad;
    private double salario;

    public double getBonificacion() {
        return this.salario * 0.1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
```

Y la clase *Gerente* quedará de esta forma:

```java
public class Gerente extends Funcionario{

    private int contraseña;

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public boolean autenticar(int contraseña) {
        if (this.contraseña == contraseña) {
            return true;
        } else {
            return false;
        }
    }

}
```

#### Lo que aprendimos

En esta aula comenzamos a hablar de herencia y aprendimos:

- Cuáles son los problemas que la herencia resuelve.
- Cómo usar la herencia en Java a través de la palabra llave *extends*
- Al heredar la clase hija gana todas las características (atributos) y todas las funcionalidades (métodos) de la clase madre.
- Conocimos el primer beneficio de la herencia: *La reutilización de código*.
En la próxima clase veremos más detalles sobre la herencia como la palabra llave *super, protected* y la sobreescritura de métodos.