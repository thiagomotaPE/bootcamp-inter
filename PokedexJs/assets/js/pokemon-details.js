const pokemonInformation = document.getElementById("pokemonInformation")

const limit = 10
let offset = 0;

function loadPokemonInformation(offset, limit){
    
    pokeApi.getPokemons(offset, limit).then((pokemons = []) => {
        const newHtml = pokemons.map((pokemon) => 
            `
            <header id="pokemonId">
                <h1>${pokemon.name}</h1>
                <span>#${pokemon.number}</span>
            </header>

            <!--tipos do pokemon-->
            <section id="pokemonDetails">
                ${pokemon.types.map((type) => `<p class="type ${type}">${type}</p>`).join('')}
            </section>
            
            <!--foto do pokemon-->
            <section id="pokemonImg">
                <img src="${pokemon.photo}" alt="${pokemon.name}">
            </section>

            <!--descrição detalhada do pokemon-->
            <section id="pokemonDescription">
                <ol class="listDetails">
                    <li>Species ${pokemon.specie}</li>
                    <li>Height ${pokemon.height}</li>
                    <li>Weight ${pokemon.weight}</li>
                    ${pokemon.abilities.map((ability) => `<li ${ability}">${ability}</li>`).join('')}
                </ol>
            </section>
            `).join('')

            pokemonInformation.innerHTML += newHtml
    })
}