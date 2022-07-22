//**declaracion de clase persona toma datos desde base de datos */

/**parametros de clase persona*/
export class persona{
  id?: number;
  nombre: string;
  apellido: string;
  img: string;

  /**construccion de la clase persona*/
  constructor(nombre: string,apellido: string,img: string){
    this.nombre= nombre;
    this.apellido=apellido;
    this.img= img;
  }

}
