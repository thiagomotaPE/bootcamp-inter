
const pokemonList = document.getElementById('pokemonList')
const loadMoreButton = document.getElementById
('loadMoreButton')
const loadPokemonInfo = document.getElementById('loadInformation')

const maxRecords = 158
const limit = 10
let offset = 0;

function loadPokemonItens(offset, limit){
    
    pokeApi.getPokemons(offset, limit).then((pokemons = []) => {
        const newHtml = pokemons.map((pokemon) => 
            `<a id="loadInformation" href="pokemon-detail.html" class="linkPokemonDetail">
                <li class="pokemon ${pokemon.type}">

                    <span class="number">#${pokemon.number}</span>
                    <span class="name">${pokemon.name}</span>

                    <div class="detail">
                        <ol class="types">
                                ${pokemon.types.map((type) => `<li class="detail ${type}">${type}</li>`).join('')}
                        </ol>

                        <img src="${pokemon.photo}" alt="${pokemon.name}">
                    </div>
                </li>
            </a>
            `).join('')

            pokemonList.innerHTML += newHtml
    })
}

loadPokemonItens(offset, limit)

loadMoreButton.addEventListener('click', () => {
    offset += limit

    const qtdRecordNextPage = offset + limit

    if(qtdRecordNextPage >= maxRecords){
        const newLimit = maxRecords - offset 
        loadPokemonItens(offset, limit)
        loadMoreButton.parentElement.removeChild(loadMoreButton)
    }else{
        loadPokemonItens(offset, limit)
    }
})

loadPokemonInfo.addEventListener('click', () => {
    loadPokemonInformation(offset, limit)
})
