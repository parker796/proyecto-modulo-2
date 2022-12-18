## Introduccion
Proyecto finalizado agregue este readmed que tenia del postwork 4 porque ya no lo quite del codigo de mi proyecto se lo deje. Ya no mas se agrego lo de la sesion 8 lombok, mapstruct y jms

## Desarrollo
Para correr el proyecto necesitamos el archivo docker-compose.yml para ver la parte del JMS con rabbitMQ que viene integrado en el proyecto principal que es TiendaComputadoras. Ya bajado el archivo en su maquina local corremos con sudo docker compose up no importa la ruta donde este. ya corriendo la imagen que se nos baje ahora si corremos el proyecto. para ver esa parte del funcionamiento del JMS, igual necesitamos correr el consumer para ver lo que nos manda el otro proyecto.  Igual lo que tiene mis API que en este caso fueron dos controladores para guardar componentes fisicos de equipos de computadoras en una BD que igual viene ahi mismo que es Tienda.sql la cual no es necesaria solo se necesita la creacion de la BD, porque JPA ya nos genera las tablas o entidades. ya no mas es jugar con las apis para insertar datos eliminar etc. Y los puntos que nos marca la rubrica vienen cubiertos en el codigo.


## Analisis de identificacion de beans y uso de inyeccion de dependencas

Los beans que identifique fueron dos una de clase Persona y otro clase de Component_Product y las utilize igual para realizar una inyeccion de dependencia en Spring

## Justificacion
Utilice un bean persona porque puedo utilizarlo como el nombre del cliente que me solicita un producto o el nombre del que lo atiende e utilice una inyeccion de dependencias para que por cada cliente que se vaya solicitando otro pedido se vaya inyectando. el del component product igual lo elegi porque si el cliente desea agregar otro componente en su pedido lo puede hacer dandonos el nombre y la marca de ese componente e inyectarlo para realizar ese pedido.


