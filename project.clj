(defproject org.clojars.bost/morse :lein-v
  :description "Telegram Bot API"
  :url "https://github.com/Bost/morse"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies
  [[org.clojure/clojure "1.11.1"]
   [org.clojure/tools.macro "0.1.5"]
   [org.clojure/core.async "1.5.648"]
   [org.clojure/tools.logging "1.2.4"]
   [org.clojure/spec.alpha "0.3.218"]
   [clj-stacktrace "0.2.8"]
   [org.clojure/tools.namespace "1.3.0"]
   [org.clojure/tools.nrepl "0.2.13"]
   [cheshire "5.11.0"]
   [clj-http "3.12.3"]]

  ;:main morse.main
  ;:repl-options {:init-ns morse.main}


  :plugins
  [;; testing, coverage tool
   [lein-cloverage "1.2.4"]

   ;; leiningen project versions from git
   [com.roomkey/lein-v "7.2.0"]]

  :profiles {:uberjar {:aot :all}}

  ;; Artifact deployment info
  :scm {:name "git"
        :url  "https://github.com/Bost/morse"}

  :release-tasks
  [["vcs" "assert-committed"]
   ["change" "version" "leiningen.release/bump-version" "patch"]
   ["change" "version" "leiningen.release/bump-version" "release"]
   ["vcs" "commit"]
   ["vcs" "tag"]
   ["deploy" "clojars"]]

  :deploy-repositories [["clojars" {:url "https://repo.clojars.org"
                                   :username "bost"
                                   :password :env/CLOJARS_TOKEN
                                   :sign-releases false}]]

  ;; :pom-addition [...] ;; TODO :pom-addition is probably not needed
  )
