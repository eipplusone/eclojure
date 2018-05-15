;; parse all the source files in a project, build an index, and start a server that responds to events.

;; read all the files into memory as datastructures. Then wait for query and respond to that query based on what the user has typed.

;; (reg-event-fx) would get all the items that start with that name. you can than add stuff and if it matches the next thing, it would just search for them, otherwise it adds to the entire thing.

;; Each top-level statement is essentially a transaction agaisnt the entirety of your codebase.

;; You could select a specefic statement either with avy or arrows

;; start a server http? or just tcp server connection and stuff. Communicate the payload. Nah just http server is fine.

;; what do I use for http server? compojure and the other stuff. or is it too heavy
