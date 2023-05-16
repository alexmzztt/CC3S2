# (a) ¿Qué son las pruebas efectivas y sistemáticas?

Las pruebas significativas y sistematicas se refieren a que se debe tener un enfoque efectivo para poder diseñar 
casos de prueba en nuestro proceso de desarrollo de software. De forma simple seria seguir 
pasos de forma sistematica para generar pruebas que puedan cubrir los requisitos del programa.
El autor nos sugiere analizar los requisitos para luego desglosarlos en entradas y en resultados esperados, luego exploramos 
las diferentes combinaciones de entradas y salidas para generar pruebas que cubran escenarios relvantes del programa.

# Pruebas

![](assets/1.jpg)

### (a) Comienza a implementar una estrategia de prueba sistemática para esta función
escribiendo una buena partición del espacio de entrada solo en el límite de entrada, es
decir, la partición no debe mencionar ni el texto ni el delimitador.

Podemos ver que para limite en la especificacion se tiene "si limite <0, no hay 
limite superior; limite !=0" y tambien "N <= limite si limite > 0"

Entonces podemos observar que uno de los requisitos del programa es el limite, 
asi que podriamos desglosar su entrada en 3 casos, si limite es mayor a 0, si limite es menor a 0, 
y si limite es igual a 0.

Para limite mayor a 0 probamos con un numero positivo, el cual sera el limite para el numero maximo .

Para limite menor a 0 deberiamos probar un numero negativo, para lo que no habria limite superior.

Para limite igual a 0 al probar con 0 el programa no nos deberia retornar nada y deberia 
mostrarnos un mensaje de que el limite no puede ser 0

### (b) Ahora, escriba una buena partición del espacio de entrada sobre la relación entre el límite y las ocurrencias del delimitador en el texto. Tu partición debe mencionar las tres entradas.

Para que esto pueda entenderse mejor pondre un ejemplo, si tenemos "Seguire-mi-camino-ninja" y nuestro delimitador es "-" 
entonces podemos probar para un limite mayor al numero de ocurrencias del delimitador, por ejemplo 4, teniendo en cuenta 
que la cantidad de ocurrencias de nuestro delimitador en la anterior frase es de 3.

De la misma forma podemos probar para un limite menor al numero de ocurrencias del delimitador, por ejemplo 2, teniendo en cuenta 
que la cantidad de ocurrencias de nuestro delimitador en la frase es de 3.

Tambien podriamos probar para cuando el limite es 0.
