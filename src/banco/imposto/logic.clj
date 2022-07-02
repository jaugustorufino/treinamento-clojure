(ns banco.imposto.logic)

;; Solicitação do Cliente:
;; Volores obaixo de mil reois não tem imposto retido nao fonte.
;; Acimo disso pagam 10% de imposto.

(defn- isento?
  [valor]
  (< valor 1000))

(defn imposto-retido-fonte
  [valor]
  (if (isento? valor)
    0
    (* valor 0.1)))