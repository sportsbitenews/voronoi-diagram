(ns voronoi-diagram.core-test
  (:require [clojure.test :refer :all]
            [voronoi-diagram.core :refer :all]))

(deftest center-of-triangle-test
  (is (= [10 10]
         (center-of-triangle [[30 0] [0 0] [0 30]]))))


(deftest sort-triangles-test
  (is (= [[[0 0] [5 5] [10 0]] [[10 0] [5 5] [5 -5]] [[5 -5] [5 5] [2 2]]]
         (sort-triangles [[[0 0] [5 5] [10 0]]
                          [[5 -5] [5 5] [2 2]]
                          [[10 0] [5 5] [5 -5]]]))))


(deftest diagram-test
  (is (= {:points [[2.0 2.0] [1.0 4.0] [4.0 1.0] [-10.0 -10.0] [-10.0 10.0] [10.0 10.0] [10.0 -10.0]],
          :cells [[[2.3333333333333335 2.3333333333333335] [-2.3333333333333335 -1.3333333333333333] [-1.3333333333333333 -2.3333333333333335]] [[5.0 5.0] [2.3333333333333335 2.3333333333333335] [-2.3333333333333335 -1.3333333333333333] [-6.333333333333333 1.3333333333333333] [0.3333333333333333 8.0]] [[5.0 5.0] [2.3333333333333335 2.3333333333333335] [-1.3333333333333333 -2.3333333333333335] [1.3333333333333333 -6.333333333333333] [8.0 0.3333333333333333]] [[-2.3333333333333335 -1.3333333333333333] [-6.333333333333333 1.3333333333333333]] [[-6.333333333333333 1.3333333333333333] [0.3333333333333333 8.0]] [[5.0 5.0] [8.0 0.3333333333333333]] [[8.0 0.3333333333333333] [1.3333333333333333 -6.333333333333333]]],
          :edges [[[-2.3333333333333335 -1.3333333333333333] [2.3333333333333335 2.3333333333333335]] [[-2.3333333333333335 -1.3333333333333333] [-1.3333333333333333 -2.3333333333333335]] [[-1.3333333333333333 -2.3333333333333335] [2.3333333333333335 2.3333333333333335]] [[2.3333333333333335 2.3333333333333335] [5.0 5.0]] [[-6.333333333333333 1.3333333333333333] [-2.3333333333333335 -1.3333333333333333]] [[-6.333333333333333 1.3333333333333333] [0.3333333333333333 8.0]] [[0.3333333333333333 8.0] [5.0 5.0]] [[-1.3333333333333333 -2.3333333333333335] [1.3333333333333333 -6.333333333333333]] [[1.3333333333333333 -6.333333333333333] [8.0 0.3333333333333333]] [[5.0 5.0] [8.0 0.3333333333333333]]]}
         (diagram [[2 2] [1 4] [4 1] [-10 -10] [-10 10] [10 10] [10 -10]]))))
