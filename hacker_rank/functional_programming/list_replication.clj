(defn list-replication
  [num lst]
  (flatten (map #(repeat num %1) lst)))
