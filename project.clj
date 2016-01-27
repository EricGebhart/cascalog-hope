(defproject cascalog_hope "1.0.0-SNAPSHOT"
  :description "sample code for cascalog on hadoop, a new hope"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [cascalog "2.1.1"]
                 [clojure-csv "2.0.1"]
                 [clj-json "0.5.3"]
                 ]
  :jvm-opts ["-Xms768m" "-Xmx768m"]
  :profiles { :dev {:dependencies [[org.apache.hadoop/hadoop-core "1.2.1"]]}})
