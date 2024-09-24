import pandas as pd
from flask import Flask, render_template, request

webCSV = Flask(__name__)

@webCSV.route('/')  # This route will handle requests to the root URL
def homePage():
    return render_template('homepage.html')

@webCSV.route('/statistics', methods=['POST'])
def statistics():
    filePath = request.form['filepath']
    filePath = filePath.strip('"')  # Remove any surrounding quotes
    print(filePath)
    df = pd.read_csv(rf"{filePath}")  # Use raw string to handle backslashes
    print(df.describe())
    table = df.to_html(classes='data', header="true")  # Convert DataFrame to HTML
    return render_template('statistics.html', table=table)

if __name__ == '__main__':
    webCSV.run(port=5001, debug=True)
