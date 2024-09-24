from flask import Flask, render_template, request, redirect, url_for
survey = Flask(__name__)

@survey.route('/')  # This route will handle requests to the root URL
def homePage():
    return render_template('homepage.html')

@survey.route('/survey')
def checkAge():
    return render_template('survey.html')

@survey.route('/survey', methods=['Post'])
def check_age():
    fname = request.form["fname"]
    lname = request.form["lname"]
    age = int(request.form["age"])
    info = f"First Name: {fname}, Last Name: {lname}, Age: {age}"
    return render_template('result.html', Fname = fname, Lname = lname, Age = age)

    # if age >= 18:
    #     # return f"{name} is adult "
    #     return redirect(url_for('result',result = f"{name} is adult ") )
    # else:
    #     return f"user {name} is minor.."

# @survey.route('/result')
# def show_result(info):
#     # info = request.args.get('info')
#     return info

if __name__ == '__main__':
    survey.run(port=5001, debug=True)  #run function will call automatically to the homepage because @app.route/ can change the port no also