(ns mais-sobre-mapas.core)

(conj [1 23] 4)
(conj [1 2 3] 4 5)
(conj [1 2 3] "4")
(conj [1 2 3] [4 5])
(pop [1 2 3])
(peek [1 2 3])

;; Simulando uma função que retonar as compras dao cliente
(defn compras
  []
  {:tomate {:quantidade 2, :preco 5}
   :arroz {:quantidade 1, :preco 4}
   :feijao {:quantidade 2, :preco 7}})

;; Para adicionar um novo conjunto chave/valor a um mapa, usando outro mapa para isso
(conj (compras) {:alface {:quantidade 2, :preco 8}})

;; Para associar uma chave a um mapa
(assoc (compras) :alface {:quantidade 2, :preco 8})

;; Para desassociar/remover uma chave a um mapa
(dissoc (compras) :tomate :arroz)

;; O assoc também serve para alterar valores das chaves de um mapa
(assoc (compras) :tomate {:quantidade 5, :preco 7})

;; O update serve para atualizar um valor de uma determinada chave de um mapa
;; O terceiro parâmetro do update é uma função de primeira ordem
(update {:nome "José Augusto", :idade 20} :idade inc)

;; Para fazer o mesmo que o update sendo que para um mapa de mapas,
;; como o exemplo das compras (mapa dentro de um mapa)
;; incrementa o valor do tomate em 50%
(update-in (compras) [:tomate :preco] * 1.5)
