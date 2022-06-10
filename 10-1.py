#1
import time

now = time.localtime()
time.strftime('%Y년 %m월 %d일', now)


#2
import datetime
now = datetime.datetime.now()
print (str(now.year)+'년 '+str(now.month)+'월 '+str(now.day)+'일')
print (str(now.hour)+':'+str(now.minute)+':'+str(now.second))