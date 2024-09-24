from flask import Flask, render_template, request, redirect, url_for

appLogin = Flask(__name__)

@appLogin.route('/')  # This route will handle requests to the root URL
def login():
    return render_template('login.html')

@appLogin.route('/login', methods=['Post'])
def handle_login():
    username = request.form["username"]
    password = request.form["password"]

    if username == "admin" and password == "password":
        # return f"Welcome, {username}"
        return redirect(url_for('show_dashboard'))
    else:
        return "Invalid Credental! Pleae try again.."

@appLogin.route('/dashboard')
def show_dashboard():
    return render_template("dashboard.html")

if __name__ == '__main__':
    appLogin.run(port=5001,debug=True)  #run function will call automatically to the homepage because @app.route/ can change the port no also