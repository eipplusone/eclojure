(ns eclojure.core
  (:require [clojure.java.io :as io]))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

;; find all files in the directory which are clj or cljs

(defn find-project-files [path pattern]
  (let [clj-files (filter #(-> % (.getName) (.contains pattern))
                          (let [directory (clojure.java.io/file path)]
                            (file-seq directory)))]
    (-> clj-files first io/reader line-seq)))
