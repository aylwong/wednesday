(ns wednesday.core-test
  (:use clojure.test
        wednesday.core))

(comment Test if a string with two commas becomes a 3 item list of strings)
(deftest parseCommas-Test
  (testing "The string did not parse into a list of 3 strings"
    (is (= ["This", "is", "test"] (parseCommas "This,is,test")))))

(comment Test if we are properly parsing new lines)
(deftest parseLines-Test
  (testing "Lines were not properly parsed"
    (is (= ["this, is", "a, test"] (parseLines "this, is\r\na, test")))))

(comment Test if the function that glues parseCommas and parseLines works )
(deftest parseCsvFromString-Test
  (testing "Could not properly parse commas within each line"
    (is (= [["this", "is"], ["a", "test"]] (parseCsvFromString "this,is\r\na,test")))))

(comment Test for readFile, if we can read a file into something)
(deftest readFile-Test
  (testing "Could not read example file"
      (is (= "this,is,a,test\r\nthis,is,line,two\r\nthree,should,be,last,line" (readFile "D:\\Projects\\Clojure\\Wednesday\\test\\testfile.txt")))))


  (comment Test if sending a filename we can read the strings from it)
  (deftest readFile-Test
    (testing "The file wasnt parsed properly"
      (is (= [["this", "is", "a", "test"], ["this", "is", "line", "two"], ["three", "should", "be", "last", "line"]] (parseFile "D:\\Projects\\Clojure\\Wednesday\\test\\testfile.txt")))))





