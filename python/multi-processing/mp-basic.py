from multiprocessing import Process
import time

# define funciton that will be operated
def hello(arg1):
    print("Hello World")

p1 = Process(target=hello, args=('123'))
p1.start() # process 시작
p1.join() # process 종료, 앞서 실행된 프로세스가 끝낭ㄹ때까지 대기하고 있다


'''
스레드: 부모 밑에서 돌고 있어서 도는 중에 종료가 불가능
프로세싱: 언제든지 죽일 수 있다. p1.terminate()
'''