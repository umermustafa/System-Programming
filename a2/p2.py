import requests
from bs4 import BeautifulSoup

next_page = []
links = []


def pages(pgurl, inp):
    for i in range(5):
        pgurl = nextpage(pgurl)
    for link in next_page:
        all_links(link, inp)

def all_links(url, word):
    req = requests.get(url)
    if req.status_code == 200:
        parser_obj = BeautifulSoup(req.content, "lxml")
        a_list = parser_obj.find_all("a")
        for obj in a_list:
            if word in obj.get_text():
                links.append(obj["href"])

def nextpage(url):
    req = requests.get(url)
    if req.status_code == 200:
        parse_obj = BeautifulSoup(req.content, "lxml")
        obj1 = parse_obj.find("a",{"class":"page-link"})
        if obj1['href'] not in next_page:
            next_page.append(obj1['href'])
        obj2 =  parse_obj.find_all("span", {"class":"page-link"})
        if len(obj2) == 1:
       	  for i in obj2:
                obj3 = i.findChild()
		print obj3['href']
                return obj3['href']
        else:
       	 obj2 = obj2[1:]
         for i in obj2:
                obj3 = i.findChild()
		print obj3['href']
                return obj3['href']
        




def all_links(url, word):
    req = requests.get(url)
    if req.status_code == 200:
        parser_obj = BeautifulSoup(req.content, "lxml")
        a_list = parser_obj.find_all("a","p")
        for obj in a_list:
            if word in obj.get_text():
                links.append(obj["href"])




url = "https://propakistani.pk/category/sports/"
inpt = raw_input("Enter Word to find : ")
pages(url, inpt)
print(links)

