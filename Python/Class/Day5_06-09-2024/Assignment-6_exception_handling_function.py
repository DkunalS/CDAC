

# def int_input(num):
#     try:
#         if int(num):
#            print("It is number")
#     except ValueError:
#          print(" Value Error Exception")
#

"""dhtusyudgydhsuighisyhuigsiuryh"""
def get_element_from_list(list1):
    """ghsdgihiadghdarrrrrrrrrr"""
    try:
        # list1:
        print(f"list element is {list1[4]/4}")
    except IndexError:
         print(" Index is out of bound")
    except TypeError:
        print("Type Error Exception")
    else:
        print("No Exceptions Occur")
    finally:
        print("Operation is Complete")


# int_input("jghdg")
get_element_from_list([5,6,9,8,'gdsg',2,6])



print(__doc__)
print(get_element_from_list.__doc__)