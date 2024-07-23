**The samples in this repo have moved [here](https://github.com/Azure-Samples/azure-spring-boot-samples/tree/main/cosmos/azure-spring-data-cosmos/spring3-samples/cosmos-quickstart-samples). This repo is no longer maintained**.


# Azure Cosmos DB for NoSQL & Spring Data sample

Azure Cosmos DB for NoSQL & Spring Data sample code

## Features

This repo provides basic sample code for getting started with Azure Cosmos DB for NoSQL SQL API using the `azure-spring-data-cosmos` library for Java.

## Getting Started

### Prerequisites

- `Java Development Kit 8` or `JDK 11` if you run the `azure-spring-data-cosmos-java-11-getting-started`. 
- An active Azure Cosmos DB for NoSQL account. If you don't have an Azure subscription, you can sign up for a [free subscription for Azure](https://azure.microsoft.com/free/). 
  - Alternatively, you can use [Try Azure Cosmos DB free](https://cosmos.azure.com/try) for development and testing.
  - As another alternative, you can use the [Azure Cosmos DB emulator](https://docs.microsoft.com/en-us/azure/cosmos-db/local-emulator).
- (Optional) SLF4J is a logging facade.
  - (Optional) [SLF4J binding](http://www.slf4j.org/manual.html) is used to associate a specific logging framework with SLF4J.
- (Optional) Maven.

SLF4J is only needed if you plan to use logging, please also download an SLF4J binding which will link the SLF4J API with the logging implementation of your choice. See the [SLF4J user manual](http://www.slf4j.org/manual.html) for more information.

### GitHub Codespaces

[![Open in GitHub Codespaces](https://github.com/codespaces/badge.svg)](https://github.com/codespaces/new?hide_repo_select=true&ref=main&repo=287104556)

### Quickstart

1. In an empty directory, clone the repository: `git clone https://github.com/Azure-Samples/azure-spring-data-cosmos-java-sql-api-samples.git .`
1. Update the **src/main/resources/application.properties** file with the **uri**, **primary key**, and **secondary key* from your Azure Cosmos DB for NoSQL account.
3. Run the application: `mvn spring-boot:run`

## Resources

Please refer to Spring Data for Azure Cosmos DB for NoSQL [source code](https://github.com/Azure/azure-sdk-for-java/tree/master/sdk/cosmos) for more information.
