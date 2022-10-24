# Introduction au Java

## Le vocabulaire et les bases

1. **Structure principale :**

   ```java
   public class HelloWorld {
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



| Visibilité | Informations                                                 |
| ---------- | ------------------------------------------------------------ |
| `public`   | Visibilité public pour tout le monde                         |
| `private`  | Visibilité public uniquement pour la classe à laquelle la variable appartient, sinon pour les autres classes cette variable n'existe pas. |



Si le mot clé `final` est placé devant le type de la variable, celle-ci est immutable *(constante)*, sinon la variable est mutable.



1. **Une classe :**

   

   

1. **Le constructeur :**

   ```java
   public class HelloWorld {
       public HelloWorld(){
       	System.out.println("Constructeur de HelloWorld !");
       }
       
       public static void main(String[] args){
           HelloWorld hw = new HelloWorld();
           System.out.println("Hello world !");
       }
   }
   ```

   > Constructeur de HelloWorld !
   >
   > Hello world !

   

   Le constructeur est une fonction appelé à l'implémentation d'une classe.

   

   Par exemple, pour le code ci-dessous la classe est `HelloWorld`, il est possible d'utiliser le constructeur *(nécessaire et important la plus par du temps)* pour afficher un message, gérer des variables, etc... directement à l'implémentation d'une classe.

   *ligne 7* &rarr; Implémentation de la classe `HelloWorld`, donc réalisation du constructeur `HelloWorld()`

   

    

1. **Une méthode :**

   ```java
   public class HelloWorld {
       private String myString;
       
       public HelloWorld(String myString){
       	this.myString = myString;
       }
       
       public void printHelloWorld(){
           System.out.println(myString);
       }
       
       public static void main(String[] args){
           HelloWorld hw = new HelloWorld("Hello world!");
           hw.printHelloWorld()
       }
   }
   ```

   >  Hello world !

   

## Les classes





## Les interfaces







## Les `enum`





## L'Observateur

