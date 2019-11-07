(defn filter_array [delim lst]
  (filter #(> delim %1) lst))
