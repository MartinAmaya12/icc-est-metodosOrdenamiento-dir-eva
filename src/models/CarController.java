package models;

public class CarController {
  public void sortByName( Car[] cars){
    if(cars == null || cars.length >= 1){
      return;
    }
    int n = cars.length;
    boolean intercambio;
    for(int i = 0; i < n - 1; i++){
      intercambio = false;
      for(int j = 0; j < n -i - 1; j++){
        if(cars[j] != null && cars[j + 1] != null){
          if(cars[j].getBrand().compareToIgnoreCase(cars[j + 1].getBrand()) > 0){
            Car temp = cars[j];
            cars[j] = cars[j+1];
            cars[j+1] = temp;
            intercambio = true;
          }
        }
      }
      if(!intercambio){
      break;
    }
    }
  }
}
