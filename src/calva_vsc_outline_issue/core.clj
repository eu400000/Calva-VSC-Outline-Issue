(ns calva-vsc-outline-issue.core
  (:gen-class))


(defn fA
  [a] 
  (inc a) 
  )

(defn fB
  [b] ;test not ok
  (dec b)) ;test ok


(def x 2)

(def y 3) ;test ok

;test ok