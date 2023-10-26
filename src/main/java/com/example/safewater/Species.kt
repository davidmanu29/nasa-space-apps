package com.example.myapplication

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.ModifierLocalReadScope
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.navigation.NavController
import com.example.nasaspaceapp.R


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel

class SpeciesViewModel : ViewModel() {
    val expandedItems = mutableStateOf<Set<Int>>(emptySet())

    fun toggleItem(id: Int) {
        expandedItems.value = if (id in expandedItems.value) {
            expandedItems.value - id
        } else {
            expandedItems.value + id
        }
    }
}

@Composable
fun Species(navController: NavController){

    Box(modifier = Modifier.fillMaxSize()){
        Image(painter = painterResource(id = R.drawable.valmare),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop)
    }

    val viewModel: SpeciesViewModel = viewModel()
    val expandedIds = viewModel.expandedItems.value
    val speciesList = remember { // Remember the speciesList
        listOf(
            SpeciesItem(
                title = "Beluga",
                description = "                   The Beluga whale critical habitat, which includes the Upper Estuary, the Saguenay River up to Sainte-Marguerite Bay, and the southern channel of the Lower Estuary, supports the vital functions of calving and rearing of the young. If you see one or many beluga whales or if they approach your vessel: logo keep your distance, move away and keep a distance of 400 metres between your vessel and the beluga whales, speed limit 5 to 10 knots in a black rectangle.",
                imageResourceId = R.drawable.imamgi1,
                imageResourceId2 = R.drawable.imag1v2,
                isExpanded = false,
                id = 0
            ),
            SpeciesItem(
                title = "Copper redhorse",
                description = "                   The copper redhorse (Moxostoma hubbsi) is a North American species of freshwater fish in the family Catostomidae. It is found only in Canada.The copper redhorse occurs primarily in medium-sized rivers where water temperatures exceed 20 °C in summer. Spawning occurs in riffle areas where the current is moderate to slow and the depth ranges between 0.75 and 2 m, over fine to coarse gravel and cobble substrate. Archaeological excavations provide evidence that the species was more abundant at various times in the past. Since the mid-1980s, its abundance relative to the other species in the genus has declined significantly. The population is aging and recruitment is extremely low. Telemetric monitoring has provided a way to map a significant part of the species’ habitat and identify the areas that need protection first.",
                imageResourceId = R.drawable.imagi2,
                imageResourceId2 = R.drawable.imagi2v2,
                isExpanded = false,
                id = 1
            ),
            SpeciesItem(
                title = "Lampreys",
                description = "                   Lampreys (Petromyzontidae) belong to a group of fish called Agnatha, which,according to the fossil record, are thought to be the oldest fishlike animal.Lampreys spawn in the spring after spending several months (if anadromous) moving to the cool, clear headwaters of streams to make their nests or redds. Both males and females create these pits in stream riffles by removing small rocks with their mouths and fanning smaller particles with their tails.",
                imageResourceId = R.drawable.imagi3,
                imageResourceId2 = R.drawable.imagi3v2,
                isExpanded = false,
                id = 2
            ),
            SpeciesItem(
                title = "The wolf eel",
                description = "                   The wolf eel (Anarrhichthys ocellatus) is a species of marine ray-finned fish belonging to the family Anarhichadidae, the wolf fishes. It is found in the North Pacific Ocean. Despite its common name and resemblance, it is not a true eel. It is the only species in the monotypic genus Anarrhichthys.Younger wolf eels are orange with big dark spots in the posterior part of the body. Once older they turn grey, brown greyish or dark olive.",
                imageResourceId = R.drawable.imagi4,
                imageResourceId2 = R.drawable.imagi4v2,
                isExpanded = false,
                id = 3
            ),
            SpeciesItem(
                title = "The pollan or Irish pollan ",
                description = "                   The pollan or Irish pollan (Coregonus pollan or Coregonus autumnalis) is a freshwater whitefish known only from five Irish lakes, Lough Neagh, Lower Lough Erne, Lough Ree, Lough Derg and Lough Allen. The pollan faces competition from introduced species such as pike, roach and zebra mussel, and the populations rely on restocking for survival.The Irish pollan and other members of the Coregonus genus are very like herrings in appearance but the presence of an adipose fin distinguishes them. The mouth is relatively small and the teeth are deciduous and very small. The scales are of moderate size, the dorsal fin is of moderate length and the tail fin deeply forked. The different species are difficult to tell apart unless the lake from which they originated is known. This species grows to an average length of 9 to 10 in (22.9 to 25.4 cm) and a weight of 6 ounces (170 g).",
                imageResourceId = R.drawable.imagi5,
                imageResourceId2 = R.drawable.imagi5v2,
                isExpanded = false,
                id = 4
            ),
            SpeciesItem(
                title = "The huchen",
                description = "                   The huchen (Hucho hucho) (/ˈhuːxən/, from German), also known as Danube salmon or redfish (German: Rotfisch), is a large species of freshwater fish in the family Salmonidae native to the Danube basin in Central and Eastern Europe. It is the type species of genus Hucho (a.k.a. the taimens), being closely related (in the same subfamily) to salmon, trout, char and lenoks.This permanent freshwater salmonid spawns in April, once water reaches a temperature of 6 to 9 °C (43 to 48 °F). For spawning, the huchen migrates up the river and enters small and shallow affluents, where females excavate depressions in the gravel into which they deposit their eggs, then a male releases a cloud of sperm and the female then covers the eggs with sand. Larvae hatch 30 to 35 days after fertilization.There is a considerable effort to produce huchen fry commercially and to reintroduce the species into the wild with moderate to good success. This requires catching the adults just before spawning and keeping them in special tanks. Fry are released in appropriate places once they have reached 4 to 10 cm.",
                imageResourceId = R.drawable.imagi6,
                imageResourceId2 = R.drawable.imagi6v2,
                isExpanded = false,
                id = 5
            ),
            SpeciesItem(
                title = "The brook trout ",
                description = "                   The brook trout (Salvelinus fontinalis) is a species of freshwater fish in the char genus Salvelinus of the salmon family Salmonidae. It is native to Eastern North America in the United States and Canada, but has been introduced elsewhere in North America, as well as to Iceland, Europe, and Asia. In parts of its range, it is also known as the eastern brook trout, speckled trout, brook charr, squaretail, brookie or mud trout, among others.The brook trout has a dark green to brown color, with a distinctive marbled pattern (called vermiculation) of lighter shades across the flanks and back and extending at least to the dorsal fin, and often to the tail.In addition to chemical pollution and algae growth caused by runoff containing chemicals and fertilizers, air pollution has also been a significant factor in the disappearance of brook trout from their native habitats. In the U.S., acid rain caused by air pollution has resulted in pH levels too low to sustain brook trout in all but the highest headwaters of some Appalachian streams and creek.",
                imageResourceId = R.drawable.imagi7,
                imageResourceId2 = R.drawable.imagi7v2,
                isExpanded = false,
                id = 6
            ),
            SpeciesItem(
                title = "The coelacanth",
                description = "                   The coelacanth - a species of fish considered extinct with the dinosaurs, 66 million years ago, but which was unexpectedly discovered in 1938, off the east coast of South Africa - continues to surprise scientists, reports Reuters. A team of researchers has found in a new study that these large, nocturnal, deep-dwelling fish have a lifespan of about five times longer than previously thought - about a century - and that females have a gestation period of five years, the longest among animals. Analyzing one of the two living species of coelacanth, scientists also determined that the rate of development and growth of these creatures is the slowest observed in any other fish, and sexual maturity is only reached at about 55 years .",
                imageResourceId = R.drawable.imagi8,
                imageResourceId2 = R.drawable.imagi8v2,
                isExpanded = false,
                id = 7
            ),
            SpeciesItem(
                title = "The grey reef shark",
                description = "                   The grey reef shark (Carcharhinus amblyrhynchos, sometimes misspelled amblyrhynchus or amblyrhinchos)[2] is a species of requiem shark, in the family Carcharhinidae. One of the most common reef sharks in the Indo-Pacific, it is found as far east as Easter Island and as far west as South Africa. This species is most often seen in shallow water near the drop-offs of coral reefs. It has the typical \"reef shark\" shape, with a broad, round snout and large eyes. It can be distinguished from similar species by the plain or white-tipped first dorsal fin, the dark tips on the other fins, the broad, black rear margin on the tail fin, and the lack of a ridge between the dorsal fins. Most individuals are less than 1.88 m.The Grey Reef Shark has a streamlined, moderately stout body with a long, blunt snout and large, round eyes. The upper and lower jaws each have 13 or 14 teeth (usually 14 in the upper and 13 in the lower). The upper teeth are triangular with slanted cusps, while the bottom teeth have narrower, erect cusps.",
                imageResourceId = R.drawable.imagi9,
                imageResourceId2 = R.drawable.imafi9v2,
                isExpanded = false,
                id = 8
            ),
            SpeciesItem(
                title = "The night shark",
                description = "                   The night shark (Carcharhinus signatus) is a species of requiem shark, in the family Carcharhinidae, found in the temperate and tropical waters of the Atlantic Ocean. An inhabitant of the outer continental shelf and upper continental slope, this shark most commonly occurs at depths of 50–600 m (160–1,970 ft) and conducts a diel vertical migration, spending the day in deeper water and moving into shallower waters at night. Off northeastern Brazil, large numbers congregate around seamounts of varying depths. A slender, streamlined species, the night shark typically reaches a length of 2 m (6.6 ft). It can be identified by its long, pointed snout and large, green eyes (when alive), and is dark grayish blue or brown above and white below.The distribution of the night shark extends along the outer continental shelves and upper continental slopes of the Atlantic Ocean, from the U.S. state of Massachusetts to Argentina in the west, including the Gulf of Mexico and the Caribbean Sea, and from Senegal to northern Namibia in the east. In United States waters, it is relatively common off North Carolina and Florida (particularly the Florida Straits) and rarer elsewhere. There are questionable reports of this species off the Pacific coast of Panama.",
                imageResourceId = R.drawable.imagi10,
                imageResourceId2 = R.drawable.imagi10v2,
                isExpanded = false,
                id = 9
            )

            // Add more items here...
        )
    }
    SpeciesList(speciesList, expandedIds, viewModel::toggleItem)

}

