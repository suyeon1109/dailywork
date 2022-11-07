from haversine import haversine

lyon = (1, 32.785833) # (lat, lon)
paris = (1, 41.263889)

print(haversine(lyon, paris))