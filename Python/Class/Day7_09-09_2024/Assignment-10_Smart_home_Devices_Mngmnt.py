from abc import ABC, abstractmethod

class SmartDevice(ABC):
    _name = ""
    _status = False

    @abstractmethod             #This method is abtract so we can't instantiate
    def turn_on(self):
        pass
    @abstractmethod
    def turn_off(self):
        pass

    def device_info(self):
        print("")

class SmartLight(SmartDevice):

    def __init__(self, name):
        self._name = name
        self._status = super()._status
    def turn_on(self):
        self._status = True
        return "Smart light is on now!!"

    def turn_off(self):
        self._status = False
        return "Smart light is off now!!"

    def device_info(self):
        print(f"{self._name}")


class SmartThermostat(SmartDevice):
    def __init__(self,name, temp):
        self._name = name
        self.temp =temp
        self._status = super()._status

    def turn_on(self):
        self._status = True
        return "\nSmart thermostat is ON!!\n"

    def turn_off(self):
        self._status = False
        return "\nSmart thermostat is off!!\n"

    def set_temp(self,temp):
        self.temp = temp
        return f"\nTemperature set to {temp}\n"

    def device_info(self):
        print(f"Device Type: {self.__class__.__name__}\n"
              f"Name is: {self._name}\n"
              f"Status is: {'on' if self._status else 'off'}\n"
              f"Temperature is: {self.temp}")
#
# smartLight = SmartLight("XYZ")
# print(smartLight.turn_on())
# print(smartLight.turn_off())
# smartLight.device_info()

smartThermoStat = SmartThermostat("abc",26)
smartThermoStat.device_info()
print(smartThermoStat.turn_on())
print(smartThermoStat.set_temp(22))
smartThermoStat.device_info()
print(smartThermoStat.turn_off())

# print(status)