data class SpeciesItem(
    val title: String,
    val description: String,
    val imageResourceId: Int,
    val imageResourceId2 : Int,
    var isExpanded : Boolean,
    val id : Int
)

@Composable
fun SpeciesList(speciesList: List<SpeciesItem>, expandedIds: Set<Int>, onToggle: (Int) -> Unit) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                text = "Species",
                fontSize = 50.sp,
                style = TextStyle(
                    fontFamily = FontFamily.SansSerif,
                    color = Color(0xFF226600)
                )
            )
        }

        items(speciesList) { speciesItem ->
            val isExpanded = speciesItem.id in expandedIds
            SpeciesItemCard(speciesItem, isExpanded) {
                onToggle(speciesItem.id)
            }
        }
    }
}

@Composable
fun SpeciesItemCard(speciesItem: SpeciesItem, isExpanded: Boolean, onToggle: () -> Unit) {
    Spacer(modifier = Modifier.height(30.dp))

    Surface(
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Row(modifier = Modifier.padding(24.dp)) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(bottom = if (isExpanded) 100.dp else 0.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = speciesItem.title,
                    fontSize = 20.sp,
                    style = TextStyle(fontFamily = FontFamily.SansSerif),
                    color = Color(0xFFffcc00),
                    textAlign = TextAlign.Center
                )

                if (isExpanded) {
                    Text(text = "                                             ")
                    Image(
                        painter = painterResource(id = speciesItem.imageResourceId),
                        contentDescription = null,

                    )
                    Text(text = "                                                 ${speciesItem.description}")
                    Image(
                        painter = painterResource(id = speciesItem.imageResourceId2),
                        contentDescription = null,
                        )
                }
            }
            ElevatedButton(
                onClick = onToggle
            ) {
                Text(if (isExpanded) "Show less" else "Show more")
            }
        }
    }
}