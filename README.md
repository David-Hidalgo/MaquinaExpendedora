## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## Laboratorio 1- Clases y Objetos

Las estaciones del metro poseen máquinas expendedoras de tickets que ya no funcionan porque
debe desarrollarse nuevamente el software que las controla a fin de actualizarlas. La idea es que
incorpores la programación orientada a objetos en esta nueva etapa.
Una máquina trabaja con clientes que introducen dinero en ella y luego le solicitan que impriman un
boleto. Dicha máquina mantiene un registro de la cantidad de dinero que ha recaudado durante
todo su funcionamiento. Por lo pronto la máquina será sencilla y posteriormente se le incorporarán
nuevas funcionalidades.
Las características más relevantes de la máquina expendedora son: precio del boleto, tipo de
boleto (C: 1-4 estaciones, B: 5-8 estaciones o A: > 8 estaciones), el saldo (cantidad de dinero
ingresada hasta ahora por un cliente) y total recaudado (la cantidad total de dinero recolectada por
la máquina). Es necesario poseer implementadas operaciones que permitan imprimir el boleto y
consultar el precio, el saldo acumulado y el total recaudado así como métodos para actualizar o
modificar la información. También deben existir métodos que permitan imprimir los ingresos por tipo
de boleto e indicar cuál fue el tipo de boleto más comprado. El boleto sólo se imprimirá cuando el
usuario complete el saldo equivalente al precio del boleto.
Las líneas Foráneas tendrán un recargo del 10% sobre el precio estipulado según del tipo de
boleto.
Desarrolla la clase, atributos y métodos que sean necesarios para modelar y simular el
funcionamiento de la máquina expendedora de boletos.