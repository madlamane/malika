//console.log("Hello");

let pokObject={
    "name":"fake",
    "image":"https://i0.wp.com/onlydinosaurs.com/wp-content/uploads/2021/07/Pokemon-Fossil-Museum.jpg",
    "type":"fake"


}

DOMManipulation(pokObject);


function DOMManipulation(pokemon) {
    document.getElementById("pokemonName").innerText = pokemon.name;
    let pokeImg = document.getElementById("pokemonImg");
    pokeImg.setAttribute("src",pokemon.image);
    document.getElementById("pokemonType").innerText = pokemon.type;



}
document.getElementById("pokemonSubmit").addEventListener('click',getPokemon);

function getPokemon(){
    console.log("I am getting the pokemon");
    const BASE_POKEMON_URL = "https://pokeapi.co/api/v2/pokemon/";

    let pokemonId = document.getElementById("pokemonId").value;

    let pokeURL = BASE_POKEMON_URL + pokemonId;
    console.log(pokeURL);

}