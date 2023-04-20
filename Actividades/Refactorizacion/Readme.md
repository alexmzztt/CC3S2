# Actividad Refactorizacion

## Requisito 1: 

El estado de la calculadora es verdadero cuando se inicializa correctamente.

Primero escribimos la prueba en la clase CalculatorTest

![](Assets/imagen1.jpg)

Luego escribimos el código que la hace verdadera

![](Assets/imagen2.jpg)

Ejecutamos la prueba para verificar que todo está bien:

![](Assets/imagen3.jpg)

## Requisito 2:

La calculadora debe tener funciones de suma y resta.

![](Assets/imagen4.jpg)

![](Assets/5.jpg)

Hacemos la primera refactorización. Usaremos la anotación @BeforeAll para escribir un método que se ejecutará primero antes del método de prueba.

![](Assets/6.jpg)

Ahora podemos eliminar todo el código de inicialización de la calculadora en los métodos de prueba

Realizamos la implementaciónb de la función de resta:

![](Assets/7.jpg)

![](Assets/8.jpg)

Verificamos si pasan las pruebas:

![](Assets/9.jpg)


## Requisito 3:

La calculadora debe tener función de división.

Cuando alguien divide por cero, se debe lanzar una excepción. Escribamos la primera prueba para este requisito.

![](Assets/10.jpg)

Implementación

![](Assets/11.jpg)

Debemos comprobar que se lanza una excepción cuando alguien divide por cero:

![](Assets/12.jpg)

![](Assets/13.jpg)

Verificamos que pase la prueba:

![](Assets/14.jpg)

## Ejercicio: 

Agrega más funciones a la clase Calculadora utilizando los principios de TDD.

Agregaremos multipllicación

![](Assets/15.jpg)

![](Assets/16.jpg)

Verificamos que pase la prueba:

![](Assets/17.jpg)




































