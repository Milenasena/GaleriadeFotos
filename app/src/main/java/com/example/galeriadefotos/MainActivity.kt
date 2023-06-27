package com.example.galeriadefotos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.galeriadefotos.Dados.Listamoldura
import com.example.galeriadefotos.model.IdImagemDescricao
import com.example.galeriadefotos.ui.theme.GaleriaDeFotosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GaleriaDeFotosTheme {
               AppGaleria()

            }
        }
    }
}
@Composable
fun AppGaleria(){
    // A surface container using the 'background' color from the theme
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ){
        LazyColumn{
            items(Listamoldura().carregamoldura()){
                fotos-> Fotos(idImagemDescricao = fotos)
            }
        }
    }

}
@Composable
fun Fotos(
    idImagemDescricao: IdImagemDescricao
) {

    Card() {
        Column() {
            Image(
                painter = painterResource(id =idImagemDescricao.idImagem),
                contentDescription = null
            )
            Text(
                text = stringResource(id = idImagemDescricao.idDescricao) ,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.width(160.dp)

            )

        }
    }
}
@Preview
@Composable
fun PreviewFotos() {
    Fotos(idImagemDescricao = IdImagemDescricao(
        R.drawable.m1,
        R.string.descricao_m1
    )
    )
}