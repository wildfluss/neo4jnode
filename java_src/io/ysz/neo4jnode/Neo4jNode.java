// -*- mode: Java; c-basic-offset: 2; -*-

package io.ysz.neo4jnode;

import com.ericsson.otp.erlang.*;

import org.neo4j.graphdb.factory.*;

public class Neo4jNode {
  public static void main(String[] args) throws java.io.IOException {

    GraphDatabaseFactory graphDbFactory = new GraphDatabaseFactory();

    // OtpConnection.trace = 4;

    OtpNode node = new OtpNode("neo4j");
    OtpMbox mbox = node.createMbox("neo4j");

    OtpErlangObject o;
    OtpErlangTuple msg;
    OtpErlangPid from;
    
    while (true) {
      try {
        o = mbox.receive();
        System.out.println("a message");
        if (o instanceof OtpErlangTuple) {
          msg = (OtpErlangTuple)o;
          from = (OtpErlangPid)(msg.elementAt(0));

          // Send a message to a remote pid from
          mbox.send(from,msg.elementAt(1));
        }
      } 
      catch (Exception e) {
        System.out.println("" + e);
      }
    } 

  }
}

        


