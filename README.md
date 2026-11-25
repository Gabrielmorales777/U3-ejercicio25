# U3-ejercicio25
# Biblioteca y Clasificación de Materiales de Lectura

## Objetivo principal

Implementar una jerarquía de clases en Java para gestionar materiales bibliográficos mediante herencia, reutilización de código y polimorfismo.

## Descripción

Se desarrolla una clase base `MaterialBiblioteca` que contiene los atributos comunes de los materiales: título, año de edición y editorial.

A partir de esta clase se crean las subclases `Libro` y `Revista`, que incorporan sus características particulares.

Ambas clases sobrescriben el método `mostrarInformacion()` para complementar los datos generales con información específica de cada material.

En la clase principal se utiliza un `ArrayList` de tipo `MaterialBiblioteca` para almacenar y recorrer objetos de diferentes subclases de manera polimórfica.

## Conceptos aplicados

- Herencia
- Encapsulamiento
- Constructores y uso de `super`
- Sobrescritura de métodos (`@Override`)
- Polimorfismo
- Colecciones con `ArrayList`

  ![U3 ejercicio25](U3%20ejercicio25.png)
