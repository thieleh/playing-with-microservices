# GitHub, Twitter, e Integração #

### GitHub
1. Na raiz do projeto utilizar o comando: `./gradlew wrapper` 
2. Em seguida utilizar o comando: `./gradlew clean build` para gerar o arquivo github.jar
3. Criar a docker image do projeto usando o comando: `docker build -t github .`
4. Com a imagem criada, utilizar o comando: `docker run -p 8080:8080 -d github`
5. Para acessar a aplicação: http://localhost:8080/github/{githubUser}
6. Para pausar a aplicação:`docker stop <container-id>`

### Twitter
1. Na raiz do projeto utilizar o comando: `./gradlew wrapper`
2. Em seguida utilizar o comando: `./gradlew clean build` para gerar o arquivo twitter.jar
3. Criar a docker image do projeto usando o comando: `docker build -t twitter .`
4. Com a imagem criada, utilizar o comando: `docker run -p 8081:8081 -d twitter`
5. Para acessar a aplicação: http://localhost:8082/twitter/{twitterUser}
6. Para pausar a aplicação:`docker stop <container-id>`

### Integração
1. Na raiz do projeto utilizar o comando: `./gradlew wrapper` 
2. Em seguida utilizar o comando: `./gradlew clean build` para gerar o arquivo twittergithub.jar
3. Para que tudo funcione, as portas anteriores precisam estar abertas, rodando.
4. Criar a docker image do projeto usando o comando: `docker build -t twittergithub .`
5. Com a imagem criada, utilizar o comando: `docker run -p 8085:8085 -d twittergithub`
6. Para acessar a aplicação: http://localhost:8085/counter/twitter/{thieleh}/github/{ilegra}
7. Para pausar a aplicação:`docker stop <container-id>`

## Observação
* foi utilizado o Docker, portanto, é necessário que ele já esteja previamente instalado.
