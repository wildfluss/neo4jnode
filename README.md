# neo4jnode

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






