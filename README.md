# Parcial Número 2

Desarrolle una aplicación concurrente que permita calcular el total de casos positivos de COVID19 en el Ecuador.

## Descripción general del problema y código suministrado

Para alcanzar ese objetivo suponga que cada provincia del país publica su información a través de un API Web 
(Servicio Web basado en REST), es por ello que su función es obtener los datos de cada provincia, para luego sumar y 
obtener el total del país.

Para simular el consumo de un API Web, se han creado las siguientes clases:
 * ProvinceStats, representa la información de cada provincia. Tiene por atributos id, nombre, región y número de casos
 confirmados. Un objeto de clase es lo que recibirá cuando consulte los datos de las 24 provincias.
 * EcuadorStats. Es una clase que simula al API Web. El método que usará se llama *getData*. A ese método se le envía el
 identificador de la provincia (un número entero comprendido entre 1 y 24 incluidos) y devuelve un objeto ProvinceStats 
 con la información de cada provincia.
 
 ## Restricciones
 
Todo su código debe ser implementado en la clase Parcial.java.
 
Para resolver el problema lo primero que tiene que hacer es implementar el método *populateDataProvinces*, que busca 
llenar de datos la lista *dataProvinces*. 
Únicamente podrá usar un pool de Threads de 12 (Threads) y la estrategia de no esperar a un hilo, 
sino, continuar con el siguiente y encolar al Thread que 
no ha finalizado. Finalmente, sólo se permite el uso de la intefa Callabel

Finalmente debe implementar el método *getTotal* que es el método que devuelve el total de casos, para ello debe sumar 
el número de casos positivos de cada provincia.

Está prohibido modificar las clases EcuadorStats y ProvinceStats. Así como modificar la estructura o elemintar los 
métodos *populateDataProvinces* y *getDataProvinces* de la clase Parcial. Recuerde que únicamente debe agregar código, 
no eliminarlo.

## Calificación

Este proyecto será calificado por a través de una prueba unitaria y de inspección de código. La prueba unitaria tendrá 
un valor de 4 puntos y la inspección de código de 6 puntos.

 
  
 