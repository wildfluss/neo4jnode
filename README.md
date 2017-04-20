# neo4jnode

Neo4j embedded in Java node (Erlang)

- ~~http://inaka.net/blog/2013/09/05/from-erlang-to-java-and-back-again-1/~~

- https://www.packtpub.com/books/content/working-neo4j-embedded-database

## TODO

- rebar3 compile (mvn)
- XXX release
    - start java node

## Build neo4jnode

`./mvn.sh package`

## Run

1. `epmd -d`
2. `java -jar priv/neo4jnode-1.0-SNAPSHOT.jar`
3. `rebar3 shell --sname emacs`
4. `(emacs@XXX)1> neo4j:query(foo).`

## Test

## Release

1. `rebar3 as prod tar`
2. copy `_build/prod/rel/neo4j/neo4j-0.1.0.tar.gz` to other node...







