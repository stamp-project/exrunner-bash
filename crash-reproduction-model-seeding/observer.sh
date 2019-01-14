pid=$1
Timeout=1200 # 20 minutes (Vibes+ Botsing)
sleep "$Timeout"
kill "$pid"
