# BoardApp - Gerenciador de Tarefas

## Descrição
BoardApp é uma aplicação Java para gerenciamento de tarefas. O projeto segue as boas práticas de programação, utilizando JDBC para interagir com um banco de dados MySQL.

## Funcionalidades
- Adicionar tarefas com título, descrição e status.
- Listar todas as tarefas armazenadas no banco de dados.
- Estruturado em camadas: **Model**, **DAO**, **Controller** e **View**.

## Tecnologias Utilizadas
- **Java 17**
- **MySQL**
- **JDBC**
- **Apache Maven**

## Estrutura do Projeto
```
BoardApp/
│── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── br/
│   │   │   │   ├── seuprojeto/
│   │   │   │   │   ├── model/
│   │   │   │   │   │   ├── Tarefa.java
│   │   │   │   │   ├── dao/
│   │   │   │   │   │   ├── TarefaDAO.java
│   │   │   │   │   ├── controller/
│   │   │   │   │   │   ├── TarefaController.java
│   │   │   │   │   ├── view/
│   │   │   │   │   │   ├── TarefaView.java
│   │   ├── resources/
│── pom.xml
```

## Configuração do Banco de Dados
1. Abra o MySQL e crie o banco de dados:
   ```sql
   CREATE DATABASE board;
   USE board;
   ```
2. Crie a tabela de tarefas:
   ```sql
   CREATE TABLE tarefas (
       id INT AUTO_INCREMENT PRIMARY KEY,
       titulo VARCHAR(255),
       descricao TEXT,
       status VARCHAR(50),
       dataCriacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP
   );
   ```

## Configuração do Projeto
### Clonar o Repositório
```sh
git clone https://github.com/seuusuario/BoardApp.git
cd BoardApp
```

### Instalar Dependências
```sh
mvn clean install
```

### Executar a Aplicação
```sh
mvn compile exec:java -Dexec.mainClass="br.seuprojeto.view.TarefaView"
```

