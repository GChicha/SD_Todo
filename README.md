# TODO Distribuido

## Servidor

```java
addTask(Task)
listTask()
done(id)
```

## Make

```bash
make
```

## Execute

```bash
java ClienteMain  ## For client
## For Server
rmiregistry 1099
java ServidorMain
java ClienteServidor ## For Client-Server
```
