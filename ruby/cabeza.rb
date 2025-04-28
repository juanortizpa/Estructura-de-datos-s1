require 'time'

def imprimir_encabezado
  # Datos del encabezado
  nombre = "Juan Ortiz"
  campus = "Campus Cali, U. Cooperativa de Colombia"
  repositorio_git = "https://github.com/juanortizpa/Estructura-de-datos-s1"

  # Obtener la fecha y hora actual
  fecha_hora = Time.now.strftime("%d/%m/%Y %H:%M:%S")

  # Imprimir el encabezado
  puts "+----------------------------------------"
  puts "| 👤 Nombre: #{nombre}"
  puts "| 🎓 Campus: #{campus}"
  puts "| 📅 Fecha y hora: #{fecha_hora}"
  puts "| 📂 Repositorio Git: #{repositorio_git}"
  puts "+----------------------------------------"
  puts
end
