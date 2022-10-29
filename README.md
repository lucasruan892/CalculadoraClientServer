# Calculadora Distribuída

## 1. Descrição do Projeto
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Trata se de um Projeto de uma calculadora, que utliza as 4 operações básicas e faz execução
das operações com dois operandos, utlizando o modelo de cliente/servidor, com os conceitos
obtidos na matéria de Sistemas Distribuídos.
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

## 2. Como Executar
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Para executar o  projeto, primeiro deve executar o Servidor (SimpleJavaServer.java)
e depois executar o cliente (SimpleJavaClient.java), 
e por fim digitar na linha de comando a operação desejada como mostra no Tópico 4.
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

## 3. Protocolo utilizado
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Foi ulizizado ulizado para desenvolvimento a ferramenta IDE Intellij;
A linguagem de programação utilizada foi o JAVA;
Foi usado a Porta: 9999 para o servidor e Host do cliente: 127.0.0.1;
Para utlizar a Calculadora o usuário deve digitar um número, o operando e o segundo número,
como mostra no Tópico 4, somente dois números pelo fato de so calcular dois números,
onde entre os números e os operandos pode conter ou não espaços, esses números e o
operando são enviados para o Servidor, onde la no servidoro eles são armazenados em um vetor,
o operando é separado dos números e é feito o cálculo de acordo com o operando enviado pelo cliente,
depois de ter calculado no servidor, é enviado de volta o resultado ao cliente.
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

## 4. Operações
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Soma: n1 + n2
Subtração: n1 - n2
Multiplicação: n1 * n2
Divisão: n1 / n2
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
