# Homework_Shablons_4
В данном проекте реализован прототип заказа продуктов из магазинов с корзиной пользователя и с списком продуктов.
# Магические числа
В работе использовался размер массива вычисляемый, там где это нужно было в циклах, вместо определенного числа количества элементов
# DRY
Все возможные повторяющиеся куски кода были выделены в отдельные методы
# SOLID
## S
Были использованос создание различных классов функциональности ChoosingShop, ChoosingBasket, ChoosingTasksInShop, чтоб не раздувать класс Main.
## O
Поля в классах сделаны private, а доступ к значениям и полям осуществлены через методы
## L
Класс Product наследует Different так как это класс расширения продукта. 
## I
## D
Были созданы интерфейсы для удобства и разделения на небольшие части.
