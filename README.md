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

```java
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

### This y super

![This Y super](https://cdn1.gnarususercontent.com.br/6/476503/cdba391c-5245-4361-91a4-7cab37458802.png "This Y super")

Hagas clic aquí para acceder a la documentación oficial y obtener más información sobre la palabra clave [this](https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html "this") y la palabra clave [super](https://docs.oracle.com/javase/tutorial/java/IandI/super.html "super").

### Modificadores de acceso

Los modificadores de acceso o accesibilidad son algunas palabras claves utilizadas en el lenguaje Java para definir el nivel de accesibilidad que los elementos de una clase (atributos y métodos) e incluso la propia clase puede tener los mismos elementos de otra clase.

**Public**

Este es el modificador menos restrictivo de todos. De esta manera, cualquier componente puede acceder a los miembros de la clase, las clases y las interfaces.

**Protected**

Al usar este modificador de acceso, los miembros de la clase y las clases son accesibles para otros elementos siempre que estén dentro del mismo package o, si pertenecen a otros packages, siempre que tengan una relación extendida (herencia), es decir, las clases secundarias pueden acceder a los miembros de su clase principal (o clase de abuelos, etc.).

**Private**

Este es el modificador de acceso **más restrictivo** de todos. Solo se puede acceder a los miembros definidos como privados desde dentro de la clase y desde ningún otro lugar, independientemente del paquete o la herencia.

Hagas clic [aquí](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html "aquí") para acceder a la documentación oficial y obtener más información.

### Sobrecarga

Existe otro concepto en los lenguajes OO que se llama **sobrecarga** que es mucho más simple que la sobreescritura y no depende de la herencia.

Por ejemplo, en nuestra clase **Gerente**, imagina otro nuevo método autenticar que recibe además de la contraseña también el login:

```java
public class Gerente extends Funcionario {

    private int contraseña;

    public int getContraseña() {
        return contraseña;
    }

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

    // Nuevo método, recibiendo dos parámetros
    public boolean autenticar(String login, int contraseña) {
        // implementación omitida
    }

    // Otros métodos omitidos
}
```
Observe que hemos creado una nueva versión del método autenticar. Ahora tenemos dos métodos de autenticar en la misma clase que varían en el número o tipo de parámetros. Esto se llama sobrecarga de métodos.

La sobrecarga no tiene en cuenta la visibilidad o retorno del método, solo los parámetros y no depende de la herencia.

### Haga lo que hicimos en aula

¡Llegó la hora de que usted ponga en práctica lo visto en el aula! Para eso, siga los pasos listados a continuación.

El gerente tiene una bonificación diferente, tiene la bonificación de un empleado común más un salario. Luego, en la clase Gerente, reescribe el método getBonificacion().

En este método, aproveche el método getBonificacion() de la **superclase**:

```java
public double getBonificacion() {
    return super.getBonificacion();
}
```

Además, agregue un salario a la bonificación actual. Para ello acceda al método *getSalario()*, también perteneciente a la superclase:

```java
public double getBonificacion() {
    return super.getBonificacion() + super.getSalario();
}
```
En la clase *TestGerente*, imprima al final la bonificación del gerente y vea el resultado.

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
        boolean autenticou = g1.autenticar(2222);

        System.out.println(autenticou);

        System.out.println(g1.getBonificacion());
    }

}
```

### Lo que aprendimos

En esta clase entramos más a fondo en la herencia. Aprendimos:

- que la clase madre es llamada de super o base class.
- que la clase hija también es llamada de sub class.
- como aumentar la visibilidad de un miembro (atributo, método) a través de protected.
- cómo acceder o llamar un miembro (atributo, método) a través de super.
- cómo redefinir un método a través de la sobreescritura. En la próxima clase veremos un nuevo beneficio de la herencia, el Polimorfismo. ¡Aguarda!