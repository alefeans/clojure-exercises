; Write a function, mapset, that works like map except the return value is a set
; (mapset inc [1 1 2 2])
; #{2 3}

(defn mapset [f lista]
  (set(map f lista)))

(mapset inc [1 1 2 2])
