import requests
import json
import time

API_KEY = '17BJZ6D6NEI8XRPQ'

BASE_URL = "https://www.alphavantage.co/query"


def get_stock_data(symbol, interval="5min"):
    """Функција која собира податоци за акции од Alpha Vantage API"""
    params = {
        'function': 'TIME_SERIES_INTRADAY',  
        'symbol': symbol,  
        'interval': interval,  
        'apikey': API_KEY  
    }

    response = requests.get(BASE_URL, params=params)

    if response.status_code == 200:
        data = response.json()

        if f"Time Series ({interval})" in data:
            print(json.dumps(data[f"Time Series ({interval})"], indent=4))
        else:
            print(f"Нема податоци за оваа акција или погрешен симбол: {symbol}")
    else:
        print(f"Грешка при повикување на API: {response.status_code}")

    time.sleep(60)


symbol = "AAPL"
get_stock_data(symbol)
