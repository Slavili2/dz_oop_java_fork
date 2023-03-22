﻿# Домашние задания по теме #

# Объектно-ориентированное программирование (семинары) #

### Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм (4 марта 2023г.) ###

Домашнее задание на закрепление:

1. Создать класс Товар, имеющий переменные имя, цена, рейтинг;
2. Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория;
3. Создать класс Basket, содержащий массив купленных товаров;
4. Создать класс User, содержащий логин, пароль и объект класса Basket. Создать несколько объектов класса User;
5. Вывести на консоль каталог продуктов. (все продукты магазина);
6. Вывести на консоль покупки посетителей магазина. (После покупки у пользователя добавляется товар, а из магазина - удаляется).


Решение данной задачи в каталоге **Task001**

### Урок 2. Принципы ООП Абстракция и интерфейсы. Пример проектирования (5 марта 2023г.) ###

Домашнее задание на закрепление :

1. Создайте три класса: Человек, Кот, Робот, которые наследуются от одного класса. Эти классы должны уметь бегать и прыгать, все также с выводом информации о действии в консоль.
2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий. Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.

Решение данной задачи в каталоге **Task002**


### Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования (11 марта 2023г.) ###

Вот полный список доработок по задаче быки - коровы :

1. Доделать вариации с игрой на английском/русском языке, сигнатуры уже приведены в прикрепленном файле;
2. Улучшить интерфейсную часть игры;
3. * Создать историю ходов и по окончании игры вывести её, в зависимости от ответа пользователя (y-вывести, n -выводить не следует).

Решение данной задачи в каталоге **Task003**


### Урок 4. ООП: Обобщения. ч1 (12 марта 2023г.) ###


Актуальное дз:
1. Расширить класс калькулятор на умножение;
2. Расширить класс калькулятор на деление;
3. Расширить класс калькулятор на бинарный перевод(принимаемые значения как стринг, так и инт - тут необходимо подумать как наилучшим образом реализовать, что будет если будут приниматься округляемые Double/Float (округляемые -> с нулем на конце прим. 3.0 , 4.0 и тд т)).

Решение данной задачи в каталоге **Task004**


### Урок 5. От простого к практике (18 марта 2023г.) ###

Задание

1. Создать класс УчебнаяГруппа содержащая в себе поля Преподаватель и список Студентов;
2. Создать класс УчебнаяГруппаСервис, в котором реализована функция(входные параметры - (Teacher, List<Strudent>)) формирования из Студентов и Преподавателя УчебнойГруппы и возвращения его;
3. Создать метод в Контроллере, в котором агрегируются функции получения списка студентов (их id) и преподавателя (его id) и формирования учебной группы, путем вызова метода из сервиса;
4. Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре.

Решение данной задачи в каталоге **Task005**