#!/bin/bash
LIB_DIR=`erl -noshell -eval 'io:format("~s", [code:lib_dir()]), init:stop().'`
# XXX
JINTERFACE_VERSION=1.7.1
mvn -Dlib_dir=$LIB_DIR -Djinterface.version=$JINTERFACE_VERSION $@

