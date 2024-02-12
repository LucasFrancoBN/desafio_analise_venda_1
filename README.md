# Desafio: Análise de vendas 1
Nesse desafio deve haver a leitura do arquivo .csv contendo uma base de dados de registros de venda, e instanciar na memória uma lista de objetos do tipo Sale, conforme diagrama de classe UML. As regras do desafio são:

1. **Cinco primeiras vendas de 2016 de maior preço médio, ordernadas decrescentemente por preço médio.**
2. **Valor total vendido pelo vendedor Logan nos meses 1 e 7 de qualquer ano.**
3. **Fazer o tratemento de exceções caso o usuário digite um caminho inválido para o arquivo .csv**
4. **Link do arquivo .csv: [Clique aqui](https://gist.github.com/acenelio/e4e169691ee5aef2c56c87bc22a54379)**
5. **Diagrama de classe UML:**

   ![Diagrama de classe](https://github.com/LucasFrancoBN/desafio_analise_venda_1/blob/master/img/diagrama_classe.png)

## Exemplo 1
```plaintext
Entre o caminho do arquivo: c:\temp\in.csv

Cinco primeiras vendas de 2016 de maior preço médio
9/2016, Kal-El, 23, 20530.29, pm = 892.62
7/2016, Kal-El, 20, 17126.62, pm = 856.33
3/2016, Kal-El, 25, 21099.27, pm = 843.97
6/2016, Padme Amidala, 25, 16429.74, pm = 657.19
1/2016, Logan, 12, 7625.55, pm = 635.46

Valor total vendido pelo vendedor Logan nos meses 1 e 7 = 45357.42
```
## Exemplo 2
```plaintext
Entre o caminho do arquivo: c:\temp\in
Erro: c:\temp\in (O sistema não pode encontrar o arquivo especificado)
```

## Ferramentas
Desafio desenvolvido utilizando a linguagem Java e a IDE Intellij Community.


## Instruções de Uso
Antes de prosseguir com as instruções de uso, é requerido que você tenha em sua máquina o Java 20 e o git.

### Instalação
Antes de tudo, recomendo que você, pelo terminal, navegue até o diretório Desktop e rode o comando
```bash
# Clone o repositório
git clone https://github.com/LucasFrancoBN/desafio_analise_venda_1.git

# Acesse o diretório da classe Program
cd desafio_analise_venda_1/src/application
```
Agora basta você digitar no seu terminal
```bash
# Compile o projeto
javac Program.java ../entities/Sale.java ../services/SaleService.java
```
Retroceda ao diretório src e compile o programa
```
# Retroceda ao diretório src
cd ../

# Execute o programa
java application.Program
```
