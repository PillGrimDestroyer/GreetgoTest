# GreetgoTest
Simple case for greetgo company

## Перед началом
Обязательно нужно установить maven и прописать его в системную переменную окружения **path**
- Скачать maven можно по этой [ссылке](http://maven.apache.org/download.cgi)
- Далее распаковать архив в любое удомное место
- После прописываем в переменной окружения **path** путь к папке - (путь до maven)/bin

### Инструкция по получению и запуску
1. Скачиваем репозиторий себе на ПК, с помощью команды `git clone https://github.com/PillGrimDestroyer/GreetgoTest.git`
   - Нет Гита? Не беда! переходим по этой [ссылке](https://github.com/PillGrimDestroyer/GreetgoTest), тыкаем **clone or download** --> **Download ZIP**. Качаем и распаковываем
2. Переходим в каталог **GreetgoTest**
3. Выполняем команду `mvn clean package`
   - Это соберёт наш проект
4. Далее, переходим в папку **target** и видим там файл **greetgo-1.0-SNAPSHOT.war**. Это наш проект, который мы и хотим запустить
   - Если есть stand-alone сервер, то можно залить этот файл на него
   - Либо можно запустить его прямо в таком виде, однако предупреждаю! для работы скорее всего нужен будет java jdk
     - Чтобы запустить сервер с этим проектом нужно вернуться в директорию **GreetgoTest** и выполнить команду `mvn jetty:run`
     
### Как взлететь?
Всё просто, для этого нужно
1. Открыть [localhost:9999/greetgo/message/](http://localhost:9999/greetgo/message/) (либо [localhost:9999/greetgo-1.0-SNAPSHOT/message/](http://localhost:9999/greetgo-1.0-SNAPSHOT/message/) если проект был залит на сервер, **без** указания нормального имени) 
2. Не нравится большой, жирный текст? Измени его! для этого вбей в текстовое поле свой текст и нажми на кнопку **Submit**

> Засим всё. Больше тут делать нечего :stuck_out_tongue_winking_eye:
