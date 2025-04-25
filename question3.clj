(def filepath "./temperatures.txt")
(def rows (clojure.string/split (slurp filepath) #"\n"))
(def celsius (map (fn [x] (/ (* 5 (- (Double/parseDouble x) 32)) 9) ) rows ))

(defn avg [x] (double (/ (reduce + x) (count x) )))
(println "min = "(apply min celsius))
(println "max = "(apply max celsius))
(println "average = " (avg celsius))
