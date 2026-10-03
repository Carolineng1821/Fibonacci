# Fibonacci

## Descripción

Aplicación de consola desarrollada en Java que permite generar una cantidad determinada de números de la serie Fibonacci a partir de un límite indicado por el usuario.

La aplicación calcula la serie, almacena los resultados en una `List<Long>` y posteriormente muestra la información en consola.

## Objetivo

Practicar fundamentos de programación en Java mediante un proyecto que permite aplicar:

- Clases y objetos.
- Métodos.
- Parámetros.
- Estructuras de control.
- Ciclo `for`.
- Condicionales `if/else`.
- Entrada de datos mediante `Scanner`.
- Uso de colecciones `List`.
- Uso de `ArrayList`.
- Separación de responsabilidades.
- Manejo de valores numéricos mediante `long`.

## Funcionamiento

El usuario indica cuántos términos de la serie Fibonacci desea generar.

La clase `Fibonacci` se encarga de realizar el cálculo y devolver los resultados mediante una `List<Long>`.

La clase `Main` se encarga de:

- Solicitar el límite al usuario.
- Invocar el método de Fibonacci.
- Validar si el resultado está vacío.
- Mostrar la serie generada.

### Ejemplo de ejecución

```text
Digita un número límite
8

Serie Fibonacci: [0, 1, 1, 2, 3, 5, 8, 13]
```

### Ejemplo con un límite inválido

```text
Digita un número límite
0

Invalido
```

## Estructura del proyecto

```text
Fibonacci/
│
├── src/
│   ├── Main.java
│   └── Fibonacci.java
│
├── .gitignore
└── README.md
```

## Tecnologías

- Java 21
- Eclipse Temurin JDK 21
- IntelliJ IDEA
- Git
- GitHub

## Conceptos aplicados

### Serie Fibonacci

La serie se genera utilizando los dos valores anteriores para calcular el siguiente:

```text
0, 1, 1, 2, 3, 5, 8, 13...
```

### Colecciones

Los resultados se almacenan en:

```java
List<Long>
```

utilizando una implementación:

```java
ArrayList<>
```

### Separación de responsabilidades

La lógica de cálculo se encuentra en `Fibonacci`, mientras que la interacción con el usuario y la presentación del resultado se manejan desde `Main`.

## Prueba con valores grandes

El proyecto utiliza `long` para los valores de Fibonacci, permitiendo trabajar con números que superan el rango de `int`.

Por ejemplo, al generar 50 términos:

```text
2971215073
4807526976
7778742049
```

Estos valores superan el límite de `int`, pero pueden ser manejados por `long`.

## Autor

Carolina Neri Garduño