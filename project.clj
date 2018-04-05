(defproject morse "0.4.3"
  :description "Telegram Bot API"

  :url "https://github.com/lispers/morse/"

  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/tools.macro "0.1.5"]
                 [org.clojure/core.async "0.2.374"]
                 [org.clojure/tools.logging "0.3.1"]
                 [org.clojure/spec.alpha "0.1.143"]
                 [clj-stacktrace "0.2.8"]
                 [org.clojure/tools.namespace "0.2.11"]
                 [org.clojure/tools.nrepl "0.2.12"]
                 ]

  ;:main morse.main
  ;:repl-options {:init-ns morse.main}

  :plugins [[lein-cloverage "1.0.10"]]

  :profiles {:uberjar {:aot :all}}

  ;; Artifact deployment info
  :scm {:name "git"
        :url  "https://github.com/otann/morse"}

  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}

  :release-tasks [["vcs" "assert-committed"]
                  ["change" "version" "leiningen.release/bump-version" "patch"]
                  ["change" "version" "leiningen.release/bump-version" "release"]
                  ["vcs" "commit"]
                  ["vcs" "tag"]
                  ["deploy" "clojars"]]

  :pom-addition [:developers [:developer
                              [:name "Akaki Tkemaladze"]
                              [:url "http://c-base.xyz"]
                              [:email "kaki.tk@gmail.com"]
                              [:timezone "+3"]]])
