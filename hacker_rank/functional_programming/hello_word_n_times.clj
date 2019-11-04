(defn hello_word_n_times [n]
  (when-not (= n 0 )
    (println "Hello World")
    (recur (dec n))))


(def n (Integer/parseInt (read-line)))
(hello_word_n_times n)
