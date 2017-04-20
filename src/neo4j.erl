-module(neo4j).
-author(ysz).
%% -compile([export_all]).
-export([query/1]).

query(XXX) ->
    {ok, Hostname} = inet:gethostname(),
    Str = lists:flatten(io_lib:format("neo4j@~s", [Hostname])),
    Node = list_to_atom(Str),
    Pid = {neo4j, Node},
    Pid ! {self(), ping},
    receive
        %% {neo4j, X} ->
        X ->
            io:format("received ~w~n", [X])
    after 
        5000 ->
            io:format("timeout~n")
    end.


