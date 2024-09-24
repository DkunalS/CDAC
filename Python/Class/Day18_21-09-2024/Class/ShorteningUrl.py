class URLShortner:
    def __init__(self):
        self.dict = {}

    def add_url(self, orig_url):
        if orig_url not in self.dict:
            count = len(self.dict) + 1
            base_url = "http://short.url/"
            self.dict[orig_url] = base_url + str(count)
        else:
            print("This url is already exist")

    def view_url(self):
        for orig, short in self.dict.items():
            print(f"{orig} --->{short}")


uRLShortner = URLShortner()
uRLShortner.add_url("https://example.com")
uRLShortner.view_url()
# dict = {}
# count = len(dict)+1
# print(count)
