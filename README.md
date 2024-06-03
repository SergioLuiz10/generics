Eu criei um programa em Java para gerenciar uma lista de produtos e determinar qual produto tem o maior preço. Vou explicar como ele funciona.

Primeiramente, o programa pede ao usuário que insira a quantidade de produtos que deseja adicionar. Para isso, utilizei um Scanner para capturar essa entrada. Como estou lidando com números, adicionei uma verificação para garantir que o usuário insira um número inteiro. Isso evita problemas logo no início.

Depois que o usuário insere a quantidade de produtos, o programa solicita que ele insira o nome e o preço de cada produto, no formato "Nome,Preço". Cada entrada é salva em um arquivo de texto localizado no caminho "c:\Generics\teste.txt". Para escrever as entradas no arquivo, usei um BufferedWriter, garantindo que cada produto seja escrito em uma linha separada.

Após salvar todos os produtos no arquivo, o programa os lê de volta para a memória utilizando um BufferedReader. Ele separa o nome e o preço de cada produto usando a vírgula como delimitador e cria uma lista de objetos da classe One, que eu criei para representar cada produto.

Para determinar qual produto tem o maior preço, utilizei um método genérico max na classe Calcular, que percorre a lista de produtos e retorna aquele com o maior preço. Este método requer que a classe One implemente a interface Comparable<One>, permitindo a comparação dos preços.

Além disso, adicionei tratamento de exceções para lidar com possíveis erros, como entrada inválida do usuário ou problemas na leitura e escrita dos arquivos. Isso garante que o programa seja robusto e possa lidar com situações inesperadas de maneira adequada.

Em resumo, o programa permite ao usuário inserir uma lista de produtos, salva esses produtos em um arquivo, lê os dados de volta e determina qual produto tem o maior preço, exibindo essa informação ao usuário.


--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
I've created a Java program to manage a list of products and determine which product has the highest price. Here's how it works:

Firstly, the program asks the user to input the quantity of products they want to add. I used a Scanner to capture this input, adding validation to ensure the user inputs an integer, avoiding issues from the start.

Once the user inputs the quantity of products, the program prompts them to input the name and price of each product in the format "Name,Price". Each entry is saved in a text file located at "c:\Generics\teste.txt". I used a BufferedWriter to write the entries to the file, ensuring each product is written on a separate line.

After saving all products in the file, the program reads them back into memory using a BufferedReader. It separates the name and price of each product using a comma as the delimiter and creates a list of One objects, which I created to represent each product.

To determine which product has the highest price, I used a generic method called max in the Calcular class. It iterates through the list of products and returns the one with the highest price. This method requires the One class to implement the Comparable<One> interface, enabling price comparison.

Additionally, I added exception handling to deal with possible errors, such as invalid user input or issues with file reading and writing. This ensures the program is robust and can handle unexpected situations appropriately.

In summary, the program allows the user to input a list of products, saves these products to a file, reads the data back, and determines which product has the highest price, displaying this information to the user.
