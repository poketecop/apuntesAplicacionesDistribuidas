# Chuletario
## Velocidades conexión (x/s donde x pueden ser caracteres, bytes...)
### El ancho de banda se limita a la transferencia de datos y no se tiene en cuenta el tiempo de establecimiento.
### La velocidad de transmisión incluye mensaje y réplica e incluye el tiempo de establecimiento.
### Para calcular la velocidad usar siempre el máximo tamaño de paquete a no ser que se necesiten n paquetes con lo que se debe usar n + máximo tamaño de paquete.
## Combinaciones orden conexión
### n mensajes
#### Socket conexión: mismo orden en el que se envían: 1
#### Socket no conexión: cualquier orden: factorial(n)

