# Proyecto de Práctica: (Data Source Layer) en Java con PostgreSQL, Hibernate y Docker

Este es un **proyecto de prueba** desarrollado con el objetivo de implementar y utilizar una capa de acceso a datos en Java, empleando **Hibernate (ORM)** para la interacción con una base de datos PostgreSQL. La base de datos se ejecuta en un contenedor Docker, y los datos se gestionan a través de un programa de consola en Java.
Ojo, esto solo es un proyecto de prueba y practica, no tiene nigun tipo de complejidad.
Su unico proposito es haber utilizado una Capa de fuente de datos en java en forma de practica. 

## 🚀 Tecnologías utilizadas
- Java
- - Hibernate
- Spring boot

## ⚙️ Configuración y Ejecución

### 1️⃣ Clonar el repositorio
```bash
git clone https://github.com/tu-usuario/tu-repositorio.git
cd tu-repositorio
```

### 2️⃣ Levantar PostgreSQL con Docker

Ejecuta el siguiente comando para iniciar la base de datos en un contenedor:
```bash
docker-compose up -d
```

### 4️⃣ Compilar y ejecutar el proyecto

### 5️⃣ Acceder a la consola de PostgreSQL

Si deseas verificar manualmente los datos almacenados en PostgreSQL, puedes acceder a la base de datos con:
```bash
docker exec -it nombre_del_contenedor psql -U usuario -d mi_base_de_datos
```

---

## 📜 Funcionalidades Implementadas

✅ **Guardar usuarios** en la base de datos desde la consola.  
✅ **Listar usuarios** almacenados en PostgreSQL.  
✅ **Menú interactivo en consola** con `Scanner` para interactuar con el usuario.  
✅ **Uso de Hibernate (JPA)** para la persistencia de datos.  
✅ **Docker para la base de datos PostgreSQL**, evitando instalaciones manuales.

---

## 🎮 Uso de la Aplicación

Una vez ejecutado el proyecto, la consola mostrará un **menú interactivo** donde puedes:

1️⃣ **Agregar un usuario** escribiendo su nombre y correo electrónico.  
2️⃣ **Listar todos los usuarios** almacenados en la base de datos.  
3️⃣ **Salir del programa**.


---

## 📌 Notas Finales

Este proyecto fue desarrollado **exclusivamente con fines de aprendizaje y demostración**. No incluye una API REST ni interfaz gráfica, ya que el enfoque está en la **persistencia de datos** en PostgreSQL usando Hibernate y Spring Boot.

---

## 📜 Autor

Desarrollado por Ricardo Collado Rothschild - 2025 🚀

