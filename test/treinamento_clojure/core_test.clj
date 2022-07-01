(ns treinamento-clojure.core-test
  (:require [clojure.test :refer :all]
            [treinamento-clojure.core :refer :all]))

(deftest taxa-de-entrega-test
  (testing "Valor da compra for até 100, deve-se cobrar 15 reais de entrega"
    (is (= 15 (taxa-de-entrega 1)))
    (is (= 15 (taxa-de-entrega 100))))
  (testing "Valor da compra maior que 100 e até 200, deve-se cobrar 5 reais de entrega"
    (is (= 5 (taxa-de-entrega 100.01)))
    (is (= 5 (taxa-de-entrega 200))))
  (testing "Valor da compra acima de 200, a taxa é gratuita"
    (is (= 0 (taxa-de-entrega 200.01)))
    (is (= 0 (taxa-de-entrega 201)))
    (is (= 0 (taxa-de-entrega 34223)))))

(deftest terceiro-nome-test
  (testing "Vetor comum"
    (is (= "João" (retorna-terceiro-nome ["José" "Augusto" "João" "Maria"]))))
  (testing "Vetores inválidos"
    (is (= "Não é possível" (retorna-terceiro-nome nil)))
    (is (= "Não é possível" (retorna-terceiro-nome [])))))