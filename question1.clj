; in clojure, first is still a string, so you need to parse it first
(def n (Integer/parseInt (first *command-line-args*)))
(def squared (map (fn [x] (* x x)) (range 1 (+ n 1)) ))
(def sum (reduce + squared))
(doseq [x squared] (println x)) ; doseq is used to loop for side effects, like printing. goes through each element x in squared. 
(println "Sum =" sum)  
