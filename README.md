gradle
======
<p>
gradle项目架构搭建自动化
<p>
运行环境需要
<p>
jdk环境变量
<p>
运行java -v 可显示jdk版本即可
<p>
修改src/haedrig/scripts/setenv.bat里面的环境变量配置
<p>
执行src/haedrig/scripts/init.bat等执行完毕后执行eclipse.bat项目自动build完成
<p>
并且自动启动eclipse和导入src\haedrig下haedrig-api，haedrig-java,haedrig-web和下载所有jar包
<p>
src\haedrig\haedrig-web\scripts下
<p>
gradle-build.bat 打包项目
<p>
gradle-eclipse.bat 打包并把jar导入eclipse
<p>
gradle-jettyRun.bat 使用jetty运行项目
