## 模板方法
## 意图：
定义一个操作中的算法骨架，而将一些步骤延迟到子类中。


### 适用于

* 一次性实现一个算法的不变的部分，并将可变的行为留给子类来实现。
* 各子类中公共的行为应被提取出来并集中到一个公共父类中，以避免代码重复。
* 控制子类扩展。
