(ns funcoes-primeira-ordem.core)

(defn imposto-retido
      "Se salario abaixo de 1000 reais nao tem imposto. Acima ou igual a 1000 deve aplicar imposto padrão"
      [salario]
      (let [imposto-padrao 0.2]
           (if (< salario 1000)
             0
             (* salario imposto-padrao))))

(defn consulta-taxa-padrao-por-http
      ""
      []
      0.30)

(defn imposto-retido
      "Se salario abaixo de 1000 reais nao tem imposto. Acima ou igual a 1000 deve aplicar imposto padrão"
      [salario]
      (if (< salario 1000)
        0
        (* salario (consulta-taxa-padrao-por-http))))

(defn imposto-retido
      "Se salario abaixo de 1000 reais nao tem imposto. Acima ou igual a 1000 deve aplicar imposto padrão"
      [taxa-padrao salario]
      (if (< salario 1000)
        0
        (* salario taxa-padrao)))

(imposto-retido (consulta-taxa-padrao-por-http) 10)