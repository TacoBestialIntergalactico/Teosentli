# Teosentli

Comentarios en los archivos JAVA de Prueba y en el Main Activity

Para que les aparezca el fragmento dento del mobile_navigation, necesitan ir al codigo y poner los datos 
de su fragmento y si quieren poner de inmediato la union entre el home y su fragmento escriban lo siguiente
        
CAMBIEN TODO LO QUE DIGA "PRUEBAS" POR EL NOMBRE DE SU FRAGMENTO, RESPETEN SI LA PRIMERA LETRA EMPIEZA CON MAYUSCULA O MINUSCULA (GRACIAS)

Este codigo es para establecer la conexion de home al fragmento, es importante de que si es su fragmento principal se conecte a home

<action
  android:id="@+id/action_nav_home_to_nav_pruebas2"
  app:destination="@id/nav_prueba" />

Este otro codigo es para dar de alta su fragmento en la navegacion, "ui.prueba.PruebaFragment" esta parte se encuentra en los codigos de java s

<fragment
        android:id="@+id/nav_prueba"
        android:name="MX.TeosentliTeam.teosentli.ui.prueba.PruebaFragment"
        android:label="@string/menu_teosentli"
        tools:layout="@layout/fragment_prueba" />

Para aguegar un layout nuevo con su fragmento solo copien el de prueba y cambien todo lo que diga "PRUEBA" por el nombre de su fragmento tambien
tengan en cuenta esta parte al principio "ui.prueba.PruebaFragment" ---> "ui.news.NewsFragment"
