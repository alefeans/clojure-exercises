(defn list_replication
  [num lst]
  (flatten (map #(repeat num %1) lst)))