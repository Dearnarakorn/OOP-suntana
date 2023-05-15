class Human:
    def __init__(self,name,age,salary):
        #constructor
        self.name = name #public attribute
        self._age = age #protected attribute
        self.__sal = salary #private attribute

    def set_salary(self, salary):
        self.__sal = salary

    def get_salary(self):
        return self.__sal

obj1 = Human("dear",15,3000) 
print("The salary is ",obj1.get_salary)
