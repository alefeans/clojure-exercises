(ns exercises.hacker-rank.functional-programming.sum-odd-elements)

(defn sum-odd-elements
  [lst]
  (reduce + (filter odd? lst)))
