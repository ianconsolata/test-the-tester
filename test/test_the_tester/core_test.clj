(ns test-the-tester.core-test
  (:require [clojure.test :refer :all]
            [test-the-tester.core :refer :all]))

(deftest a-test
  (testing "HELLO WORLD"
    (is (= 1 1))))
