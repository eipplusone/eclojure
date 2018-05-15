(ns eclojure.core
  (:require [clojure.java.io :as io]))

;; find all files in the directory which are clj or cljs

(defn find-project-files [path pattern]
  (filter #(-> % (.getName) (.contains pattern))
          (let [directory (clojure.java.io/file path)]
            (file-seq directory))))

(reduce (fn [map file]
          (assoc map (.getName file) (-> file
                                         io/reader line-seq)))
        {}
        (find-project-files "." "clj"))

()
