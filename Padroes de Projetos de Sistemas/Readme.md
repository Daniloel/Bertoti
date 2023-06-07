# Readme dos Padrões de Projetos
<body>
  <table border="1" width="500">
	<thead>
	 <tr>
		 <th scope="col"> <h2>Padrões</h2></th>
		 <th scope="col"> <h1>Anti-Padrões</h1></th>
		 <th scope="col"> <h1>Descrição</h1></th>
		 <th scope="col"> <h1>Porque Utilizar</h1></th>			  
	 </tr>
        <tr>
		 <th scope="col">Estratégia</th>
		 <th scope="col"> Herança </th>
		 <th scope="col"> <p align="justify">
					 O padrão de projeto Strategy é um padrão de projeto comportamental que permite que você defina uma família de algoritmos,
					 colocados  em classes separadas e objetos intercambiáveis. Em outras palavras, o padrão Strategy é usado para
					 definir uma família de algoritmos, encapsular cada um deles e torná-los intercambiáveis. O padrão Strategy permite que o 
					 algoritmo varie independentemente dos clientes que o usam.
			   </p> 
		   </th> 
		 <th scope="col"> Polimorfismo  </th>  
	 </tr>   
       <tr>
		 <th scope="col">Facade</th>
             <th scope="col"> <p align="justify"> Uma fachada pode se tornar um objeto total acoplado a todas as classes de uma aplicação
 </p></th> 
		 <th scope="col">
		 <p align="justify"> O padrão de projeto Facade é um padrão de projeto estrutural que fornece uma interface simplificada para um sistema complexo de classes, biblioteca ou                  framework.  Ele diminui a complexidade geral do aplicativo e ajuda a mover dependências indesejadas para um só local.Em outras palavras, o Facade é uma interface que esconde
		 a complexidade do sistema e fornece uma maneira fácil de acessá-lo </p>
		 </th>
		 <th scope="col"> <p align="justify">  Você pode isolar seu código da complexidade de um subsistema.
 </p></th>
		 </tr>     
            <tr>
		 <th scope="col">Observer</th>
             <th scope="col"> <p align="justify">Assinantes são notificados em ordem aleatória
			  </p>   </th>    
		 <th scope="col">
			  <p align="justify"> 
			   O padrão de projeto Observer é responsável por observar e notificar a mudança de estado entre objetos distintos através de uma dependência um-para-muitos. 
                     Este padrão de projeto utiliza basicamente duas classes: a que será observada (Subject ou Observable) e a observadora (Observer). As classes observadoras
                     devem implementar uma interface específica, já a classe que será observada implementa uma interface ou estende uma superclasse. O Observer é um padrão de 
                     projeto comportamental que permite que você defina um mecanismo de assinatura para notificar múltiplos objetos sobre quaisquer eventos que aconteçam com 
                     o objeto que eles estão observando.
			  </p>     
		</th>
		<th scope="col"><p align="justify">Princípio aberto/fechado. Você pode introduzir novas classes assinantes sem ter que mudar o código da publicadora (e vice versa se existe uma interface publicadora).
 Você pode estabelecer relações entre objetos durante a execução.
			  </p></th>
		</tr>
            <tr>
		 <th scope="col">Singliton</th>
              <th scope="col"> Anti padrao </th>     
		 <th scope="col">
			   <p align="justify"> 
			   O padrão de projeto Singleton é um padrão de projeto criacional que permite que você garanta que uma classe tenha apenas uma instância, enquanto fornece um
                     ponto de acesso global para essa instância. Em outras palavras, o padrão Singleton é usado quando você deseja ter certeza de que apenas uma instância de uma
                    classe será criada e usada em todo o seu código. O Singleton é um padrão de projeto muito útil, mas deve ser usado com cuidado, pois pode tornar o código difícil de                        testar.
		         </p>        
		 </th>
		 <th scope="col"> <p>oi </p>  </th>   
		 </tr>
		 <tr>
		 <th scope="col">Composite</th>
             <th scope="col"> <p align="justify">Pode ser difícil providenciar uma interface comum para
 classes cuja funcionalidade difere muito. Em certos cenários, você precisaria
 generalizar muito a interface componente, fazendo dela uma interface de difícil compreensão.
			  </p> </th>      
		 <th scope="col">
			   <p align="justify"> O padrão de projeto Composite é um padrão de projeto estrutural que permite que você trate objetos individuais e composições de objetos de maneira                         uniforme. O Composite é um  padrão de projeto muito útil quando você precisa criar uma estrutura de objetos em árvore. O padrão Composite define uma classe base                            para todos os componentes, bem como  classes para componentes folha e componentes compostos. Os componentes folha são objetos simples que não têm filhos, enquanto                          os componentes compostos são objetos que têm filhos. O Composite permite que você trabalhe com objetos em árvores de maneira uniforme, independentemente de serem                          objetos simples ou compostos
			  </p> 
		 </th>
		 <th scope="col"> <p align="justify">Você pode trabalhar com estruturas de árvore complexas mais convenientemente: utilize o polimorfismo e a recursão a seu favor.
 Princípio aberto/fechado. Você pode introduzir novos tipos de elemento na aplicação sem quebrar o código existente, o que agora funciona com a árvore de objetos.
			  </p> </th>
	  </tr>
	</thead>
 </table>
 </body>

