package org.eclipse.jakarta;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;


@Named /* Bir Managed Bean olduğunu söylüyoruz. Default olarak sınıf adının camelCase formatında oluşturulur.

* ".xhtml" de çağırıp kullanmak için bu anotasyonu kullanmak zorundayız.

@Named(value = "HelloWorld")  Bean'ın ismini değiştirmek için bu şekilde istediğimiz değeri atayabiliriz.
 */
@SessionScoped // Burada oluşturulan beanin yaşam süresini belirtiyoruz.
public class Hello implements Serializable {

    private String message = "Hello World!!";

    //Değeri okuyup yazabilmek için getter ve setter methodlarına ihtiyacımız var.
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
