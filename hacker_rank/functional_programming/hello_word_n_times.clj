(defn hello_word_n_times 
  [n]
  (loop [count 0]
    (when (not= count n)
      (println "Hello World")
    (recur (inc count)))))
  
  
  (def n (Integer/parseInt (read-line)))
  (hello_word_n_times n)