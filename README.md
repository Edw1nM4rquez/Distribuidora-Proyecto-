# Práctica de laboratorio 03 - EJB - JSF - JPA

# Versiones

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)
                                                                                                     
                                                                                                    
 - Intellij idea ultimate 2020.01
 - Java=JavaSE-1.8
- GlassFish=5.0.1   

# Actividades

-   Implementar y diseñar un sistema empresarial para la facturación de una
    bodega usando JEE, JSF, EJB y JPA.

-   Desarrollar un sistema empresarial implementando Servicis Web.

-   Alojar un sistema empresarial en la nube con técnicas de integración
    continua.

# Diagrama Entidad-Relación

![](media/591bbe7420e36f84a2172d80e41872d2.jpg)

>   Captura de pantalla de un celular Descripción generada automáticamente

1.  Sección privada

-   Inicio de sesión con rol administrador

![](media/4e81519a5a4e6640dbdcf5af63b38343.png)

-   Ingresamos con el correo <evelynpintado23@gmail.com> que tiene asignado un
    rol 1 que en nuestra base de datos es el rol de administrador.

![](media/27ab5060992d5fbe88050d46f04cd209.png)

-   Perfil de casa de administrador

![](media/ff2ff20735280927c479526cf722a665.png)

-   Gestión bodegas (inventario general)

![](media/050c2d4c9487ed924ccd6c3c169e71e8.png)

-   Gestión productos (aumentar stock por bodega)

![](media/ae7e218c984afdfdd5c0bd721da62b87.png)

![](media/65c90997596dd989fb4cf5ddeb29b866.png)

-   Gestión productos por bodega (inventario por bodega)

![](media/c99ebec79e76f8945b7ba70a0759f940.png)

1.  Sección pública

-   De la misma forma para la sección pública obtenemos el correo de un empleado

>   <edwinFerML19@gmail.com> que tiene un código 2 en su rol en la base de
>   datos.

![](media/512a079c7fc2b7fa69a68580ac33d4d7.png)

-   Pagina de Inicio para los vendedores

![](media/bc91d54110b56a8e1d26d1443ada7701.png)

-   Gestión clientes

![](media/98d74496d10825f96db22e177b0a61b0.png)

![](media/0af952be04150847b34102e7e060bd26.png)

![](media/f7c377899d450d126db88042179b1ea2.png)

-   Gestión facturas (disminuir stock, anulación facturas, búsqueda de facturas)

-   Las siguientes imágenes muestran el funcionamiento de la facturación de la
    aplicación

-   Para realizar las facturas obtenemos tanto al cliente como el producto del
    que se va a realizar la factura con su respectiva forma de pago.

![](media/4824c83c4ca07934e5ebd9180ecb8e7b.png)

![](media/65e026da8b644584486824e79c7997a8.png)

![](media/d907ce9e799f099040f04e9699a34745.png)

-   Y obtenemos una lista de facturas que ya han sido emitidas.

![](media/f693ebc9d88a214389ebf66dc8047c3c.png)

3.Seguridad

-   Sesiones

-   En cada una de las paginas se validaron el rol que tiene cada usuario para
    así permitirle o no realizar cierto tipo de cosas.

![](media/ff92d3c9019f62a63b274e209fd94857.png)

-   Reglas de navegación

Para las reglas de navegación tenemos el error con las paginas no encontradas
con el error 404 mientras que con el error 505 nos aseguramos de que la version
HTTP sea soportada por el servidor.

![](media/8f31df8850d1eb5fed63091b9cf96491.png)

![](media/a3e2a08713400810aa4694135a9d6adc.png)

1.  Gestión Pedidos

-   Listar productos del catálogo organizado por categorías

-   Enviar la solicitud de un pedido a la distribuidora

-   Estados pedido clientes

-   Estados: Enviado, Receptado, En proceso, En camino, Finalizado

1.  Gestión cuentas clientes

-   Comprobación de que cada componente fue creado por separado

![](media/00d785a8f83189194d0cbc21d0774692.png)

![](media/98d57911a46600aae57d088c219e7537.png)

-   Iniciar Sesión

-   Registrar cuenta en base a la cédula

-   Modificar datos cuenta y cliente

-   Anular cuenta del cliente

-   Si el cliente no se encuentra registrado en la base de datos no podrá
    registrarse

-   Registró en base a la cédula

1.  Github Actions

a. Implementación del flujo de trabajo “Java CI with Maven”

1.  Microsoft Azure

b. Desplegar la solución en una instancia para que el sistema de distribuidora
UPS accesible desde un servidor alojado en la nube

1.  Jenkins

c. Configuración el servidor de CI para que exista un cambio en el repositorio
master de Github.

![](media/c4f7a449a338f82b9896d8e685419267.png)

-   Implementación en el Github

![](media/00d093c514c6adbc5c1d1d24315a3d58.png)

-   Repositorios Utilizados:

<https://github.com/dguzmanc4/DistribuidoraJSF.git>

-   **Se ha implementado con éxito la practica EJB, JSF y JPA pero a pesar de
    eso se tuvieron problemas para el desarrollo completo y correcto de la
    practica Angular por el conocimiento base de la herramienta, lo que nos
    llevo a una investigación y retro alimentación para su implementación. El
    IDE utilizado para este proyecto resulto ser el adecuado, pero se tuvieron
    complicaciones con el servidor Glassfish lo que hiso que esta practica se
    tardará mas de lo esperado.**

-   **Para el desarrollo gráfico de la interfaz es mucho más sencillo utilizar
    plantillas, eso ahorrara tiempo; también cuando se desarrolle la aplicación
    en java con el servidor glassfish, es recomendable revisar todos los cambios
    que se van a realizar antes porque por el mínimo error, tendrá que volver a
    correr el servidor y esperar mas tiempo.**

**Nombre de estudiante:**

-   **Daniel Guzmán**

-   **Edwin Marquez**

-   **Evelyn Pintado Ch.**

-   **Christian Yunga**
