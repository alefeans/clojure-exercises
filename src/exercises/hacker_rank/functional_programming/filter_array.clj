(defn filter-array [delim lst]
  (filter #(> delim %1) lst))
