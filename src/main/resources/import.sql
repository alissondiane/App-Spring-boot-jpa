INSERT INTO clientes(id,nombre,apellido,email,create_at,foto) VALUES(1,'Andres','Guzman','profesor@bolsaideas.com','2017-08-24','');
INSERT INTO clientes(id,nombre,apellido,email,create_at,foto) VALUES(2,'John','Doe','john@bolsaideas.com','2017-08-28','');
INSERT INTO clientes(id,nombre,apellido,email,create_at,foto) VALUES(3,'John','Doe','john@bolsaideas.com','2017-08-28','');
INSERT INTO clientes(id,nombre,apellido,email,create_at,foto) VALUES(4,'John','Doe','john@bolsaideas.com','2017-08-28','');
INSERT INTO clientes(id,nombre,apellido,email,create_at,foto) VALUES(5,'John','Doe','john@bolsaideas.com','2017-08-28','');
INSERT INTO clientes(id,nombre,apellido,email,create_at,foto) VALUES(6,'John','Doe','john@bolsaideas.com','2017-08-28','');
INSERT INTO clientes(id,nombre,apellido,email,create_at,foto) VALUES(7,'John','Doe','john@bolsaideas.com','2017-08-28','');
INSERT INTO clientes(id,nombre,apellido,email,create_at,foto) VALUES(8,'Andres','Guzman','profesor@bolsaideas.com','2017-08-24','');
INSERT INTO clientes(id,nombre,apellido,email,create_at,foto) VALUES(9,'John','Doe','john@bolsaideas.com','2017-08-28','');
INSERT INTO clientes(id,nombre,apellido,email,create_at,foto) VALUES(10,'John','Doe','john@bolsaideas.com','2017-08-28','');
INSERT INTO clientes(id,nombre,apellido,email,create_at,foto) VALUES(11,'John','Doe','john@bolsaideas.com','2017-08-28','');


/*POPULATE TABLE PRODUCTS*/

INSERT INTO productos (nombre,precio,create_at) VALUES ('Panasonic Pantalla LCD', 25990, NOW());
INSERT INTO productos (nombre,precio,create_at) VALUES ('Sony Camara digital DSC-W328B', 12345, NOW());
INSERT INTO productos (nombre,precio,create_at) VALUES ('Apple iPod shuffle', 149999, NOW());
INSERT INTO productos (nombre,precio,create_at) VALUES ('Sony Notebook z110', 37990, NOW());
INSERT INTO productos (nombre,precio,create_at) VALUES ('Hewlett Packard Multifuncional F2280', 69990, NOW());
INSERT INTO productos (nombre,precio,create_at) VALUES ('Bianhi Bicicleta Aro 26', 6900, NOW());
INSERT INTO productos (nombre,precio,create_at) VALUES ('Mica Comoda 5 cajones', 29999, NOW());

/*Insertar facturas*/
INSERT INTO facturas(descripcion, observacion,cliente_id,create_at) VALUES ('Factura equipos de oficina',null,1,NOW());
INSERT INTO facturas_items(cantidad, factura_id,producto_id) VALUES (1,1,1);
INSERT INTO facturas_items(cantidad, factura_id,producto_id) VALUES (2,1,4);
INSERT INTO facturas_items(cantidad, factura_id,producto_id) VALUES (1,1,5);
INSERT INTO facturas_items(cantidad, factura_id,producto_id) VALUES (1,1,7);

INSERT INTO facturas(descripcion, observacion,cliente_id,create_at) VALUES ('Factura Bicicleta','Alguna nota importante',1,NOW());
INSERT INTO facturas_items(cantidad, factura_id,producto_id) VALUES (1,2,6);



