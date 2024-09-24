def masking_sensitive_info(info,info_type):
    try:
        if info_type == 'Email':
            name, domain_name = info.split('@')
            masked_email = name[0] + '*' * 3 + name[-1] + '@' + domain_name
            print("Email:", masked_email)

        else:
            p1, p2, p3, p4 = info.split(' ')
            masked_card = '*' * 4 + ' ' + '*' * 4 + ' ' + '*' * 4 + ' ' + p4
            print("Credit Card:", masked_card)
    except ValueError:
        print("Entered the wrong Value")



Credit_card = '1234 5678 9101 1121'
email_str = "Mayura.kumari@xyz.com"

masking_sensitive_info(email_str, 'Email')
masking_sensitive_info(Credit_card, 'Credit_card')

# print(result)