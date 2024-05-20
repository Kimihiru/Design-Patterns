## 单例
## 意图
保证一个类仅有一个实例，并提供一个访问它的全局访问点。


### 适用于

* 当类只能有一个实例并且客户可以通过一个众所周知的访问点访问它时。
* 当这个唯一实例应该是通过子类化可扩展的，并且客户无需更改代码就能使用一个扩展的实例时。