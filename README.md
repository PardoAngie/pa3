# Sistema de Gestión de Productos

**Curso:** Programación Orientada a Objetos  
**Trabajo:** Proceso de Aprendizaje 3  
**Lenguaje de programación:** Java

## 1. Descripción del proyecto

Este proyecto consiste en desarrollar un sistema básico de gestión de productos utilizando Java.
El programa permite registrar, buscar, eliminar, listar y ordenar productos mediante el uso de `ArrayList`, que forma parte de Java Collections Framework.
Para su desarrollo utilizamos clases, objetos, métodos y colecciones, para de organizar el código y sea eficaz.
El sistema funciona por consola y cuenta con un menú que permite al usuario seleccionar las diferentes operaciones disponibles.

## 2. Integrantes del equipo 08 

- 1  Angie Damaris Evangelista Pardo 
- 2  Jesus Alexander Garcia Flores 
- 3  Misael Yeremi Solis Sanchez 
- 4  Dante Zosimo Alanya Molina
- 5  nom 

## 3. Tecnologías utilizadas

- **Java:** Lenguaje de programación utilizado en el sistema.
- **Programación Orientada a Objetos:** Para organizar el programa mediante clases, atributos y métodos.
- **ArrayList:** Almacenar los productos registrados.
- **Collections:** Trabajar con el ordenamiento de los productos.
- **IntelliJ IDEA:** Entorno de desarrollo utilizado para trabajar con el código Java.

## 4. Estructura del proyecto

El proyecto está organizado en diferentes clases para separar las funciones del sistema para tener un orden claro y encontrar facimente cada pagina.

```text
src/
└── pa3/
    ├── Producto.java
    ├── Inventario.java
    ├── GestorColecciones.java
    ├── Menu.java
    └── Main.java
```

**Descripción de las clases:**

| Clase | Descripción |
|---|---|
| `Producto.java` | Contiene los atributos y métodos relacionados con los productos. |
| `Inventario.java` | Se encarga de gestionar los productos registrados. |
| `GestorColecciones.java` | Permite trabajar con las operaciones de las colecciones. |
| `Menu.java` | Muestra las opciones disponibles para el usuario. |
| `Main.java` | Es la clase principal desde donde se ejecuta el programa. |

## 5. Funcionalidades del sistema

El sistema cuenta con las siguientes opciones:

1. **Listar productos:** Nos muestra todos los productos que se encuentran registrados.
2. **Agregar productos:** Te permite ingresar nuevos productos al inventario.
3. **Buscar productos:** Permite encontrar un producto mediante su código.
4. **Eliminar productos:** Le permite retirar un producto de la lista.
5. **Ordenar productos por precio:** Organiza los productos según su precio de froma ascendente.
6. **Recuperar productos por posición:** Nos permite consultar un producto según su ubicación en el `ArrayList`.

Totas las funciones se crearon para cuando realicemos desde el menú en consola, el usuario puede seleccionar cualquier opcion que dese poner en marcha.

## 6. Almacenamiento de los productos

Donde podemos almacenar los productos se uso una colección de tipo `ArrayList<Producto>` que nos permitio agregar, consultar y eliminar productos sin tener que declarar una cantidad fija de elementos.

Los datos se mantienen en memoria mientras el programa está funcionando. Por este motivo, cuando se cierra el programa, los productos registrados no se guardan de forma permanente.

## 7. Métodos utilizados

Durante el desarrollo del proyecto trabajamos con los siguientes métodos de Java Collections Framework:

| Método | Descripción |
|---|---|
| `add()` | El add agrega un producto a la lista. |
| `get()` | El get te permite obtener un producto según su posición. |
| `remove()` | El remove o remover eliminar un producto. |
| `size()` | El size nos muestra la cantidad de productos registrados. |
| `Collections.sort()` | Permite ordenar los productos por precio utilizando un criterio de comparación. |

## 8. Instrucciones para ejecutar el proyecto

Para ejecutar el programa, se deben seguir estos pasos:

1. Tener instalado Java JDK en la computadora.
2. Abrir IntelliJ IDEA.
3. Abrir la carpeta del proyecto.
4. Ubicar el paquete `pa3` dentro de `src`.
5. Buscar y abrir la clase `Main.java`.
6. Ejecutar el programa desde la clase `Main`.
7. Utilizar el menú de consola para comprobar cada acción.

## 9. Video de exposición

Como parte de la presentación del PA3, realizamos un video donde explica paso apaso la funcion del sistema, las clases utilizadas y las operaciones desarrolladas por todo equipo.

**Enlace del video:** [enlace]

## 10. Registro de cambios en GitHub

Para guardar y subir los cambios realizados al repositorio, utilizamos los siguientes comandos:

```bash
git add src/pa3/Main.java README.md
git commit -m "Integrar sistema y documentar proyecto"
git push
```

# Gracias 
