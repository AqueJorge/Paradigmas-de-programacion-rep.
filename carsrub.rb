class Car #Define a class

	def initialize(marca, modelo, año, color) #Inizializer
		#instances variables
		@marca = marca
		@modelo = modelo
		@año = año
		@color = color
		
	end

	def Say() #Define a function to call the instance variables
		puts "The car is a" + "-" + @marca + "-"  + @modelo + "-" + "year" + "-" + @año + "-" + "and the color is" + "-"+ @color
	end
end


car1 = Car.new("Mazda", "3", "2019", "red")
car1.Say()

car2 = Car.new("BMW", "Serie 8 Coupé", "2020", "blue")
car2.Say()

car3 = Car.new("Toyota", "Prius", "2015", "black")
car3.Say()

car4 = Car.new("Pagani", "Huayra Pacchetto Tempesta", "2020", "red")
car4.Say()

gets()

