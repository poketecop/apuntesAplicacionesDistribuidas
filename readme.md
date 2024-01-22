# Chuletario

## Velocidades conexión (x/s donde x pueden ser caracteres, bytes...)

### El ancho de banda se limita a la transferencia de datos y no se tiene en cuenta el tiempo de establecimiento, los detalles de la sesión no importan: Tamaño máximo de mensaje/tiempo de transmisión

### Velocidad de transmisión: Cantidad total transmitida sesión / tiempo total sesión

## Combinaciones orden conexión

### n mensajes

#### Socket conexión: mismo orden en el que se envían: 1

#### Socket no conexión: cualquier orden: factorial(n)

## RMI

### Puerto por defecto: 1099
### Generar stubs y skeletons: rmic
### Generar implementaciones: javac
### Registrar objeto remoto: rmiregistry
![image](https://github.com/poketecop/apuntesAplicacionesDistribuidas/assets/65861838/66ed94da-4397-47c6-bdcb-5da7fefb7aed)

## OSI vs Capas de internet
![image](https://github.com/poketecop/apuntesAplicacionesDistribuidas/assets/65861838/c0b0a636-6118-4704-a048-6faad5b5f714)

## Probabilidad fallo distribuido

### Servicio disponible (1-p)^n

### Servicio no disponible 1 - (1-p)^n

### Fallo simultáneo: p^n

## Clase Socket para cliente, clase ServerSocket para servidor

## SMTP

### Esquema sesión
![image](https://github.com/poketecop/apuntesAplicacionesDistribuidas/assets/65861838/632dc85b-cbcc-4a04-b64c-4ac89515c851)


## Corba

### Grafo de nombres: concatenar letras del camino que lleva al objeto, número de caminos = número de nombres

## Protocolos

### Basados en texto: HTTP, SMTP, POP3, IMAP, FTP

### Basados en objetos: RMI, CORBA

### No orientados a conexión: UDP

### Orientados a conexión: TCP

### Clases: Direcciones de internet protocolos TCP y coh: InetAddress

## Paradigmas

### Escalabilidad: Agentes móviles más escalable que cliente-servidor

### Abstracción: LLamada a procedimienos remotos = llamada a métodos remotos

## Sockets

### Servidor: ServerSocket, Socket, DatagramSocket
### Cliente: Socket, DatagramSocket

### Métodos:

#### Cliente y Servidor, Lectura/Escritura: InputStream/OutputStream FIJARSE EN LA CLASE, ej: ServerSocket NO se usa en el cliente

#### Servidor: esperar conexión: accept(), servidorUDP: new DatagramSocket(puerto?), paquete UDP: new DatagramPacket(byte[] buffer, int length)



