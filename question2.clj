(ns taxation) 
(defn tax [x y] (* x (/ y 100.0))) 

(ns application)  
(use 'taxation) 
(println (tax 117 7))
