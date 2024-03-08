void main() {
  String name = "Jemil Shikuri Hamza";
  int age = 22;
  String favoriteColor = "Red";

  print("My name is $name, I am $age years old, and my favorite color is $favoriteColor.");

}



void main() {
  const int speedOfLight = 299792458; // meters per second

  // Get user input for distance
  print("Enter the distance in meters:");
  double distance = double.parse(stdin.readLineSync()!);

  // Calculate time
  double time = distance / speedOfLight;

  print("It takes ${time.toStringAsFixed(9)} seconds for light to travel $distance meters.");
}
