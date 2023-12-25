# logging-demo

SpringBoot + Cloud Loggingのサンプル

## 使い方

.env.exampleをコピーし、.envを作成

```
cp .env.example .env
```

.envの変数を設定し、起動する  
以下のリクエストを実行し、指定のプロジェクトのCloud Loggingに出力されれば成功

```
curl http://localhost:8080/demo
```
