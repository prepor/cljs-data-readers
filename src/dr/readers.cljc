(ns dr.readers)

(defrecord Position [line col])

(defn make-position [x]
  (map->Position [x]))
