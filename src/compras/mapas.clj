(ns compras.mapas)

;; Carrinho de Compras
(defn compras
  []
  {:tomate {:quantidade 2, :preco 3.2}
   :feijao {:quantidade 1, :preco 7.5}
   :arroz {:quantidade 2, :preco 5.8}})

;; 3 formas de buscar um conjunto chave-valor em um mapa
;(get (compras) :tomate)
;((compras) :tomate)
;(:tomate (compras)) * Melhor forma

;; Forma de buscar dentro do mapa
;(:preco (:tomate (compras)))

;; Quando pode não haver a chave no mapa
;(:batata (compras) {:quantidade 0, :preco 0.0})