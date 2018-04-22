# WesternTea

[![StackShare](https://img.shields.io/badge/tech-stack-0690fa.svg?style=flat)](https://stackshare.io/NatoBoram/western-tea)

If you run a server on your personal computer, you might notice sometimes that the server crashes and rolls back to a few hours before. The people on your server might be a little upset. In fact, if you let your server run for too long without shutting it down, it will crash, and that's sad for everyone.

This plugin will shutdown the server when the last man standing on the server quits and will set the time to 0 so the next people to come on the server will come in the morning.

**Features**
* Shutdown the server
* Set the time to 0

Before using this plugin, I recommend using a loop to start your server as it will shutdown frequently.
## Windows
``` Windows
@echo off
:x
    cls
    ping 127.0.0.1 > nul
    java -Xmx3G -d64 -jar spigot.jar nogui
goto x
```
## Linux
``` sh
#!/bin/bash
while :
do
    clear
    sleep 5
    java -Xmx3G -d64 -jar spigot.jar nogui
done
```
