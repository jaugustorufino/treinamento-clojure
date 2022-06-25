(ns treinamento-clojure.core)

(defn taxa-de-entrega
  ;"Se o valor da compra for até 100, deve-se cobrar 15 reais de entrega.
  ; Se for maior que 100 e menor que 200, deve-se cobrar 5 reais de entrega..
  ; Se for acima de 200, a taxa é gratuita."
  [valor-da-compra]
  (cond (<= valor-da-compra 100) 15
        (<= valor-da-compra 200) 5
        :else 0))

