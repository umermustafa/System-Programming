import requests
from bs4 import BeautifulSoup
import io
import os
import datetime


def get_links(url):

    req = requests.get(url)
    if req.status_code == 200:
        soup = BeautifulSoup(req.content, "lxml")
        pre = soup.find("pre")
        a_list = pre.findChildren()
        date = str(datetime.datetime.now().strftime("%y-%m-%d-%H-%M"))
        date += " Total Qari " + str(len(a_list)) + "\n"
        logfile(date)
        return a_list


def get_mp3(url):

    req = requests.get(url)
    if req.status_code == 200:
        soup = BeautifulSoup(req.content, "lxml")
        pre = soup.find("pre")
        a_list = pre.findChildren()
        return a_list[len(a_list)-27:len(a_list)]


def download_mp3(a_list, url):
    count = 1
    for a in a_list:
        href_link = a['href']
        logfile(str(datetime.datetime.now().strftime("%y-%m-%d-%H-%M")) + " Start processing " + str(count) + " of " + str(len(a_list)) + "\n")   
        logfile(str(datetime.datetime.now().strftime("%y-%m-%d-%H-%M")) + " " + str(href_link)[:-1] + "\n")  
        os.system("mkdir "+ href_link)
        mp3_1 = get_mp3(url + "/%s" %href_link )
        for i in mp3_1:
            logfile(str(datetime.datetime.now().strftime("%y-%m-%d-%H-%M")) + " " + str(href_link)[:-1] + " " + i['href'] + " Start" + "\n")  
            mp3_3 = requests.get(url + "/" + href_link + "/" + i["href"])
            with open(href_link + i['href'], 'wb') as writefile:
                writefile.write(mp3_3.content)
            logfile(str(datetime.datetime.now().strftime("%y-%m-%d-%H-%M")) + " " + str(href_link)[:-1] + " " + i['href'] + " End"+ "\n")  
        logfile(str(datetime.datetime.now().strftime("%y-%m-%d-%H-%M")) + " Merging  " + str(href_link)[:-1] + " Start "+ "\n")  
        os.system("mp3wrap " + href_link + "final.mp3 " + href_link + "*.mp3")
        logfile(str(datetime.datetime.now().strftime("%y-%m-%d-%H-%M")) + " Merging  " + str(href_link)[:-1] + " End "+ "\n")  
        count+=1


def logfile(string):
    file = open("file.txt", "a+")
    file.write(string)
    file.close()



url = "https://download.quranicaudio.com/quran/"
a_list = get_links(url)
download_mp3(a_list, url)


