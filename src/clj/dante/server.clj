(ns dante.server
  (:require [dante.handler :refer [app]]
            [config.core :refer [env]]
            [ring.adapter.jetty :refer [run-jetty]])
  (:gen-class))

(defn -main [& args]
  (let [port (Integer/parseInt (or (env :port) #_"80" "3000"))]
    (run-jetty app {:port port :join? false})))
