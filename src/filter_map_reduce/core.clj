(ns filter-map-reduce.core)

;; Imagine que tenhamos um vetor de números onde cada número representa o
;; ano que o estudante está.
;; Exemplo: [5 6 6] ; Temos 1 estudante no quinto ano e dois no sexto.

;; DESAFIO 1: crie uma função que recebe este vetor como entrada e retorna a
;; quantidade de estudantes que estão no quinto ano.

(defn quinta-serie?
  [ano]
  (= ano 5))

(defn quantidade-estudantes-quinta-serie
  [series-estudantes]
  (count (filter quinta-serie? series-estudantes)))

(quantidade-estudantes-quinta-serie [5 6 5 4 5 3 8])
