import practice

# data = print(practice)
#
#


def write_function(data):
    with open("text1.txt", mode="a", encoding="utf-8") as file:
        file.write(data)
    print(f"Data written into file")

data = ""
write_function(data)
# write_function()



def generate_report(*args, title = "report", **kwargs):
    global data
    data += f"{title} \n{'='*50}\n"
    # print()
    # print(args)
    # print(kwargs)
    # for i in kwargs:
    data += f"Author: {kwargs['Author']}\n"
    data += f"Date: {kwargs['Date']}\n{'='*50}\n"

    data += f"Report Section: \n{'-'*15}\n"
    data += f"Section 1: {args[0]}\n"
    data +=f"Section 2: {args[2]}\n"
    write_function(data)


section1 = "Overview of sales"
section2 = "breakdown of sales data by region"
section3 = "analysis of current market trends"


generate_report(section1, section2, section3,
                title = "Monthly Sales Report",
                Author = "John Doe", Date = "October 2024",
                conclusion = "overall, sales have increased by 15%")