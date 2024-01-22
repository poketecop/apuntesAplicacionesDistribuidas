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
### Métodos Naming: lookup (buscar), bind (registrar), rebind (reemplazar), unbind (eliminar)
![image](https://github.com/poketecop/apuntesAplicacionesDistribuidas/assets/65861838/b58fddda-bc63-4598-8929-e245cbae6bb0)

![image](https://github.com/poketecop/apuntesAplicacionesDistribuidas/assets/65861838/c9387688-6a37-4ac6-8dfd-1dbf13aa1ebf)


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

### Fallos por omisión: TCP: retransmisión, UDP: pérdida de paquetes

### Puertos: DNS: 53 (TCP/UDP), HTTP: 80, HTTPS: 443, SMTP: 25, POP3: 110, IMAP: 143, FTP: 21

## Paradigmas

### Escalabilidad: Agentes móviles más escalable que cliente-servidor

### Abstracción: LLamada a procedimienos remotos = llamada a métodos remotos

## Sockets

### Servidor: ServerSocket, Socket, DatagramSocket
### Cliente: Socket, DatagramSocket

### Métodos:

#### Cliente y Servidor, Lectura/Escritura: InputStream/OutputStream FIJARSE EN LA CLASE, ej: ServerSocket NO se usa en el cliente

#### Servidor: esperar conexión: accept(), servidorUDP: new DatagramSocket(puerto?), paquete UDP: new DatagramPacket(byte[] buffer, int length)

## CORBA IDL

### Servicios: Trading Service (busquéda de servicios por categoría/tipo), Naming Service (busquéda de objetos por nombre), Event Service (publicación de eventos), Notification Service (suscripción a eventos), Persistent Service (almacenamiento de objetos), Externalization Service (serialización de objetos)

### No se pueden definir de forma explícita clases de objetos.

### Se puede implementar un objeto CORBA en un lenguaje no orientado a objetos.

### IOR: Identificador de objeto remoto, contiene: protocolo, dirección, puerto, identificador de objeto, identificador de interfaz

### Palabras reservadas: interface, module, struct, enum, union, exception, typedef, const, native, valuety

![image](https://github.com/poketecop/apuntesAplicacionesDistribuidas/assets/65861838/f5738041-a6cd-48ce-ad6f-946d0dabedde)

![image](https://github.com/poketecop/apuntesAplicacionesDistribuidas/assets/65861838/4c88db25-d5cc-46c3-ba86-3c39d8ccbd54)

## SOAP

### Estilo de **representación**: RPC, Documento

### types: definición de tipos de datos, message: definición de mensajes, portType: definición de operaciones, binding: definición de protocolo de comunicación, service: definición de servicio

### Cabecera: WS-secuity

## SOA

### Service broker: búsqueda de servicios





