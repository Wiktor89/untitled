#Описание Singleton

####В приложении экземпляр определённого класса должен присутствовать гарантировано в одном экземпляре.

####Определяет интерфейс для создания объекта, но оставляет подклассам решение о том, какой класс инстанцировать. Фабричный метод позволяет классу делегировать создание подклассов. Используется, когда: По сути создаётся статический экземпляр класса: защищённый от клонирования, обычного инстанцирования через конструктор, и других способов получения ссылки на единственный экземпляр — кроме статического метода-конструктора.

