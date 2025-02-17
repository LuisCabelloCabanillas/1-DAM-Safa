parejas = [( 1, 'b'), (2, 'a'), (4, 'd'), (3, 'c')]
ordenadas = sorted(parejas,)
print(ordenadas)

parejas = [( 1, 'b'), (2, 'a'), (4, 'd'), (3, 'c')]
ordenadas = sorted(parejas, key=lambda x: x[1])
print(ordenadas)