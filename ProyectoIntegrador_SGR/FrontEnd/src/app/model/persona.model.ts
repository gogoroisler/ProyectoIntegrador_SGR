//**declaracion de clase persona toma datos desde base de datos */

/**parametros de clase persona*/
export class persona{
  id?: number;
  nombre: String;
  apellido: String;
  img: String;

  /**construccion de la clase persona*/
  constructor(nombre: String,apellido: String,img: String){
    this.nombre= nombre;
    this.apellido=apellido;
    this.img= img;
  }

}
