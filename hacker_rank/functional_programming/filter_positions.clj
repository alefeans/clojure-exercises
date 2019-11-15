;; This was my first solution without knowing
;; some awesome functions from stdlib.
;;
;; (defn filter-positions
;;   [lst]
;;   (->> (map-indexed vector lst)
;;        (filter #(odd? (first %1)))
;;        (map #(println (second %1)))))


(defn filter-positions
  [lst]
  (take-nth 2 (rest lst)))
