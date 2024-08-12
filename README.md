# Computer Store Backend

## Описание
Этот проект представляет собой базовую реализацию бэкенда для магазина компьютеров, предоставляющего API для управления товарами. Проект построен на основе Spring Boot и использует H2 в качестве базы данных.

## Технологии
- Java 11
- Spring Boot 2.7.5
- Spring Data JPA
- H2 Database
- Maven

## Запуск проекта

### 1. Клонирование репозитория
Клонируйте репозиторий на локальную машину:

git clone <URL вашего репозитория>
cd computer-store-backend


### 2. Сборка и запуск приложения
Используйте Maven для сборки и запуска приложения:

mvn clean install
mvn spring-boot:run
### 3 Доступ к H2 консоли
После запуска приложения, H2 консоль будет доступна по следующему адресу:

URL: http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:testdb
User Name: niktunk
Password: niktunk
### 4. Доступ к API
API будет доступен по адресу: http://localhost:8080/products.

### 5. Примеры API запросов
Добавить продукт: POST /products
{
    "serialNumber": "SN123",
    "manufacturer": "Manufacturer A",
    "price": 500.00,
    "stockQuantity": 10,
    "productType": "Desktop",
    "formFactor": "desktop"
}

Обновить продукт: PUT /products/{id}
{
    "serialNumber": "SN123",
    "manufacturer": "Manufacturer B",
    "price": 550.00,
    "stockQuantity": 15,
    "productType": "Desktop",
    "formFactor": "desktop"
}

Получить все продукты: GET /products

Получить продукт по ID: GET /products/{id}

## Структура проекта
controller: Содержит REST-контроллеры для обработки HTTP-запросов.
model: Содержит сущности JPA, представляющие продукты.
repository: Содержит репозитории для доступа к данным.
service: Содержит бизнес-логику приложения.
exception: Содержит классы для обработки исключений.
resources: Содержит конфигурационные файлы и SQL-скрипты.
## Скрипты базы данных
schema.sql: Скрипт для создания таблиц.
data.sql: Скрипт для начального заполнения базы данных.
## Примечание
Проект предоставляет базовый функционал, который может быть расширен для поддержания более сложных сценариев, таких как управление заказами, пользователями и т.д.

