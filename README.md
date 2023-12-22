# Небольшой учебный http проект

## API

Для отправки запросов использовал [dummyapi](https://dummyapi.io/)

> [!IMPORTANT]
> Связано это с тем, что лектор использовал уже не работающий API.

## Dependencies

Использовал com.squareup.retrofit2 ([retrofit](https://mvnrepository.com/artifact/com.squareup.retrofit2/retrofit) и [converter-gson](https://mvnrepository.com/artifact/com.squareup.retrofit2/converter-gson))

## Что может делать приложение?
- Выгружать список случайных пользователей
- Создавать своих пользователей
- Смотреть список своих пользователей
- Удалять пользователей

## Навигация по приложению
Для навигации по функциям приложения реализован класс AppView и его наследники. Приложение консольное, навигация с помощью клавиатуры и Сканнера

## Packages
### app
Здесь хранится 2 класса:
- AppBuilder - класс для инициализации всех меню и запуска программы
- MainApp - класс, где создает retrofit и запускаем программу
### data_sources
Здесь хранится интерфейс ReceiverApiDataSource. Тут объявлены методы для взаимодействия с API.
#### Методы
- Call<UserModel> listReceivers(int page, int limit) - задаем кол-во страниц и кол-во пользователей на одной странице - запрос в API делаем с помощью GET
- Call<UserModel> listCreatedReceivers(int createdFlag) - выводим всех ранее созданных нами пользователей (createdFlag - по умолчанию 1 согласно документации к API), метод: GET
- Call<UserDetail> createUser(UserDto dto) - создаем объект-пользователя, далее отправляем его на сервер. Если что-то пошло не так - пишем об этом пользователю, метод: POST
- Call<ResponseBody> deleteUser(String id) - удаляем пользователя по ID, метод: DELETE
### domain
Здесь хранится ReceiverService, в котором реализованы методы из ReceiverApiDataSource.
### dto
Отдельный пакет для хранения user_dto для отправки POST запросов при создании нового пользователя
### models
Здесь хранится UserModel, который включает в себя список UserDetail. (Если кратко - получаем данные из API в ввиде массива JSON-ов, записываем это все в UserModel, а далее заполняем в UserModel список отдельных USERов
### views
Пакет для хранения всех меню и подменю

