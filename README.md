# Conversor de Moneda 💱

Este es un proyecto de consola en Java que permite convertir montos entre diferentes monedas utilizando tasas de cambio obtenidas en tiempo real desde una API.

## 🚀 Características

- Interfaz de consola simple y amigable.
- Conversión entre múltiples monedas (USD, EUR, ARS, etc.).
- Validación de entradas.
- Integración con un servicio externo para obtener tasas de cambio actualizadas.
- Soporte para múltiples conversiones en una sola ejecución.

## 🛠️ Tecnologías utilizadas

- Java 8 o superior
- API externa para tasas de cambio (ej: [ExchangeRate API](https://www.exchangerate-api.com/) o similar)
- `Scanner` para entrada de usuario
- Programación orientada a objetos

## 📁 Estructura del proyecto
│
├── src/
│ ├── com.devbernal.challengeconversor/
│ │ ├── Principal.java # Clase principal que gestiona la lógica de consola
│ │ ├── APIService.java # Encargada de conectar con la API y obtener tasas
│ │ └── Divisa.java # Enum con las monedas disponibles
│

## ▶️ Cómo ejecutar el proyecto

1. Clona el repositorio:
   ```bash
   git clone https://github.com/tu-usuario/nombre-del-repo.git

💡 Ejemplo de uso
=== Conversor de Moneda ===
Monedas disponibles:
- ARS
- BOB
- BRL
- CLP
- COP
- USD

Ingrese la moneda origen (ej: USD): USD
Ingrese la moneda destino (ej: ARS): EUR
Ingrese la cantidad a convertir: 100
100.00 USD = 92.35 EUR

¿Desea hacer otra conversión? (s/n): n

