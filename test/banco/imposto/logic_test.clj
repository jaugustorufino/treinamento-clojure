(ns banco.imposto.logic-test
  (:require [clojure.test :refer :all]
            [banco.imposto.logic :as l]))

;; Solicitação do Cliente:
;; Volores obaixo de mil reois não tem imposto retido nao fonte.
;; Acimo disso pagam 10% de imposto.

(deftest imposto-retido-fonte-test
  (testing "Um valor abaixo de 1000 reais não deve ter imposto retido."
    (is (= 0 (l/imposto-retido-fonte 1)))
    (is (= 0 (l/imposto-retido-fonte 999.99))))
  (testing "Um valor igual ou superior a 1000 reais, deve ter um imposto retido de 10%"
    (is (= 100.00 (l/imposto-retido-fonte 1000)))))