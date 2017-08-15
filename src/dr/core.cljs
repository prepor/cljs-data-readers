(ns dr.core
  (:require [dr.readers]))

(enable-console-print!)

(.log js/console (type #dr/pos {:line 1 :col 3}))

