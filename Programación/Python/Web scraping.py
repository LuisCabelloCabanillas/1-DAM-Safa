import requests
from bs4 import BeautifulSoup

url = 'https://www.padelchiquito.com/mejores-palas-2025/'
response = requests.get(url)
soup = BeautifulSoup(response.text, 'html.parser')

nom_palas= soup.find_all('h3' , class_='text-lg font-bold sm:text-xl md:text-2xl')
valo_palas=soup.find_all('span' , class_='font-medium')
for pala in nom_palas:
    print(pala.text)
for valo in valo_palas:
    print(valo.text)

url2='https://www.riotgames.com/es'
responde= requests.get(url2)
Beuti=BeautifulSoup(responde.text, 'html.parser')

Principìo= Beuti.find_all('p')
for ps in Principìo:
    print(ps.text)