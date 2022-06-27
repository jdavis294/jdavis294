from collections import deque

def main():
    main_queue=deque()
    max_queue=deque()

    n=int(input("Enter number of elements that you want to add to queue look up  'must be int value' \n amount of numbers:"))

    for i in range(n):
        element=int(input("Enter Element: "))
        main_queue.append(element)

    for i in range(len(main_queue)):
        max_queue.append(main_queue[i])
        if main_queue[-1] > main_queue[i]:
            max_queue.remove(main_queue[i])

    print("original queue: ",main_queue)
    print("maximum look up:",max_queue)






if __name__ == '__main__':
    main()