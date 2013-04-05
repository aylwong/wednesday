(ns wednesday.core-test
  (:use clojure.test
        wednesday.core))

(comment Test if a string with two commas becomes a 3 item list of strings)
(deftest parseCommas-Test
  (testing "The string did not parse into a list of 3 strings"
    (is (= ["This", "is", "test"] (parseCommas "This,is,test")))))
