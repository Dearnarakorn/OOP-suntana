class Human:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def printname(self):
        print(self.name, self.age)
    
    #setter method
    def setName(self,name):
        self.name = name

    def setAge(self, age):
        if age < 0:
            print("Invalid age")
        else:
            self.age = age

    #getter method
    def getName(self):
        return self.name
    
    def getAge(self):
        return self.age


class Student(Human):
    def __init__(self, name, age, year):
        super().__init__(name, age)
        self._graduationyear = year

    def welcome(self):
        print("Welcome", self.name,"age ", self.age, "to the class of", self._graduationyear)
    
    #setter method
    def setName(self, name):
        return super().setName(name)

    def setAge(self, age):
        return super().setAge(age)

    def setYear(self,year):
        self._graduationyear = year

    #getter method
    def getName(self):
       return super().getName()
    
    def getAge(self):
        return super().getAge()

    def getYear(self):
        return self._graduationyear
    

x = Student("Yindee",18,2021)
x.setYear(2022)
x.setName("Yinda")
x.setAge(20)
print(x.getName())
print(x.getYear())
print(x.getAge())
