(defn sum-odd-elements
  [lst]
  (reduce + (filter odd? lst)))
