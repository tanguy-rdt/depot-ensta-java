# Introduction au Java

## Le vocabulaire et les bases

1. **Structure principale :**

   ```java
   public class Main {
       public static void main(String[] args){
           System.out.println("Hello world !");
       }
   }
   ```

   > Hello world !

   
   
   *On remarque que le `main` est dans une classe `HelloWorld`*


2. **Les types de variables et leurs visibilités :**

    | Types     | Informations                 |
    | --------- | ---------------------------- |
    | `byte`    | Pour un entier sur 8 bits    |
    | `short`   | Pour un entier sur 16 bits   |
    | `int`     | Pour un entier sur 32 bits   |
    | `long`    | Pour un entier sur 64 bits   |
    | `char`    | Pour un caractère Unicode    |
    | `String`  | Pour une chaine de caractère |
    | `float`   | Pour un décimale sur 32 bits |
    | `double`  | Pour un décimale sur 64 bits |
    | `boolean` | `TRUE` or `FALSE`            |

    | Visibilité | Informations                                           |
    | ---------- | ------------------------------------------------------ |
    | `public`   | Visibilité public pour tout le monde                   |
    | `private`  | Visibilité public uniquement pour la classe à laquelle la variable appartient |
    | `protected`| Visibilité pour le package et toutes les sous-classes |

    Si le mot clé `final` est placé devant le type de la variable, celle-ci est immutable *(constante)*, sinon la variable est mutable.
    

3. **Une méthode :**

   Une méthode correspond à une fonction en *java*.
   
   La visibilité pour une variable est également nécessaire pour une méthode *(public, private, protected)*.

​		

1. **Les *keywords*:**

   - `final` &rarr; Une variables est normalement mutable, avec le *keyword* `final` une variable devient immutable (constante)

   - `static` &rarr;  Si le mot clé `static` est utilisé devant une classe, celle-ci ne dépend pas d'un objet. Elle est alors modifié directement en cas de changement de valeurs et ses méthode sont appelé sans objets.



## Les classes

### Principe d'une classe
1. **Une classe :**
    
    Une classe permet de structurer notre code en fonctionnalité, par exemple dans la vie courrante si on à un item qui est une personne. Il n'est pas nécessaire que la personne est accés au méthode destiné à un chien, elle n'aboie pas. \
    Pour résoudre ce problème on peut utiliser des classes, une pour les persones avec ses méthodes et une seconde pour les chiens. Dans ce cas si on à un item qui est une personne, la classe item étendra la classe personne et on aura accés seulement au méthode et au variable nécessaire.


2. **Le constructeur :**

   ```java
   public class HelloWorld {
       public HelloWorld(){
       	System.out.println("Constructor of HelloWorld !");
       }
       
       public static void main(String[] args){
           HelloWorld hw = new HelloWorld();
           System.out.println("Hello world !");
       }
   }
   ```

   > Constructor of HelloWorld !
   >
   > Hello world !

   Le constructeur est une fonction appelé suite à l'instance d'une classe.

   Par exemple, pour le code ci-dessus la classe est `HelloWorld`, il est possible d'utiliser le constructeur *(nécessaire et important la plus par du temps)* pour afficher un message, gérer des variables, etc... directement à l'implémentation d'une classe.

   *ligne 7* &rarr; Implémentation de la classe `HelloWorld`, donc réalisation du constructeur `HelloWorld()`


### Package

On remarque que toute les méthodes sont en `protected`, ce qui n'est pas dérengant puisque la classe `Main` est dans le même package que `Dog` et `Person`.
Avec le code suivant, nos item sont structuré et font les bonnes actions.

```java
package genie_logiciel.exemple;

public class Main {
    public static void main(String[] args){
        Dog dog = new Dog();
        Person person = new Person();

        dog.printHowIam();
        dog.bark();

        person.printHowIam();
        person.talk();
    }
}
```

```java
package genie_logiciel.exemple;

public class Dog {

    final private String howIam;

    protected Dog(){
        this.howIam = "I'm a dog";
    }

    protected void bark(){
        System.out.println("whouf");
    }

    protected void printHowIam(){
        System.out.println(howIam);
    }
}
```


```java
package genie_logiciel.exemple;

public class Person {

    final private String howIam;

    protected Person(){
        this.howIam = "I'm a preson";
    }

    protected void talk(){
        System.out.println("Hello");
    }

    protected void printHowIam(){
        System.out.println(howIam);
    }
}
```


### Héritage
```java
package genie_logiciel.exemple;

public class Main extends Person {

    protected Main(String myName) {
        super(myName);
    }

    @Override
    protected void talk(){
        super.talk();
        System.out.println("My brother is Jacque");
    }


    public static void main(String[] args){
        Person person1 = new Person("Pierre");
        Person person2 = new Main("Paul");

        person1.printHowIam();
        person1.talk();

        person2.printHowIam();
        person2.talk();
    }
}
```



```java
package genie_logiciel.exemple;

public class Person {

    final private String howIam;
    final private String myName;


    protected Person(String myName){
        this.howIam = "I'm a preson";
        this.myName = myName;
    }

    protected void talk(){
        System.out.println("Hello, my name is " + myName);
    }

    protected void printHowIam(){
        System.out.println(howIam);
    }
}
```

> I'm a preson \
  Hello, my name is Pierre \
  I'm a preson \
  Hello, my name is Paul \
  My brother is Jacque 





## Les interfaces

```java
package genie_logiciel.exemple;

public class Main {

    public static void main(String[] args){
        Dog dog = new Dog();
        Person person = new Person("Pierre");

        dog.printHowIam();
        dog.bark();
        dog.eat();

        person.printHowIam();
        person.talk();
        person.eat();
    }
}
```


```java
package genie_logiciel.exemple;

public class Person implements GeneralThings{

    final private String howIam;
    final private String myName;


    protected Person(String myName){
        this.howIam = "I'm a preson";
        this.myName = myName;
    }

    protected void talk(){
        System.out.println("Hello, my name is " + myName);
    }

    @Override
    public void printHowIam(){
        System.out.println(howIam);
    }

    @Override
    public void eat() {
        System.out.println("I'm a person and I eat");
    }
}
```


```java
package genie_logiciel.exemple;

public class Dog implements GeneralThings{

    final private String howIam;

    protected Dog(){
        this.howIam = "I'm a dog";
    }

    protected void bark(){
        System.out.println("whouf");
    }

    @Override
    public void printHowIam(){
        System.out.println(howIam);
    }

    @Override
    public void eat() {
        System.out.println("I'm a dog and I eat");
    }
}
```


## L'Observateur

