import random

nums = [random.randint(1,46) for x in range(6)]
# nums = random.sample(range(1,46),6)
nums.sort()
print(nums)