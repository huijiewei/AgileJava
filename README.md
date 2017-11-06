这是一个 Spring Cloud 的 DDD 演示项目

默认禁用了 JMX Server

Discovery Server 和 Config Server 运行使用参数:

``
-Xms16m -Xmx32m -XX:MaxMetaspaceSize=48m -XX:CompressedClassSpaceSize=8m -Xss256k -Xmn8m -XX:InitialCodeCacheSize=4m -XX:ReservedCodeCacheSize=8m -XX:MaxDirectMemorySize=16m
``

MVC 和 API 项目使用参数:

``
-Xms16m -Xmx48m -XX:MaxMetaspaceSize=64m -XX:CompressedClassSpaceSize=8m -Xss256k -Xmn8m -XX:InitialCodeCacheSize=4m -XX:ReservedCodeCacheSize=8m -XX:MaxDirectMemorySize=16m
``