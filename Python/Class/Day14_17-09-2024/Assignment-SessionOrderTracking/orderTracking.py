from builtins import set

from flask import Flask, render_template, request, redirect, url_for,session
orderTracking = Flask(__name__)
orderTracking.secret_key = 'secret'

@orderTracking.route('/')  # This route will handle requests to the root URL
def homePage():
    return render_template('homepage.html')

@orderTracking.route('/shipping', methods=['Post'])
def shipping():
    pname = request.form["pname"]
    quantity = int(request.form["quantity"])
    session['pname'] = pname
    session['quantity'] = quantity
    return render_template('shipping.html')

@orderTracking.route('/orderSummary', methods=['Post'])
def sunmmary():
    name = request.form["name"]
    address = request.form["address"]
    contact = int(request.form["contact"])

    return render_template("orderSummary.html", pname = session.get('pname'), quantity = session.get("quantity"), name = name,address = address ,contact = contact )


@orderTracking.route('/confirmOrder', methods=['Post'])
def confirmOrder():
    return render_template('confirmOrder.html')


#
# @orderTracking.route('/result')
# def result(result):
#
#     return result

if __name__ == '__main__':
    orderTracking.run(port=5001,debug=True)  #run function will call automatically to the homepage because @app.route/ can change the port no also