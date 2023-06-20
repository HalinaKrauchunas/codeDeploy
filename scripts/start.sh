PID=$(ps -ef | grep demo-0.0.1-SNAPSHOT.jar | grep -v grep | awk '{print $2}')
if [ -n "$PID" ]; then
  kill $PID
fi
cd /opt/myproject/build/libs
java -jar demo-0.0.1-SNAPSHOT.jar > /dev/null 2> /dev/null < /dev/null &
