## 访问者
## 意图：
表示一个作用于某对象结构中的各元素操作。允许在不改变各元素的类的前提下定义作用于这些元素的新操作。


### 适用于

* 一个对象结构包含很多类对象，它们有不同接口，而用户想对这些对象实施一些依赖于其具体类的操作。
* 需要对一个对象结构中的对象进行很多不同的并且不相关的操作，而又想避免污染这些类。
* 定义对象结构的类很少改变，但经常需要在结构上定义新的操作。
