# 🐱‍👤 Pokemon Spring Client

<img width="558" height="308" alt="image" src="https://github.com/user-attachments/assets/c8d0a44d-a5b0-474b-bdd9-cb6b5010880e" />
<img width="555" height="203" alt="image" src="https://github.com/user-attachments/assets/54a67a8e-c264-41b6-a01b-97865669c3e5" />


 
Aplicación web desarrollada con **Spring Boot** que consume la **PokéAPI** para consultar información de Pokémon por nombre o ID.  
El proyecto está enfocado en el aprendizaje de consumo de APIs REST, arquitectura en capas, Thymeleaf y testing con Mockito.
 
---
 
## 🚀 Tecnologías utilizadas
 
- Java 17+
- Spring Boot
- Spring MVC
- Spring WebClient
- Thymeleaf
- Maven
- JUnit 5
- Mockito
- HTML / CSS
 
---
 
## 📌 Funcionalidades
 
- Búsqueda de Pokémon por **nombre** o **ID**
- Consumo de API REST externa (PokéAPI)
- Renderizado dinámico con Thymeleaf
- Manejo de errores cuando el Pokémon no existe
- Visualización de:
  - Nombre
  - Imagen
  - Tipos
  - Altura y peso
- Estilos básicos con tarjetas
- Tests unitarios para la capa de servicio
 
---
 
## 🧱 Arquitectura del proyecto
 
El proyecto sigue una arquitectura en capas:


Controller -> Service -> Cliente API -> API Externa

- **Controller**: Maneja las peticiones HTTP y la navegación
- **Service**: Contiene la lógica de negocio
- **Cliente API**: Encapsula el consumo de la PokéAPI
- **Model**: Representa los datos del Pokémon
 
---
 
## 🧪 Testing
 
Se implementaron tests unitarios enfocados únicamente en la lógica del proyecto:
 
- Test de contexto para verificar que la aplicación levanta correctamente
- Test unitario del servicio usando Mockito
- Test de manejo de errores (excepciones)
 
> No se testea la API externa ni las vistas, siguiendo buenas prácticas.
 
---
 
## ▶️ Cómo ejecutar el proyecto
 
### 1️⃣ Clonar el repositorio
```bash
git clone https://github.com/tu-usuario/pokemon-spring-client.git
```

### 2️⃣ Entrar al proyecto
```bash
cd pokemon-spring-client
```

### 3️⃣ Ejecutar la aplicación
```bash
mvn spring-boot:run
```

### 4️⃣ Abrir en el navegador
```bash
http://localhost:8080
```

### 4️⃣ Abrir en el navegador
```bash
http://localhost:8080
```

### 🧪 Ejecutar los tests
```bash
mvn test
```
