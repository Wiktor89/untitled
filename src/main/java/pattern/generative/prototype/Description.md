#Описание Prototype

####Шаблон Prototype позволяет создавать новые объекты на основе некоторого объекта-прототипа при этом совсем не обязательно знать как необходимый объект устроен.

###Применение

* **если создание объектов (через оператор new) занимает длительный промежуток времени или требовательно к памяти;**
* **если создание объектов для клиента является нетривиальной задачей, например, когда объект составной;**
* **избежать множества фабрик для создания конкретных экземпляров классов;**
* **если клиент не знает специфики создания объекта.**

