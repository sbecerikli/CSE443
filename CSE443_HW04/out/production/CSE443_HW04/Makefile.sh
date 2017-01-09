#!/bin/sh
javac Dijkstra/*.java
javac GraphAll/*.java
javac RMI_Client/*.java
javac RMI_Server/*.java
javac RemoteIF/*.java

rmic RMI_Client.Client
rmic RMI_Server.Server

rmiregistry
