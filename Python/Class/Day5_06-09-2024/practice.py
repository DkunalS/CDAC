def generate_report(*args, title = "report", **kwargs):
    print(f"{title} \n{'='*50}")
    # print()
    # print(args)
    # print(kwargs)
    # for i in kwargs:
    print(f"Author: {kwargs['Author']}")
    print(f"Date: {kwargs['Date']}\n{'='*50}\n")

    print(f"Report Section: \n{'-'*15}\n")
    print(f"Section 1: {args[0]}")
    print(f"Section 2: {args[2]}")



section1 = "Overview of sales"
section2 = "breakdown of sales data by region"
section3 = "analysis of current market trends"

generate_report(section1, section2, section3, title = "Monthly Sales Report", Author = "John Doe", Date = "October 2024", conclusion = "overall, sales have increased by 15%"  )