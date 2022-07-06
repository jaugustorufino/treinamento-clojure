(ns filter-map-reduce.core)

;; Imagine que tenhamos um vetor de números onde cada número representa o
;; ano que o estudante está.
;; Exemplo: [5 6 6] ; Temos 1 estudante no quinto ano e dois no sexto.

;; DESAFIO 1: crie uma função que recebe este vetor como entrada e retorna a
;; quantidade de estudantes que estão no quinto ano.

(defn quantidade-estudantes-quinta-serie
  [series-estudantes]
  (count (filter #(= 5 %) series-estudantes)))

;; DESAFIO 2: crie uma função que recebe um vetor de idades e retorna a soma.
;; Ex: (soma-das-idades [ 5 10 5 ]) ; deve retornar 20

(defn soma-das-idades
  [idades]
  (reduce + idades))

;; DESAFIO 3: crie uma função que recebe um vetor de nomes e retorne o
;; tamanho médio dos nomes.
;; Ex: (tamanho-medio-dos-nomes ["Marcio" "João"]) ; deve retornar 5
;; ["Marcio" "Joao"] -> [6 4] -> 5

(defn tamanho-medio-dos-nomes
  [nomes]
  (/ (reduce + (map count nomes)) (count nomes)))




