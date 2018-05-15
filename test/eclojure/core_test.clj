(ns eclojure.core-test
  (:require [clojure.test :refer :all]
            [eclojure.core :as core]
            [clojure.java.io :as io]))

(deftest find-project-files
  (is (= '(foo "bar") (-> (core/find-project-files "resources/fixtures/sample-project" "clj") first io/reader line-seq first read-string))))

