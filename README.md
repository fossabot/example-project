构建应用程序
```
cd golang-sample-app/

pack build <app-image-name>:<tag> --builder <builder-image-name>:<tag>
```
运行应用程序
```
docker run -d --name=test-golang-app -p 23456:8000 <app-image-name>:<tag>
```
通过浏览器访问 host_ip:23456 即可访问应用

test
