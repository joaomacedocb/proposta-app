📄 Microserviço de Propostas

Este repositório contém o microserviço responsável por capturar e armazenar propostas, que serão futuramente analisadas por um serviço secundário. A aplicação foi desenvolvida utilizando Java com Spring e faz uso de RabbitMQ para mensageria.

📌 Funcionalidades Principais

Captura de propostas: Recebe dados das propostas enviadas pelo front-end.

Persistência: Armazena as propostas em banco de dados para processamento futuro.

Mensageria: Envia mensagens sobre as propostas para outros serviços utilizando RabbitMQ.

🛠️ Tecnologias Utilizadas

Java: Linguagem principal para o desenvolvimento do back-end.

Spring Framework: Base para criação de APIs REST.

RabbitMQ: Ferramenta de mensageria para integração assíncrona entre serviços.

Banco de Dados Relacional: Para armazenamento das propostas.

🌐 Front-End

O front-end deste projeto foi desenvolvido separadamente utilizando Angular. O repositório do front-end está disponível em outro local.

🔄 Fluxo de Funcionamento

As propostas são recebidas via requisições REST pelo microserviço.

As informações são armazenadas no banco de dados para consulta e análise futura.

Mensagens relacionadas às propostas são enviadas para uma fila no RabbitMQ, permitindo que outros serviços processem os dados de forma assíncrona.

📬 Contato

Para mais informações ou dúvidas, entre em contato com o responsável pelo projeto.
