(ns exercises.hacker-rank.functional-programming.list-length)

(defn list-length
  [lst]
  (reduce (fn [n _] (inc n)) 0 lst))
