from flask import Flask, render_template, request, redirect, url_for
ageChecker = Flask(__name__)

@ageChecker.route('/')  # This route will handle requests to the root URL
def homePage():
    return render_template('homepage.html')

@ageChecker.route('/forms')
def checkAge():
    return render_template('forms.html')

@ageChecker.route('/check_age', methods=['Post'])
def check_age():
    name = request.form["username"]
    age = int(request.form["age"])

    if age >= 18:
        # return f"{name} is adult "
        return redirect(url_for('result',result = f"{name} is adult ") )
    else:
        return f"user {name} is minor.."

@ageChecker.route('/result')
def result(result):

    return result

if __name__ == '__main__':
    ageChecker.run(port=5001,debug=True)  #run function will call automatically to the homepage because @app.route/ can change the port no also