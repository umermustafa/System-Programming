import psutil
import sys
from datetime import datetime
import time
print "Process id",sys.argv[1]

pid=int(sys.argv[1])

process=psutil.Process(pid)

pname=process.name()

print "Process Name",pname

print "Process Status",process.status()

print "PPID",process.ppid()

parent=psutil.Process(process.ppid())

print "Parent Name",parent.name()

print "Creation Time"
print datetime.fromtimestamp(process.create_time()).strftime("%a,%b,%d,%Y %I:%M:%S")
print str(time.ctime(process.create_time()))
print "Files opened by the process",process.open_files()

print "Memeory Info",process.memory_info()
