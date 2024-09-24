class bank_intrest_calc:
    __intrest_rate = 8.6
    __intrest_rate_seniorCitizen = 8.4

    def __init__(self,p_amount,duration,seniorCitizen_flag):
        self.p_amount = p_amount
        self.duration = duration
        self.seniorCitizen_flag = seniorCitizen_flag

    def simple_inrest_calc(self):
        if self.seniorCitizen_flag == "yes":
            si = (self.p_amount * self.duration * self.__intrest_rate_seniorCitizen)/100
            return si
        else:
            si = (self.p_amount * self.duration * self.__intrest_rate)/10

    def monthly_installment(self):
        EMI = (self.p_amount * self.__intrest_rate * (1 + self.__intrest_rate)**self.duration / self.duration - 1)
        return EMI


if __name__ == "__main__":

    bank_intrest_calc1 = bank_intrest_calc(5000,5,"yes")

    print(f"{bank_intrest_calc1.simple_inrest_calc()}")
    print(f"{bank_intrest_calc1.monthly_installment()}")
