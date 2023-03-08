# MS-Notification

> Aplicação responsável por enviar notificações para diversos canais (SMS, WhatsApp, Email).

[![Java Version][java-image]][java-url]
[![Spring Version][spring-image]][spring-url]

## Configuração de Desenvolvimento

### Build

Para fazer o build da aplicação deve ser executado o seguinte comando.

```sh
mvn clean install -U
```

### Executar

#### Intellij

No diretório raiz do projeto crie um novo diretório chamado __.run__, dentro deste novo diretório deve ser criado o arquivo __launch.run.xml__ com as configurações abaixo.

```xml
<component name="ProjectRunConfigurationManager">
    <configuration default="false" name="Launch Application - API" type="Application" factoryName="Application">
        <envs>
            <env name="SPRING_PROFILES_ACTIVE" value="local" />
        </envs>
        <option name="MAIN_CLASS_NAME" value="br.com.medelo.notification.api.Application" />
        <module name="notification-api" />
        <method v="2">
            <option name="Make" enabled="true" />
        </method>
    </configuration>
    <configuration default="false" name="Launch Application - Processor" type="Application" factoryName="Application">
        <envs>
            <env name="SPRING_PROFILES_ACTIVE" value="local" />
        </envs>
        <option name="MAIN_CLASS_NAME" value="br.com.medelo.notification.processor.Application" />
        <module name="notification-processor" />
        <method v="2">
            <option name="Make" enabled="true" />
        </method>
    </configuration>
</component>
```

Para que essa configuração fique disponível menu de execução deve ser feito um build (CRTL+F9) do projeto.

#### Visual Studio Code

No diretório raiz do projeto crie um novo diretório chamado __.vscode__, dentro deste novo diretório deve ser criado o arquivo __launch.json__ com as configurações abaixo.

```json
{
  "version": "0.2.0",
  "configurations": [
    {
      "type": "java",
      "name": "Launch Application - API",
      "request": "launch",
      "cwd": "${workspaceFolder}",
      "console": "internalConsole",
      "mainClass": "br.com.medelo.notification.api.Application",
      "projectName": "notification-api",
      "env": { "SPRING_PROFILES_ACTIVE": "local" }
    },
    {
      "type": "java",
      "name": "Launch Application - Processor",
      "request": "launch",
      "cwd": "${workspaceFolder}",
      "console": "internalConsole",
      "mainClass": "br.com.medelo.notification.processor.Application",
      "projectName": "notification-processor",
      "env": { "SPRING_PROFILES_ACTIVE": "local" }
    }
  ]
}
```

## Documentação

[Página do Projeto no Confluence][confluence]

<!-- Markdown link & img dfn's -->
[java-image]: https://img.shields.io/badge/Java-v17-green
[spring-image]: https://img.shields.io/badge/Spring--Boot-v2.7.9-green
[java-url]: https://docs.oracle.com/en/java/javase/17/
[spring-url]: https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-dependencies/2.7.9
[confluence]: 