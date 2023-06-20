PID=$(ps -ef | grep demo-0.0.1-SNAPSHOT.jar | grep -v grep | awk '{print $2}')
if [ -n "$PID" ]; then
  kill $PID
fi