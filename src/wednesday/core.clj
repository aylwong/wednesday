(ns wednesday.core
	(:use clojure.string))

(defn parseCommas [x] (split x #"\,"))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))