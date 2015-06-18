# PriceNavigatorCom
Task 3
    Правила
Как составлять тест-дизайн и проектировать фреймворк – полностью ваше дело
Все задания относятся к сайту: pn.com.ua
Навигация на нужную категорию/раздел должна быть выполнена скриптом, начиная со стартовой страницы сайта.
Задания

1.	Написать тест, проверяющий функциональность работы сортировки (по цене и названию) для раздела «Холодильники» (сортировка справа вверху). Навигация в категорию должна быть выполнена со стартовой страницы.
2.	Сравнение товаров. Выбрать 2 первых товара из раздела "микроволновки" и сравнить их. Написать тест, который проверит функциональность сравнения (а именно: все параметры из каждого товара показываются на странице сравнения, а также проверить, что только отличающиеся характеристики выделены цветом)
3.	Проверить функциональность фильтра по цене (мин, макс) для категории "стиральные машины". То есть, убедиться, что этот фильтр работает корректно - показывает все товары, которые должны показаться и не показывает ничего лишнего.
4.	Проверить функциональность фильтра "Производитель" для категории "Хлебопечки". А именно: проверить, что в фильтре предоставлены все производители хлебопечек из существующих на сайте товаров, а также не представлены производители отсутствующих товаров
5.	Проверить корректность работы фильтра «регулировка веса» у хлебопечек, а именно: проверить, что, выбрав наличие функции "регулировка веса" в фильтре, результаты показываются правильно (показываются все товары, у которых есть эта функция, и не показывается ничего лишнего)
6.	Проверить, что информация на странице "информация о товаре" совпадает с информацией, отображающейся в результатах просмотра категории, а также совпадает с информацией из раздела «Прайсы» (для раздела кондиционеров). Проверку делать для 5 первых товаров из категории. Ссылка на раздел «Прайсы» находится чуть выше левого фильтра и называется «Перейти в прайсы». (То есть, есть 3 разных места, где отображается информация о товаре. Нужно убедиться, что везде информация совпадает).