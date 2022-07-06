(ns funcoes-primeira-ordem.core)

(defn consulta-taxa-padrao-por-http
      "Simula a obtenção do valor da taxa padrão."
      []
      0.30)

(defn consulta-taxa-padrao-fixa
  []
  0.10)

(defn imposto-retido
      "Se salario abaixo de 1000 reais nao tem imposto. Acima ou igual a 1000 deve aplicar imposto padrão"
      [consulta-taxa-padrao salario]
      (if (< salario 1000)
        0
        (* salario (consulta-taxa-padrao))))

(defn escolhe-consulta-taxa-padrao
  [ambiente]
  (if (= ambiente :teste)
    consulta-taxa-padrao-fixa
    consulta-taxa-padrao-por-http))

;; Funções Anônimas
;; Usadas como parâmetro para outras funções
;; Cerquilha (#) usado para criar uma função anônima

((fn [x] (* 2 x)) 8)

(#(* 2 %) 5)

(#(+ % %) 2)

((fn [x y] (+ x y)) 8 9)

(#(+ %1 %2) 8 9)

;; Criação de uma nova função que sempre retorna uma const
((constantly 0.2) 2 312 12312 1212.2)

(imposto-retido (constantly 0.27) 3000)