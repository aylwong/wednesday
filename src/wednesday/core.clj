(ns wednesday.core
  (:use clojure.string)
  (:use clojure.java.io))

(defn parseCommas [x] (split x #"\,"))

(defn parseLines [x] (split x #"\r\n"))

(defn parseCsvFromString [theString] 
  (map parseCommas (parseLines theString)))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn readFile [filename]  (slurp filename))

(defn parseFile [filename] (parseCsvFromString (readFile filename)))
